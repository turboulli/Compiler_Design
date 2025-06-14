package edu.kit.kastel.vads.compiler.lexer;

import edu.kit.kastel.vads.compiler.Span;

public record Operator(OperatorType type, Span span) implements Token {

    @Override
    public boolean isOperator(OperatorType operatorType) {
        return type() == operatorType;
    }

    @Override
    public String asString() {
        return type().toString();
    }

    public enum OperatorType {
        ASSIGN_MINUS("-="),
        MINUS("-"),
        ASSIGN_PLUS("+="),
        PLUS("+"),
        MUL("*"),
        ASSIGN_MUL("*="),
        ASSIGN_DIV("/="),
        DIV("/"),
        ASSIGN_MOD("%="),
        MOD("%"),
        ASSIGN("="),
        BITWISE_NOT("~"),
        BITWISE_AND("&"),
        ASSIGN_BITWISE_AND("&="),
        BITWISE_XOR("^"),
        ASSIGN_BITWISE_XOR("^="),
        BITWISE_OR("|"),
        ASSIGN_BITWISE_OR("|="),
        SHIFT_LEFT("<<"),
        ASSIGN_SHIFT_LEFT("<<="),
        SHIFT_RIGHT(">>"),
        ASSIGN_SHIFT_RIGHT(">>="),
        ;

        private final String value;

        OperatorType(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }
    }
}
