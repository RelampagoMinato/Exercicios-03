import java.util.Scanner;

import Dominio.ConversaoDolar;

public class exercicio04 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a cotação do dólar:");
        double cotacaoDolar = scanner.nextDouble();
        
        System.out.println("Digite a quantidade de dólares:");
        double quantidadeDolar = scanner.nextDouble();
        
       
        ConversaoDolar conversor = new ConversaoDolar(cotacaoDolar, quantidadeDolar);
        
        conversor.exibirInformacoes();
        
        scanner.close();
    }
}