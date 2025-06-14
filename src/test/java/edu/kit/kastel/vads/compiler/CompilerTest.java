package edu.kit.kastel.vads.compiler;

import edu.kit.kastel.vads.compiler.backend.aasm.CodeGenerator;
import edu.kit.kastel.vads.compiler.backend.regalloc.RegisterAllocator;
import edu.kit.kastel.vads.compiler.backend.aasm.AasmRegisterAllocator;
import edu.kit.kastel.vads.compiler.backend.aasm.SpillingRegisterAllocator;
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
import org.junit.jupiter.api.Disabled;

import java.util.ArrayList;
import java.util.List;

public class CompilerTest {
    private String startupCode = """
    .global main
    .global _main
    .text
    main:
        call _main
        movq %rax, %rdi
        movq $0x3C, %rax
        syscall
    """;

    private String generateAssembly(String input, RegisterAllocator allocator) {
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

        return new CodeGenerator().generateCode(allocator, graphs);
    }

    private String generateAbstractAssembly(String input) {
        RegisterAllocator allocator = new AasmRegisterAllocator();
        return generateAssembly(input, allocator);
    }

    private String generateSpillingAssembly(String input) {
        RegisterAllocator allocator = new SpillingRegisterAllocator();
        return generateAssembly(input, allocator);
    }

    @Test
    public void testReturnZero() {
        String input = """
        int main() {
            return 0;
        }
        """;

        String expectedOutput = startupCode + """
        _main:
            movl $0, %0
            movl %0, %eax
            ret
        """;

        assertEquals(expectedOutput, generateAbstractAssembly(input));
    }

    @Test
    public void testAdd() {
        String input = """
        int main() {
            return 1 + 2;
        }
        """;

        String expectedOutput = startupCode + """
        _main:
            movl $1, %0
            movl $2, %1
            movl %0, %edi
            movl %1, %esi
            movl %edi, %edx
            addl %esi, %edx
            movl %edx, %2
            movl %2, %eax
            ret
        """;

        assertEquals(expectedOutput, generateAbstractAssembly(input));
    }

    @Test
    public void testSub() {
        String input = """
        int main() {
            return 2 - 1;
        }
        """;

        String expectedOutput = startupCode + """
        _main:
            movl $2, %0
            movl $1, %1
            movl %0, %edi
            movl %1, %esi
            movl %edi, %edx
            subl %esi, %edx
            movl %edx, %2
            movl %2, %eax
            ret
        """;

        assertEquals(expectedOutput, generateAbstractAssembly(input));
    }

    @Test
    public void testMul() {
        String input = """
        int main() {
            return 2 * 3;
        }
        """;

        String expectedOutput = startupCode + """
        _main:
            movl $2, %0
            movl $3, %1
            movl %0, %edi
            movl %1, %esi
            movl %edi, %edx
            imull %esi, %edx
            movl %edx, %2
            movl %2, %eax
            ret
        """;

        assertEquals(expectedOutput, generateAbstractAssembly(input));
    }

    @Test
    public void testDiv() {
        String input = """
        int main() {
            return 6 / 3;
        }
        """;

        String expectedOutput = startupCode + """
        _main:
            movl $6, %0
            movl $3, %1
            movl %0, %edi
            movl %1, %esi
            movl %edi, %eax
            cltd
            idivl %esi
            movl %eax, %2
            movl %2, %eax
            ret
        """;

        assertEquals(expectedOutput, generateAbstractAssembly(input));
    }

    @Test
    public void testMod() {
        String input = """
        int main() {
            return 5 % 3;
        }
        """;

        String expectedOutput = startupCode + """
        _main:
            movl $5, %0
            movl $3, %1
            movl %0, %edi
            movl %1, %esi
            movl %edi, %eax
            cltd
            idivl %esi
            movl %edx, %2
            movl %2, %eax
            ret
        """;

        assertEquals(expectedOutput, generateAbstractAssembly(input));
    }

    @Test
    public void testBitwiseAnd() {
        String input = """
        int main() {
            return 1 & 2;
        }
        """;

        String expectedOutput = startupCode + """
        _main:
            movl $1, %0
            movl $2, %1
            movl %0, %edi
            movl %1, %esi
            movl %edi, %edx
            andl %esi, %edx
            movl %edx, %2
            movl %2, %eax
            ret
        """;

        assertEquals(expectedOutput, generateAbstractAssembly(input));
    }

    @Test
    public void testBitwiseXor() {
        String input = """
        int main() {
            return 1 ^ 2;
        }
        """;

        String expectedOutput = startupCode + """
        _main:
            movl $1, %0
            movl $2, %1
            movl %0, %edi
            movl %1, %esi
            movl %edi, %edx
            xorl %esi, %edx
            movl %edx, %2
            movl %2, %eax
            ret
        """;

        assertEquals(expectedOutput, generateAbstractAssembly(input));
    }

    @Test
    public void testBitwiseOr() {
        String input = """
        int main() {
            return 1 | 2;
        }
        """;

        String expectedOutput = startupCode + """
        _main:
            movl $1, %0
            movl $2, %1
            movl %0, %edi
            movl %1, %esi
            movl %edi, %edx
            orl %esi, %edx
            movl %edx, %2
            movl %2, %eax
            ret
        """;

        assertEquals(expectedOutput, generateAbstractAssembly(input));
    }

    @Test
    public void testShiftLeft() {
        String input = """
        int main() {
            return 1 << 2;
        }
        """;

        String expectedOutput = startupCode + """
        _main:
            movl $1, %0
            movl $2, %1
            movl %0, %edi
            movl %1, %esi
            movl %edi, %edx
            movl %esi, %ecx
            sall %cl, %edx
            movl %edx, %2
            movl %2, %eax
            ret
        """;

        assertEquals(expectedOutput, generateAbstractAssembly(input));
    }

    @Test
    public void testShiftRight() {
        String input = """
        int main() {
            return 1 >> 2;
        }
        """;

        String expectedOutput = startupCode + """
        _main:
            movl $1, %0
            movl $2, %1
            movl %0, %edi
            movl %1, %esi
            movl %edi, %edx
            movl %esi, %ecx
            sarl %cl, %edx
            movl %edx, %2
            movl %2, %eax
            ret
        """;

        assertEquals(expectedOutput, generateAbstractAssembly(input));
    }

    @Test
    public void testBitwiseNot() {
        String input = """
            int main() {
                return ~0;
            }
        """;

        String expectedOutput = startupCode + """
        _main:
            movl $0, %0
            movl %0, %edi
            notl %edi
            movl %edi, %1
            movl %1, %eax
            ret
        """;

        assertEquals(expectedOutput, generateAbstractAssembly(input));
    }

    @Test
    public void testDeclareBool() {
        String input = """
            int main() {
                bool a;
                return 0;
            }
        """;

        String expectedOutput = startupCode + """
        _main:
            movl $0, %0
            movl %0, %eax
            ret
        """;

        assertEquals(expectedOutput, generateAbstractAssembly(input));
    }

    @Test
    public void testDeclareBoolAndInitializeWithFalse() {
        String input = """
            int main() {
                bool a = false;
                return 0;
            }
        """;

        String expectedOutput = startupCode + """
        _main:
            movl $0, %0
            movl %0, %eax
            ret
        """;

        assertEquals(expectedOutput, generateAbstractAssembly(input));
    }

    @Test
    public void testDeclareBoolAndInitializeWithTrue() {
        String input = """
            int main() {
                bool a = true;
                return 0;
            }
        """;

        String expectedOutput = startupCode + """
        _main:
            movl $0, %0
            movl %0, %eax
            ret
        """;

        assertEquals(expectedOutput, generateAbstractAssembly(input));
    }

    @Test
    public void testIfFalseBranch() {
        String input = """
            int main() {
                if (false) {
                    return 1;
                }
                return 2;
            }
        """;

        String expectedOutput = startupCode + """
        _main:
            movl $0, %0
            cmpl $0, %0
            je l0
            movl $2, %1
            je l1
        l0:
            movl $1, %1
        l1:
            movl %1, %eax
            ret
        """;

        assertEquals(expectedOutput, generateAbstractAssembly(input));
    }

    @Test
    public void testSpilling() {
        String input = """
        int main() {
            return 1 + 2;
        }
        """;

        String expectedOutput = startupCode + """
        _main:
            movl $1, 8+4*0(%rsp)
            movl $2, 8+4*1(%rsp)
            movl 8+4*0(%rsp), %edi
            movl 8+4*1(%rsp), %esi
            movl %edi, %edx
            addl %esi, %edx
            movl %edx, 8+4*2(%rsp)
            movl 8+4*2(%rsp), %eax
            ret
        """;

        assertEquals(expectedOutput, generateSpillingAssembly(input));
    }
}
