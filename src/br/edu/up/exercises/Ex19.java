package br.edu.up.exercises;
import br.edu.up.Modelos.*;
public class Ex19 {
    public static void run() {
        int ld1 = 0;
        int ld2 = 0;
        int ld3 = 0;
        Wutil util = new Wutil();
        System.out.println("Vamos ver se os três números formam um triângulo.");
        System.out.println("Lado 1:");
        util.PegarNumeroSemNada();
        ld1 = util.VoltarNumero1();
        System.out.println("Lado 2:");
        util.PegarNumeroSemNada();
        ld2 = util.VoltarNumero1();
        System.out.println("Lado 3:");
        util.PegarNumeroSemNada();
        ld3 = util.VoltarNumero1();

        if (ld1 + ld2 > ld3 && ld1 + ld3 > ld2 && ld2 + ld3 > ld1) {
            if (ld1 == ld2 && ld2 == ld3) {
                System.out.println("É um triângulo equilátero.");
            } else if (ld1 == ld2 || ld2 == ld3 || ld3 == ld1) {
                System.out.println("É um triângulo isósceles.");
            } else {
                System.out.println("É um triângulo escaleno.");
            }
        } else {
            System.out.println("Os lados não formam um triângulo.");
        }
    }
}
