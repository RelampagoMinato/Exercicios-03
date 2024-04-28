package br.edu.up.exercises;
import br.edu.up.Modelos.*;
public class Ex17 {
    public static void run() {
        GG usuario = new GG();
        Wutil util = new Wutil();
        float salarioMinimo = 1300;
        System.out.println("me infome o seu nome");
        util.pegarNomeSemNada();
        usuario.setNome(util.voltarNome1());
        System.out.println("me infome o seu salario");
        util.PegarNumeroF();
        usuario.setSalario(util.VoltarNumero1());
        usuario.setSalario((usuario.getSalario() + salarioMinimo) / 0.10f);
        System.out.println("o salario atua é" + usuario.getSalario());

    }
}
