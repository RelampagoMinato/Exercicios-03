import java.util.Scanner;

import Dominio.Alunomedia;

public class exercicio01 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        
        Alunomedia aluno = new Alunomedia(nome, nota1, nota2, nota3);

        
        aluno.exibirMediaSemestre();

        scanner.close();
    }
}
