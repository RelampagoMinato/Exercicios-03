import java.util.Scanner;
import Dominio.Estudante;

public class exercicio24 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota do laboratório:");
        double notaLaboratorio = scanner.nextDouble();

        System.out.println("Digite a nota da avaliação semestral:");
        double notaAvaliacaoSemestral = scanner.nextDouble();

        System.out.println("Digite a nota do exame final:");
        double notaExameFinal = scanner.nextDouble();

        Estudante estudante = new Estudante(notaLaboratorio, notaAvaliacaoSemestral, notaExameFinal);
        double notaFinal = calcularNotaFinal(estudante);

        System.out.println("Nota final do estudante: " + notaFinal);

        scanner.close();
    }

    public static double calcularNotaFinal(Estudante estudante) {
        double notaLaboratorio = estudante.getNotaLaboratorio();
        double notaAvaliacaoSemestral = estudante.getNotaAvaliacaoSemestral();
        double notaExameFinal = estudante.getNotaExameFinal();

        return (notaLaboratorio * 2 + notaAvaliacaoSemestral * 3 + notaExameFinal * 5) / 10;
    }

    public static void main(String[] args) {
        executar();
    }
}
