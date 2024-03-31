import java.util.Scanner;

import Dominio.Loja;

public class exercicio05 {
        public static void executar() {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Digite o valor da compra: ");
            double valorCompra = scanner.nextDouble();
    
            Loja loja = new Loja(valorCompra);
    
            
            loja.exibirPrestacoes();
    
            scanner.close();
        }
    }
    