package negocio;

import java.util.Scanner;

public class GerenciadorOperacao {

    private final Calculadora calculadora;

    public GerenciadorOperacao() {
        this.calculadora = new Calculadora();
    }

    public double executarOperacao(
            int opcao,
            double valor1,
            double valor2) {

        return switch (opcao) {

            case 1 -> calculadora.soma(valor1, valor2);

            case 2 -> calculadora.subtracao(valor1, valor2);

            case 3 -> calculadora.multiplicacao(valor1, valor2);

            case 4 -> calculadora.divisao(valor1, valor2);

            default ->
                    throw new IllegalArgumentException(
                            "Operação inválida");
        };
    }

    public int exibirMenu() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n===== CALCULADORA =====");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Escolha: ");

        return scanner.nextInt();
    }
}