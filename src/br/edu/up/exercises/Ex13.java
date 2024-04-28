package br.edu.up.exercises;
import br.edu.up.Modelos.*;
public class Ex13 {
    public static void run() {
        Wutil util = new Wutil();
        SerHumano usuario = new SerHumano();
        util.pegarNome();
        usuario.setNome(util.voltarNome1());
        System.out.println("me informe seu sexo (1 = F,2 = M)");
        util.pegarNomeSemNada();
        usuario.setSexo(util.voltarNome1());
        System.out.println("me informe sua idade");
        util.PegarNumeroSemNada();
        usuario.setIdade(util.VoltarNumero1());
        System.out.println("me informe sua saude de 0 a 10");
        util.PegarNumeroSemNada();
        usuario.setSaude(util.VoltarNumero1());
        if (usuario.getSexo().equals("F") && usuario.getIdade() >= 18) {
            if (usuario.getSaude() >= 7) {
                System.out.println("esta apto");
            } else
                System.out.println("nao esta apto");
        } else if (usuario.getSexo().equals("M") && usuario.getIdade() >= 18) {
            if (usuario.getSaude() >= 5) {
                System.out.println("esta apto");
            } else
                System.out.println("nao esta apto");
        } else
            System.out.println("nao esta apto");

        // System.out.printf("nome = %s sexo = %s idade = %d saude = %d", usuario.nome,
        // usuario.sexo, usuario.idade, usuario.saude);

    }
}