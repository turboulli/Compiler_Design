package edu.kit.kastel.vads.compiler;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CompilerTest {
    String generateAssembly(String input) {
        return "";
    }

    @Test
    public void test() {
        String input = """
        int main() {
            return 0;
        }
        """;

        String expectedOutput = """
        function main {
          %0 = const 0
          ret %0
        }""";

        assertEquals(expectedOutput, generateAssembly(input));
    }
}
