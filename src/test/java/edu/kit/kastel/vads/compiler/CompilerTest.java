package edu.kit.kastel.vads.compiler;

import edu.kit.kastel.vads.compiler.backend.aasm.CodeGenerator;
import edu.kit.kastel.vads.compiler.ir.IrGraph;
import edu.kit.kastel.vads.compiler.ir.SsaTranslation;
import edu.kit.kastel.vads.compiler.ir.optimize.LocalValueNumbering;
import edu.kit.kastel.vads.compiler.lexer.Lexer;
import edu.kit.kastel.vads.compiler.parser.Parser;
import edu.kit.kastel.vads.compiler.parser.TokenSource;
import edu.kit.kastel.vads.compiler.parser.ast.FunctionTree;
import edu.kit.kastel.vads.compiler.parser.ast.ProgramTree;
import edu.kit.kastel.vads.compiler.semantic.SemanticAnalysis;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class CompilerTest {
    String generateAssembly(String input) {
        Lexer lexer = Lexer.forString(input);

        TokenSource tokenSource = new TokenSource(lexer);
        Parser parser = new Parser(tokenSource);
        ProgramTree program = parser.parseProgram();

        new SemanticAnalysis(program).analyze();

        List<IrGraph> graphs = new ArrayList<>();
        for (FunctionTree function : program.topLevelTrees()) {
            SsaTranslation translation = new SsaTranslation(function, new LocalValueNumbering());
            graphs.add(translation.translate());
        }

        return new CodeGenerator().generateCode(graphs);
    }

    @Test
    public void test() {
        String input = """
        int main() {
            return 0;
        }
        """;

        String expectedOutput = """
        _main:
            movq $0, %0
            movq %0, %rax
            ret
        """;

        assertEquals(expectedOutput, generateAssembly(input));
    }
}
