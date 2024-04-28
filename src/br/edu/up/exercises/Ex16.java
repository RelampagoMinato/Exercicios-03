package br.edu.up.exercises;
import br.edu.up.Modelos.*;
public class Ex16 {
    public static void run() {
        Wutil util = new Wutil();
        UsuarioSalario pessoa = new UsuarioSalario();
        float resu;
        System.out.println("me diga seu laraio");
        util.PegarNumeroSemNadaF();
        pessoa.setSalario(util.VoltarNumero1F());
        if (pessoa.getSalario() < 3 * 1400) {
            float porcentagem = pessoa.getSalario() * 0.5f;
            resu = pessoa.getSalario() + porcentagem;
            System.out.println("salario novo " + resu);
        } else if (pessoa.getSalario() < 10 * 1400) {
            float porcentagem = pessoa.getSalario() * 0.2f;
            resu = pessoa.getSalario() + porcentagem;
            System.out.println("salario novo " + resu);
        } else if (pessoa.getSalario() < 20 * 1400) {
            float porcentagem = pessoa.getSalario() * 0.15f;
            resu = pessoa.getSalario() + porcentagem;
            System.out.println("salario novo " + resu);
        } else {
            float porcentagem = pessoa.getSalario() * 0.10f;
            resu = pessoa.getSalario() + porcentagem;
            System.out.println("salario novo " + pessoa.getSalario());

        }
    }
}
