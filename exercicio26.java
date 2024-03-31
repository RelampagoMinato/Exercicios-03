import java.util.Scanner;
import Dominio.Seguro;

public class exercicio26 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do pretendente:");
        String nome = scanner.nextLine();

        System.out.println("Digite a idade do pretendente:");
        int idade = scanner.nextInt();

        System.out.println("Digite o grupo de risco do pretendente (de 1 a 9):");
        int grupoRisco = scanner.nextInt();

        Seguro seguro = new Seguro(nome, idade, grupoRisco);
        String categoria = seguro.calcularCategoria();

        System.out.println("Nome do pretendente: " + seguro.getNome());
        System.out.println("Idade do pretendente: " + seguro.getIdade());
        System.out.println("Grupo de risco do pretendente: " + seguro.getGrupoRisco());
        System.out.println("Categoria do seguro: " + categoria);

        scanner.close();
    }
}
