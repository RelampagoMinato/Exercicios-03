package br.edu.up.exercises;
import br.edu.up.Modelos.*;
public class Ex11 {
    public static void run() {
        Wutil util = new Wutil();
        Humanidade pessoa = new Humanidade();
        String[] vetNome = new String[56];
        String[] vetSexo = new String[56];
        for (int i = 0; i < 6; i++) {
            System.out.println("me diga o nome");
            util.pegarNomeSemNada();
            pessoa.setNome(util.voltarNome1());
            vetNome[i] = pessoa.getNome();
            System.out.println("me diga o sexo");
            util.pegarNomeSemNada();
            pessoa.setSexo(util.voltarNome1());
            vetSexo[i] = pessoa.getSexo();
        }

        for (int i = 0; i < 6; i++) {
            System.out.println("NOME: " + vetNome[i] + "   SEXO: " + vetSexo[i]);
        }
    }
}
