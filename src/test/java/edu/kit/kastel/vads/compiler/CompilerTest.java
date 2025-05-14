package edu.kit.kastel.vads.compiler;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;

public class CompilerTest {
    String generateAssembly(String input) {
        return "";
    }

    @Test
    @Disabled
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
