import java.util.Scanner;

import Dominio.AnalisarProduto;
import Dominio.Produto2;

public class exercicio14 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        Produto2[] produtos = new Produto2[40];

        for (int i = 0; i < produtos.length; i++) {
            System.out.println("Informe o preço de custo do produto " + (i + 1) + ":");
            double precoCusto = scanner.nextDouble();

            System.out.println("Informe o preço de venda do produto " + (i + 1) + ":");
            double precoVenda = scanner.nextDouble();

            produtos[i] = new Produto2(precoCusto, precoVenda);
        }

        AnalisarProduto analisador = new AnalisarProduto(produtos);
        analisador.processar();

        scanner.close();
    }
}
