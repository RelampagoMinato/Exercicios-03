import java.util.Scanner;
import Dominio.Pessoa;
public class exercicio10 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de pessoas: ");
        int numPessoas = scanner.nextInt();

        for (int i = 1; i <= numPessoas; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();

            Pessoa pessoa = new Pessoa(idade);
            System.out.println("Pessoa " + i + ": " + ((Pessoa) pessoa).getMensagemIdade());
        }

        scanner.close();
    }
}

