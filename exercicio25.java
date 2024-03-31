import java.util.Scanner;
import Dominio.EstudanteNota;

public class exercicio25 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do estudante:");
        String nome = scanner.nextLine();

        System.out.println("Digite o número de matrícula do estudante:");
        int numeroMatricula = scanner.nextInt();

        System.out.println("Digite a nota do laboratório:");
        double notaLaboratorio = scanner.nextDouble();

        System.out.println("Digite a nota da avaliação semestral:");
        double notaAvaliacaoSemestral = scanner.nextDouble();

        System.out.println("Digite a nota do exame final:");
        double notaExameFinal = scanner.nextDouble();

        EstudanteNota estudante = new EstudanteNota(nome, numeroMatricula, notaLaboratorio, notaAvaliacaoSemestral, notaExameFinal);
        double notaFinal = estudante.calcularNotaFinal();
        String classificacao = estudante.determinarClassificacao();

        System.out.println("Nome: " + estudante.getNome());
        System.out.println("Número de matrícula: " + estudante.getNumeroMatricula());
        System.out.println("Nota final: " + notaFinal);
        System.out.println("Classificação: " + classificacao);

        scanner.close();
    }

    public static void main(String[] args) {
        executar();
    }
}
