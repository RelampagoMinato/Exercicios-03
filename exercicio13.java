import java.util.Scanner;

import Dominio.PessoaApta;
import Dominio.ServicoMilitar;

public class exercicio13 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        ServicoMilitar servicoMilitar = new ServicoMilitar();

        System.out.println("Digite o número de pessoas:");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Digite o nome da pessoa " + i + ":");
            String nome = scanner.next();

            System.out.println("Digite o sexo da pessoa " + i + " (M/F):");
            char sexo = scanner.next().charAt(0);

            System.out.println("Digite a idade da pessoa " + i + ":");
            int idade = scanner.nextInt();

            System.out.println("A pessoa " + i + " possui saúde apta para o serviço militar? (true/false):");
            boolean saude = scanner.nextBoolean();

            PessoaApta pessoa = new PessoaApta(nome, sexo, idade, saude);
            servicoMilitar.verificarAptidao(pessoa);
        }

        servicoMilitar.exibirTotais();
        scanner.close();
    }
}