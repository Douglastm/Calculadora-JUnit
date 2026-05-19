package negocio;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    private final Calculadora calc = new Calculadora();

    @BeforeEach
    void iniciarTeste() {
        System.out.println("==================================");
        System.out.println("Iniciando execução do teste...");
    }

    @AfterEach
    void finalizarTeste() {
        System.out.println("Teste executado com sucesso!");
        System.out.println("==================================");
    }

    @Test
    public void testSoma() {

        System.out.println("Testando operação de Soma");

        assertEquals(6, calc.soma(3, 3));
        assertEquals(8, calc.soma(-1, 9));
        assertEquals(9, calc.soma(0, 9));
    }

    @Test
    public void testSubtracao() {

        System.out.println("Testando operação de Subtração");

        assertEquals(5, calc.subtracao(10, 5));
        assertEquals(-10, calc.subtracao(5, 15));
        assertEquals(0, calc.subtracao(7, 7));
    }

    @Test
    public void testMultiplicacao() {

        System.out.println("Testando operação de Multiplicação");

        assertEquals(20, calc.multiplicacao(4, 5));
        assertEquals(-20, calc.multiplicacao(-4, 5));
        assertEquals(0, calc.multiplicacao(0, 5));
    }

    @Test
    public void testDivisao() {

        System.out.println("Testando operação de Divisão");

        assertEquals(2, calc.divisao(10, 5));
        assertEquals(5, calc.divisao(25, 5));
        assertEquals(0.5, calc.divisao(1, 2));
    }

    @Test
    public void testDivisaoPorZero() {

        System.out.println("Testando exceção de Divisão por Zero");

        IllegalArgumentException exception =
                assertThrows(
                        IllegalArgumentException.class,
                        () -> calc.divisao(10, 0)
                );

        assertEquals(
                "Não é possível dividir por zero.",
                exception.getMessage()
        );
    }
}