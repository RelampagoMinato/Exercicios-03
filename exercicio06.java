import java.util.Scanner;

import Dominio.Produto;

public class exercicio06 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço de custo do produto: ");
        double precoCusto = scanner.nextDouble();

        System.out.print("Digite o percentual de acréscimo (%): ");
        double percentualAcrescimo = scanner.nextDouble();

        Produto produto = new Produto(precoCusto, percentualAcrescimo);

        produto.exibirValorVenda();

        scanner.close();
    }
}