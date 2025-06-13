package edu.kit.kastel.vads.compiler.ir.node;

public sealed abstract class UnaryOperationNode extends Node permits BitwiseNotNode {
    public static final int OPERAND = 0;

    protected UnaryOperationNode(Block block, Node operand ) {
        super(block, operand);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof UnaryOperationNode unaryOperation)) {
            return false;
        }
        return obj.getClass() == this.getClass()
            && block() == unaryOperation.block()
            && this.predecessor(OPERAND) == unaryOperation.predecessor(OPERAND);
    }

    @Override
    public int hashCode() {
        int h = block().hashCode() * 31;
        h += (predecessorHash(this, OPERAND) * 31) ^ this.getClass().hashCode();
        return h;
    }
}
