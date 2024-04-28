package br.edu.up.exercises;
import br.edu.up.Modelos.*;
public class Ex20 {
    public static void run() {
        Wutil util = new Wutil();
        int aulas = 0;
        int salario = 0;
        System.out.println("me diga qual o nivl do prof");
        util.PegarNumeroSemNada();
        int nivel = util.VoltarNumero1();
        switch (nivel) {
            case 1:
                System.out.println("quantas aulas ele ficou ?");
                util.PegarNumeroSemNada();
                aulas = util.VoltarNumero1();
                salario = aulas * 12;
                System.out.println(salario);
                break;
            case 2:
                System.out.println("quantas aulas ele ficou ?");
                util.PegarNumeroSemNada();
                aulas = util.VoltarNumero1();
                salario = aulas * 17;
                System.out.println(salario);
                break;
            case 3:
                System.out.println("quantas aulas ele ficou ?");
                util.PegarNumeroSemNada();
                aulas = util.VoltarNumero1();
                salario = aulas * 25;
                System.out.println(salario);
                break;

            default:
                break;
        }
    }
}
