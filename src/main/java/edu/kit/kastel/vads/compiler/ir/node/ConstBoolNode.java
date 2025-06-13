package edu.kit.kastel.vads.compiler.ir.node;

public final class ConstBoolNode extends Node {
    private final boolean value;

    public ConstBoolNode(Block block, boolean value) {
        super(block);
        this.value = value;
    }

    public boolean value() {
        return this.value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ConstBoolNode c) {
            return this.block() == c.block() && c.value == this.value;
        }
        return false;
    }

    @Override
    protected String info() {
        return "[" + this.value + "]";
    }
}
