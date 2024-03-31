import java.util.Scanner;

import Dominio.Triangulo;


public class exercicio19 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do primeiro lado do triângulo:");
        int lado1 = scanner.nextInt();

        System.out.println("Digite o valor do segundo lado do triângulo:");
        int lado2 = scanner.nextInt();

        System.out.println("Digite o valor do terceiro lado do triângulo:");
        int lado3 = scanner.nextInt();

        
        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);

        if (triangulo.verificarTriangulo()) {
           
            String tipo = triangulo.tipoTriangulo();
            System.out.println("Os valores informados formam um triângulo " + tipo + ".");
        } else {
            System.out.println("Os valores informados não formam um triângulo.");
        }

        scanner.close();
    }
}
