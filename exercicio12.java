import java.util.Scanner;
import Dominio.Concessionaria;
import Dominio.Veiculo;

public class exercicio12 {
    public static void executar() {
        executar();
    }

        Scanner scanner = new Scanner(System.in);
        Concessionaria concessionaria = new Concessionaria();

        char continuar;
        do {
            System.out.println("Digite o ano do veículo:");
            int ano = scanner.nextInt();

            System.out.println("Digite o valor do veículo:");
            double valor = scanner.nextDouble();

            Veiculo veiculo = new Veiculo(ano, valor);
            concessionaria.calcularDesconto(veiculo);

            System.out.println("Deseja continuar calculando desconto? (S/N)");
            continuar = scanner.next().charAt(0);
        } while (continuar == 'S' || continuar == 's');

        concessionaria.exibirTotais();

        scanner.close();
    }
}