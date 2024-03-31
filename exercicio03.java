import java.util.Scanner;

import Dominio.Vendedor;

public class exercicio03 {

public static void executar() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o nome do vendedor:");
    String nome = scanner.nextLine();

    System.out.println("Digite o salário fixo do vendedor:");
    double salarioFixo = scanner.nextDouble();

    System.out.println("Digite o total de vendas do vendedor:");
    double totalVendas = scanner.nextDouble();

    Vendedor vendedor = new Vendedor(nome, salarioFixo, totalVendas);

    vendedor.exibirInformacoes();

    scanner.close();
}
}