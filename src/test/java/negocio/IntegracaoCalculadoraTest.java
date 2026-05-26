package negocio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IntegracaoCalculadoraTest {

    private final GerenciadorOperacao gerenciador =
            new GerenciadorOperacao();

    @Test
    public void testIntegracaoSoma() {

        System.out.println("================================================");
        System.out.println("TESTE DE INTEGRAÇÃO - SOMA");
        System.out.println("Validando comunicação entre GerenciadorOperacao e Calculadora");
        System.out.println("Operação: 10 + 5");

        double resultado =
                gerenciador.executarOperacao(1, 10, 5);

        assertEquals(15, resultado);

        System.out.println("Resultado obtido: " + resultado);
        System.out.println("Resultado esperado: 15");
        System.out.println("Teste executado com sucesso!");
        System.out.println("================================================");
    }

    @Test
    public void testIntegracaoSubtracao() {

        System.out.println("================================================");
        System.out.println("TESTE DE INTEGRAÇÃO - SUBTRAÇÃO");
        System.out.println("Validando comunicação entre GerenciadorOperacao e Calculadora");
        System.out.println("Operação: 10 - 5");

        double resultado =
                gerenciador.executarOperacao(2, 10, 5);

        assertEquals(5, resultado);

        System.out.println("Resultado obtido: " + resultado);
        System.out.println("Resultado esperado: 5");
        System.out.println("Teste executado com sucesso!");
        System.out.println("================================================");
    }

    @Test
    public void testIntegracaoMultiplicacao() {

        System.out.println("================================================");
        System.out.println("TESTE DE INTEGRAÇÃO - MULTIPLICAÇÃO");
        System.out.println("Validando comunicação entre GerenciadorOperacao e Calculadora");
        System.out.println("Operação: 10 x 5");

        double resultado =
                gerenciador.executarOperacao(3, 10, 5);

        assertEquals(50, resultado);

        System.out.println("Resultado obtido: " + resultado);
        System.out.println("Resultado esperado: 50");
        System.out.println("Teste executado com sucesso!");
        System.out.println("================================================");
    }

    @Test
    public void testIntegracaoDivisao() {

        System.out.println("================================================");
        System.out.println("TESTE DE INTEGRAÇÃO - DIVISÃO");
        System.out.println("Validando comunicação entre GerenciadorOperacao e Calculadora");
        System.out.println("Operação: 10 / 5");

        double resultado =
                gerenciador.executarOperacao(4, 10, 5);

        assertEquals(2, resultado);

        System.out.println("Resultado obtido: " + resultado);
        System.out.println("Resultado esperado: 2");
        System.out.println("Teste executado com sucesso!");
        System.out.println("================================================");
    }

    @Test
    public void testOperacaoInvalida() {

        System.out.println("================================================");
        System.out.println("TESTE DE INTEGRAÇÃO - OPERAÇÃO INVÁLIDA");
        System.out.println("Validando tratamento de erro");

        assertThrows(
                IllegalArgumentException.class,
                () -> gerenciador.executarOperacao(99, 10, 5)
        );

        System.out.println("Exceção lançada corretamente.");
        System.out.println("Teste executado com sucesso!");
        System.out.println("================================================");
    }
}