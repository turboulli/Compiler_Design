package edu.kit.kastel.vads.compiler.backend.aasm;

import edu.kit.kastel.vads.compiler.backend.regalloc.Register;

public record HardwareRegister(String name) implements Register {
    @Override
    public String toString() {
        return "%" + name();
    }
}
