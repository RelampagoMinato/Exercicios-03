package br.edu.up.exercises;
import br.edu.up.Modelos.*;
public class Ex18 {
    public static void run() {
        Wutil util = new Wutil();
        Alistamento usuario = new Alistamento();
        System.out.println("ola para saber qual vai ser oseu abono me informe se vc é homem ou mulher");
        util.pegarNomeSemNada();
        usuario.setSexo(util.voltarNome1());
        if (usuario.getSexo().equals("f") || usuario.getSexo().equals("F") || usuario.getSexo().equals("Feminino")
                || usuario.getSexo().equals("feminino")) {
            System.out.println("me infome sua idade");
            util.PegarNumero();
            usuario.setIdade(util.VoltarNumero1());
            if (usuario.getIdade() >= 30) {
                System.out.println("abono de 100");
            } else
                System.out.println("abono de 50");
        }
        if (usuario.getSexo().equals("m") || usuario.getSexo().equals("M") || usuario.getSexo().equals("Masculino")
                || usuario.getSexo().equals("masculino")) {
            System.out.println("me infome sua idade");
            util.PegarNumero();
            usuario.setIdade(util.VoltarNumero1());
            if (usuario.getIdade() >= 30) {
                System.out.println("abono de 200");
            } else
                System.out.println("abono de 80");
        }
    }

}
