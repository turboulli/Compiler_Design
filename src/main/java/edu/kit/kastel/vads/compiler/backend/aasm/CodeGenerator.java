package edu.kit.kastel.vads.compiler.backend.aasm;

import edu.kit.kastel.vads.compiler.backend.regalloc.Register;
import edu.kit.kastel.vads.compiler.backend.regalloc.RegisterAllocator;
import edu.kit.kastel.vads.compiler.ir.IrGraph;
import edu.kit.kastel.vads.compiler.ir.node.AddNode;
import edu.kit.kastel.vads.compiler.ir.node.BinaryOperationNode;
import edu.kit.kastel.vads.compiler.ir.node.Block;
import edu.kit.kastel.vads.compiler.ir.node.ConstIntNode;
import edu.kit.kastel.vads.compiler.ir.node.DivNode;
import edu.kit.kastel.vads.compiler.ir.node.ModNode;
import edu.kit.kastel.vads.compiler.ir.node.MulNode;
import edu.kit.kastel.vads.compiler.ir.node.Node;
import edu.kit.kastel.vads.compiler.ir.node.Phi;
import edu.kit.kastel.vads.compiler.ir.node.ProjNode;
import edu.kit.kastel.vads.compiler.ir.node.ReturnNode;
import edu.kit.kastel.vads.compiler.ir.node.StartNode;
import edu.kit.kastel.vads.compiler.ir.node.SubNode;
import edu.kit.kastel.vads.compiler.ir.node.BitwiseAndNode;
import edu.kit.kastel.vads.compiler.ir.node.BitwiseXorNode;
import edu.kit.kastel.vads.compiler.ir.node.BitwiseOrNode;
import edu.kit.kastel.vads.compiler.ir.node.ShiftLeftNode;
import edu.kit.kastel.vads.compiler.ir.node.ShiftRightNode;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static edu.kit.kastel.vads.compiler.ir.util.NodeSupport.predecessorSkipProj;

public class CodeGenerator {
    public String generateCode(RegisterAllocator allocator, List<IrGraph> program) {
        StringBuilder builder = new StringBuilder();

        builder
            .append(".global main\n")
            .append(".global _main\n")
            .append(".text\n");

        builder
            .append("main:\n").repeat(" ", 4)
            .append("call _main\n").repeat(" ", 4)
            .append("movq %rax, %rdi\n").repeat(" ", 4)
            .append("movq $0x3C, %rax\n").repeat(" ", 4)
            .append("syscall\n");

        for (IrGraph graph : program) {
            Map<Node, Register> registers = allocator.allocateRegisters(graph);
            builder.append("_").append(graph.name()).append(":\n");
            generateForGraph(graph, builder, registers);
        }

        return builder.toString();
    }

    private void generateForGraph(IrGraph graph, StringBuilder builder, Map<Node, Register> registers) {
        Set<Node> visited = new HashSet<>();
        scan(graph.endBlock(), visited, builder, registers);
    }

    private void scan(Node node, Set<Node> visited, StringBuilder builder, Map<Node, Register> registers) {
        for (Node predecessor : node.predecessors()) {
            if (visited.add(predecessor)) {
                scan(predecessor, visited, builder, registers);
            }
        }

        switch (node) {
            case AddNode add -> binary(builder, registers, add, "add");
            case SubNode sub -> binary(builder, registers, sub, "sub");
            case MulNode mul -> binary(builder, registers, mul, "mul");
            case DivNode div -> binary(builder, registers, div, "div");
            case ModNode mod -> binary(builder, registers, mod, "mod");
            case BitwiseAndNode bitwiseAnd -> binary(builder, registers, bitwiseAnd, "bitwiseAnd");
            case BitwiseXorNode bitwiseXor -> binary(builder, registers, bitwiseXor, "bitwiseXor");
            case BitwiseOrNode bitwiseOr -> binary(builder, registers, bitwiseOr, "bitwiseOr");
            case ShiftLeftNode shiftLeft -> binary(builder, registers, shiftLeft, "shiftLeft");
            case ShiftRightNode shiftRight -> binary(builder, registers, shiftRight, "shiftRight");
            case ReturnNode r -> builder.repeat(" ", 4)
                .append("movl ")
                .append(registers.get(predecessorSkipProj(r, ReturnNode.RESULT)))
                .append(", ")
                .append("%eax\n").repeat(" ", 4)
                .append("ret");
            case ConstIntNode c -> builder.repeat(" ", 4)
                .append("movl $")
                .append(c.value())
                .append(", ")
                .append(registers.get(c));
            case Phi _ -> throw new UnsupportedOperationException("phi");
            case Block _, ProjNode _, StartNode _ -> {
                // do nothing, skip line break
                return;
            }
        }
        builder.append("\n");
    }

    private static void binary(
        StringBuilder builder,
        Map<Node, Register> registers,
        BinaryOperationNode node,
        String opcode
    ) {
        if (opcode == "add") {
            builder.repeat(" ", 4)
                .append("movl ")
                .append(registers.get(predecessorSkipProj(node, BinaryOperationNode.LEFT)))
                .append(", ")
                .append("%edi")
                .append("\n").repeat(" ", 4)

                .append("movl ")
                .append(registers.get(predecessorSkipProj(node, BinaryOperationNode.RIGHT)))
                .append(", ")
                .append("%esi")
                .append("\n").repeat(" ", 4)

                .append("movl %edi, %edx")
                .append("\n").repeat(" ", 4)

                .append("addl %esi, %edx")
                .append("\n").repeat(" ", 4)

                .append("movl %edx, ")
                .append(registers.get(node));
        } else if (opcode == "sub") {
            builder.repeat(" ", 4)
                .append("movl ")
                .append(registers.get(predecessorSkipProj(node, BinaryOperationNode.LEFT)))
                .append(", ")
                .append("%edi")
                .append("\n").repeat(" ", 4)

                .append("movl ")
                .append(registers.get(predecessorSkipProj(node, BinaryOperationNode.RIGHT)))
                .append(", ")
                .append("%esi")
                .append("\n").repeat(" ", 4)

                .append("movl %edi, %edx")
                .append("\n").repeat(" ", 4)

                .append("subl %esi, %edx")
                .append("\n").repeat(" ", 4)

                .append("movl %edx, ")
                .append(registers.get(node));
        } else if (opcode == "mul") {
            builder.repeat(" ", 4)
                .append("movl ")
                .append(registers.get(predecessorSkipProj(node, BinaryOperationNode.LEFT)))
                .append(", ")
                .append("%edi")
                .append("\n").repeat(" ", 4)

                .append("movl ")
                .append(registers.get(predecessorSkipProj(node, BinaryOperationNode.RIGHT)))
                .append(", ")
                .append("%esi")
                .append("\n").repeat(" ", 4)

                .append("movl %edi, %edx")
                .append("\n").repeat(" ", 4)

                .append("imull %esi, %edx")
                .append("\n").repeat(" ", 4)

                .append("movl %edx, ")
                .append(registers.get(node));
        } else if (opcode == "div") {
            builder.repeat(" ", 4)
                .append("movl ")
                .append(registers.get(predecessorSkipProj(node, BinaryOperationNode.LEFT)))
                .append(", ")
                .append("%edi")
                .append("\n").repeat(" ", 4)

                .append("movl ")
                .append(registers.get(predecessorSkipProj(node, BinaryOperationNode.RIGHT)))
                .append(", ")
                .append("%esi")
                .append("\n").repeat(" ", 4)

                .append("movl %edi, %eax")
                .append("\n").repeat(" ", 4)

                .append("cltd")
                .append("\n").repeat(" ", 4)
                .append("idivl ")
                .append("%esi")

                .append("\n").repeat(" ", 4)
                .append("movl ")
                .append("%eax")
                .append(", ")
                .append(registers.get(node));
        } else if (opcode == "mod") {
            builder.repeat(" ", 4)
                .append("movl ")
                .append(registers.get(predecessorSkipProj(node, BinaryOperationNode.LEFT)))
                .append(", ")
                .append("%edi")
                .append("\n").repeat(" ", 4)

                .append("movl ")
                .append(registers.get(predecessorSkipProj(node, BinaryOperationNode.RIGHT)))
                .append(", ")
                .append("%esi")
                .append("\n").repeat(" ", 4)

                .append("movl %edi, %eax")
                .append("\n").repeat(" ", 4)

                .append("cltd")
                .append("\n").repeat(" ", 4)
                .append("idivl ")
                .append("%esi")

                .append("\n").repeat(" ", 4)
                .append("movl ")
                .append("%edx")
                .append(", ")
                .append(registers.get(node));
        } else if (opcode == "bitwiseAnd") {
            builder.repeat(" ", 4)
                .append("movl ")
                .append(registers.get(predecessorSkipProj(node, BinaryOperationNode.LEFT)))
                .append(", ")
                .append("%edi")
                .append("\n").repeat(" ", 4)

                .append("movl ")
                .append(registers.get(predecessorSkipProj(node, BinaryOperationNode.RIGHT)))
                .append(", ")
                .append("%esi")
                .append("\n").repeat(" ", 4)

                .append("movl %edi, %edx")
                .append("\n").repeat(" ", 4)

                .append("andl %esi, %edx")
                .append("\n").repeat(" ", 4)

                .append("movl %edx, ")
                .append(registers.get(node));
        } else if (opcode == "bitwiseXor") {
            builder.repeat(" ", 4)
                .append("movl ")
                .append(registers.get(predecessorSkipProj(node, BinaryOperationNode.LEFT)))
                .append(", ")
                .append("%edi")
                .append("\n").repeat(" ", 4)

                .append("movl ")
                .append(registers.get(predecessorSkipProj(node, BinaryOperationNode.RIGHT)))
                .append(", ")
                .append("%esi")
                .append("\n").repeat(" ", 4)

                .append("movl %edi, %edx")
                .append("\n").repeat(" ", 4)

                .append("xorl %esi, %edx")
                .append("\n").repeat(" ", 4)

                .append("movl %edx, ")
                .append(registers.get(node));
        } else if (opcode == "bitwiseOr") {
            builder.repeat(" ", 4)
                .append("movl ")
                .append(registers.get(predecessorSkipProj(node, BinaryOperationNode.LEFT)))
                .append(", ")
                .append("%edi")
                .append("\n").repeat(" ", 4)

                .append("movl ")
                .append(registers.get(predecessorSkipProj(node, BinaryOperationNode.RIGHT)))
                .append(", ")
                .append("%esi")
                .append("\n").repeat(" ", 4)

                .append("movl %edi, %edx")
                .append("\n").repeat(" ", 4)

                .append("orl %esi, %edx")
                .append("\n").repeat(" ", 4)

                .append("movl %edx, ")
                .append(registers.get(node));
        } else if (opcode == "shiftLeft") {
            builder.repeat(" ", 4)
                .append("movl ")
                .append(registers.get(predecessorSkipProj(node, BinaryOperationNode.LEFT)))
                .append(", ")
                .append("%edi")
                .append("\n").repeat(" ", 4)

                .append("movl ")
                .append(registers.get(predecessorSkipProj(node, BinaryOperationNode.RIGHT)))
                .append(", ")
                .append("%esi")
                .append("\n").repeat(" ", 4)

                .append("movl %edi, %edx")
                .append("\n").repeat(" ", 4)

                .append("movl %esi, %ecx")
                .append("\n").repeat(" ", 4)

                .append("sall %cl, %edx")
                .append("\n").repeat(" ", 4)

                .append("movl %edx, ")
                .append(registers.get(node));
        } else if (opcode == "shiftRight") {
            builder.repeat(" ", 4)
                .append("movl ")
                .append(registers.get(predecessorSkipProj(node, BinaryOperationNode.LEFT)))
                .append(", ")
                .append("%edi")
                .append("\n").repeat(" ", 4)

                .append("movl ")
                .append(registers.get(predecessorSkipProj(node, BinaryOperationNode.RIGHT)))
                .append(", ")
                .append("%esi")
                .append("\n").repeat(" ", 4)

                .append("movl %edi, %edx")
                .append("\n").repeat(" ", 4)

                .append("movl %esi, %ecx")
                .append("\n").repeat(" ", 4)

                .append("sarl %cl, %edx")
                .append("\n").repeat(" ", 4)

                .append("movl %edx, ")
                .append(registers.get(node));
        } else {
            throw new UnsupportedOperationException(opcode);
        }
    }
}
