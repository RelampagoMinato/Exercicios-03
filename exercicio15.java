import java.util.Scanner;

import Dominio.Veiculo1;

public class exercicio15 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        Concessionaria1 concessionaria = new Concessionaria1();

        while (true) {
            System.out.println("Digite o tipo de combustível (álcool, gasolina, diesel) ou '0' para encerrar:");
            String tipoCombustivel = scanner.nextLine().toLowerCase();

            if (tipoCombustivel.equals("0")) {
                break;
            }

            System.out.println("Digite o valor do veículo:");
            double valorVeiculo = scanner.nextDouble();
            scanner.nextLine(); 

            Veiculo1 veiculo = new Veiculo1(tipoCombustivel, valorVeiculo);
            concessionaria.registrarVenda(veiculo);
        }

        System.out.println("Total de desconto concedido: " + concessionaria.getTotalDesconto());
        System.out.println("Total pago pelos clientes: " + concessionaria.getTotalPago());

        scanner.close();
    }
}
