package edu.kit.kastel.vads.compiler.backend.aasm;

import edu.kit.kastel.vads.compiler.backend.regalloc.Register;
import edu.kit.kastel.vads.compiler.backend.regalloc.RegisterAllocator;
import edu.kit.kastel.vads.compiler.ir.IrGraph;
import edu.kit.kastel.vads.compiler.ir.node.Block;
import edu.kit.kastel.vads.compiler.ir.node.Node;
import edu.kit.kastel.vads.compiler.ir.node.ProjNode;
import edu.kit.kastel.vads.compiler.ir.node.ReturnNode;
import edu.kit.kastel.vads.compiler.ir.node.StartNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.List;

public class PoorMansRegisterAllocator implements RegisterAllocator {
    private int id;
    private final Map<Node, Register> registers = new HashMap<>();
    private final List<String> availableRegisters = new ArrayList<>();

    public PoorMansRegisterAllocator() {
        //this.availableRegisters.add("eax"); // used for return value
        this.availableRegisters.add("ebx");
        this.availableRegisters.add("ecx");
        //this.availableRegisters.add("edx"); // used for modulo
        this.availableRegisters.add("esi");
        this.availableRegisters.add("edi");
        this.availableRegisters.add("ebp");
        this.availableRegisters.add("esp");
        this.availableRegisters.add("r8d");
        this.availableRegisters.add("r9d");
        this.availableRegisters.add("r10d");
        this.availableRegisters.add("r11d");
        this.availableRegisters.add("r12d");
        this.availableRegisters.add("r13d");
        this.availableRegisters.add("r14d");
        this.availableRegisters.add("r15d");
    }

    @Override
    public Map<Node, Register> allocateRegisters(IrGraph graph) {
        Set<Node> visited = new HashSet<>();
        visited.add(graph.endBlock());
        scan(graph.endBlock(), visited);
        return Map.copyOf(this.registers);
    }

    private void scan(Node node, Set<Node> visited) {
        for (Node predecessor : node.predecessors()) {
            if (visited.add(predecessor)) {
                scan(predecessor, visited);
            }
        }
        if (needsRegister(node)) {
            if (this.id < this.availableRegisters.size()) {
                this.registers.put(node, new HardwareRegister(this.availableRegisters.get(this.id)));
                ++this.id;
            } else {
                throw new UnsupportedOperationException("Register with id " + Integer.toString(this.id) + " not available");
            }
        }
    }

    private static boolean needsRegister(Node node) {
        return !(node instanceof ProjNode || node instanceof StartNode || node instanceof Block || node instanceof ReturnNode);
    }
}
