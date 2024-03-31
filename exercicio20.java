import java.util.Scanner;

import Dominio.Professor;

public class exercicio20 {
    public static void executar(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do professor:");
        String nome = scanner.nextLine();

        System.out.println("Digite o nível do professor (1, 2 ou 3):");
        int nivel = scanner.nextInt();

        System.out.println("Digite a quantidade de horas/aula:");
        int horasAula = scanner.nextInt();

        Professor professor = new Professor(nome, nivel);

        double salario = professor.calcularSalario(horasAula);
        System.out.println("Salário do professor " + professor.nome + ": R$" + salario);

        scanner.close();
    }
}
