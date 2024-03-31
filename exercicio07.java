import java.util.Scanner;

import Dominio.Carro;

public class exercicio07 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o custo de fábrica do carro: ");
        double custoFabrica = scanner.nextDouble();
        Carro carro = new Carro(custoFabrica);
        carro.exibirCustoAoConsumidor();

        scanner.close();
    }
}
