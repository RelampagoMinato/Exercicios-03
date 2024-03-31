import java.util.Scanner;

import Dominio.Alunonota;

public class exercicio08 {
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

        Alunonota aluno = new Alunonota(nome, nota1, nota2, nota3);

        aluno.exibirMencao();

        scanner.close();
    }
}