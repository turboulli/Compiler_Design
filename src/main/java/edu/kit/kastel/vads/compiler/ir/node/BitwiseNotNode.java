package edu.kit.kastel.vads.compiler.ir.node;

public final class BitwiseNotNode extends UnaryOperationNode {
    public BitwiseNotNode(Block block, Node operand) {
        super(block, operand);
    }
}
