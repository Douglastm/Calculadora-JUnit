package negocio;

import java.util.Scanner;

public class EntradaDados {

    private final Scanner scanner = new Scanner(System.in);

    public double lerPrimeiroNumero() {
        System.out.print("Digite o primeiro número: ");
        return scanner.nextDouble();
    }

    public double lerSegundoNumero() {
        System.out.print("Digite o segundo número: ");
        return scanner.nextDouble();
    }
}