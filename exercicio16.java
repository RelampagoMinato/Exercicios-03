import java.util.Scanner;

import Dominio.Empresa;

public class exercicio16 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do funcionário:");
        String nome = scanner.nextLine();

        System.out.println("Informe o salário do funcionário:");
        double salario = scanner.nextDouble();

        Empresa empresa = new Empresa(1);
        empresa.adicionarFuncionario(new Funcionario(nome, salario));

        empresa.aplicarReajusteSalario();
        empresa.exibirSalarios();

        scanner.close();
    }
}
