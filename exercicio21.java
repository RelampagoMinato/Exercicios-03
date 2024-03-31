import java.util.Scanner;

import Dominio.Nadador;

public class exercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a idade do nadador:");
        int idade = scanner.nextInt();
        
        Nadador nadador = new Nadador(idade);
        ClassificadorNadador classificador = new ClassificadorNadador();
        String categoria = classificador.classificar(nadador);
        
        System.out.println("Categoria do nadador: " + categoria);
        
        scanner.close();
    }

    public static void executar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'executar'");
    }
}
