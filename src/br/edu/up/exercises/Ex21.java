package br.edu.up.exercises;
import br.edu.up.Modelos.*;
public class Ex21 {
    public static void run() {
        Wutil util = new Wutil();
        UsuarioFor usuario = new UsuarioFor();
        System.out.println("me informe a idade do nadador");
        util.PegarNumeroSemNada();
        usuario.setIdade(util.VoltarNumero1());
        if ((usuario.getIdade() >= 18 || (usuario.getIdade() <= 25))) {
            System.out.println("senior");
        } else if ((usuario.getIdade() >= 14 || (usuario.getIdade() <= 17))) {
            System.out.println("juvenil B");
        } else if (usuario.getIdade() >= 11 || (usuario.getIdade() <= 13)) {
            System.out.println("juvenil A");
        } else if (usuario.getIdade() >= 8 || usuario.getIdade() <= 10) {
            System.out.println("infantil B");
        } else if (usuario.getIdade() >= 5 || usuario.getIdade() <= 7) {
            System.out.println("infantil A");
        } else
            System.out.println("idade fora da faixa etária");

        System.out.println("me informe a idade do nadador");
        util.PegarNumeroSemNada();
        usuario.setIdade(util.VoltarNumero1());
        if (usuario.getIdade() >= 5 || usuario.getIdade() <= 7) {
            System.out.println("infantil A");
        } else if (usuario.getIdade() >= 8 || usuario.getIdade() <= 10) {
            System.out.println("infantil B");
        } else if (usuario.getIdade() >= 11 || (usuario.getIdade() <= 13)) {
            System.out.println("juvenil A");
        } else if ((usuario.getIdade() >= 14 || (usuario.getIdade() <= 17))) {
            System.out.println("juvenil B");
        } else if ((usuario.getIdade() >= 18 || (usuario.getIdade() <= 25))) {
            System.out.println("senior");
        } else
            System.out.println("idade fora da faixa etária");

    }
}
