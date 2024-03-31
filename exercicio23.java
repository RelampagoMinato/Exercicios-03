import java.util.Scanner;
import Dominio.Individuo;
import Dominio.PesoIdealCalculadora;

public class exercicio23 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da pessoa:");
        String nome = scanner.nextLine();

        System.out.println("Digite o sexo da pessoa (M/F):");
        char sexo = scanner.next().charAt(0);

        System.out.println("Digite a altura da pessoa:");
        double altura = scanner.nextDouble();

        System.out.println("Digite a idade da pessoa:");
        int idade = scanner.nextInt();

        Individuo individuo = new Individuo(nome, sexo, altura, idade);
        double pesoIdeal = PesoIdealCalculadora.calcularPesoIdeal(individuo);

        if (pesoIdeal != -1) {
            System.out.println("Nome da pessoa: " + individuo.getNome());
            System.out.println("Peso ideal: " + pesoIdeal + " kg");
        } else {
            System.out.println("Sexo inválido. Por favor, digite M para masculino ou F para feminino.");
        }

        scanner.close();
    }
}
