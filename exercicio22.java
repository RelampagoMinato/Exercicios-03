import java.util.Scanner;

import Dominio.ContadeLuz;

public class exercicio22 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o tipo de cliente (1 - Residência, 2 - Comércio, 3 - Indústria):");
        int tipoCliente = scanner.nextInt();
        
        System.out.println("Digite a quantidade de KW/h consumidos:");
        double consumo = scanner.nextDouble();
        
        ContadeLuz contaDeLuz = new ContadeLuz(tipoCliente, consumo);
        double valorConta = contaDeLuz.calcularValor();
        
        System.out.println("Valor da conta de luz: R$" + valorConta);
        
        scanner.close();
    }
}
