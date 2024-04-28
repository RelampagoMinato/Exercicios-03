package br.edu.up.exercises;
import br.edu.up.Modelos.*;
public class Ex22 {
    public static void run() {
        System.out.println("me diga quanto é o  KW/H");
        Wutil util = new Wutil();
        util.PegarNumeroSemNada();
        int KWH = util.VoltarNumero1();
        System.out.println("me diga se vc mora em  1 = residencia 2 = comercio 3 = industria");
        util.PegarNumeroSemNada();
        int escolha = util.VoltarNumero1();
        float resu = 0;
        switch (escolha) {
            case 1:
                resu = KWH * 0.60f;
                System.out.println(resu);
                break;
            case 2:
                resu = KWH * 0.48f;
                System.out.println(resu);
                break;
            case 3:
                resu = KWH * 1.29f;
                System.out.println(resu);
                break;
            default:
                break;
        }
    }
}
