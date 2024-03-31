import java.util.Scanner;

import Dominio.Funcionario2;

public class exercicio17 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do funcionário:");
        String nome = scanner.nextLine();

        System.out.println("Informe o salário atual do funcionário:");
        double salarioAtual = scanner.nextDouble();

        System.out.println("Informe o valor do salário mínimo:");
        double salarioMinimo = scanner.nextDouble();

        System.out.println("Informe o percentual de reajuste (em %):");
        double percentualReajuste = scanner.nextDouble();

        Funcionario2 funcionario = new Funcionario2(nome, salarioAtual);
        funcionario.reajustarSalario(salarioMinimo, percentualReajuste);

        scanner.close();
    }
}
