package edu.kit.kastel.vads.compiler.backend.aasm;

import edu.kit.kastel.vads.compiler.backend.regalloc.Register;

public record StackRegister(int id) implements Register {
    @Override
    public String toString() {
        return "8+4*" + id() + "(%rsp)";
    }
}
