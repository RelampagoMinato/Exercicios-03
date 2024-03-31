import java.util.Scanner;

import Dominio.Contador;

public class exercicio09 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        Contador contador = new Contador();

        for (int i = 0; i < 80; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            int numero = scanner.nextInt();
            contador.adicionarNumero(numero);
        }

        System.out.println("Quantidade de números no intervalo entre 10 e 150: " + contador.contarNumerosNoIntervalo());

        scanner.close();
    }
}