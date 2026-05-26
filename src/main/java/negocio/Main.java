package negocio;

public class Main {

    public static void main(String[] args) {

        EntradaDados entrada = new EntradaDados();

        GerenciadorOperacao gerenciador =
                new GerenciadorOperacao();

        int opcao = gerenciador.exibirMenu();

        double valor1 =
                entrada.lerPrimeiroNumero();

        double valor2 =
                entrada.lerSegundoNumero();

        double resultado =
                gerenciador.executarOperacao(
                        opcao,
                        valor1,
                        valor2);

        System.out.println(
                "\nResultado: " + resultado);
    }
}