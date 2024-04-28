package br.edu.up.exercises;
import br.edu.up.Modelos.*;
public class Ex25 {
    public static void run() {
        Wutil util = new Wutil();
        NotaAluno notas = new NotaAluno();
        System.out.println("me informe qual a nota Laboratório peso 2");
        util.PegarNumeroSemNadaF();
        notas.setNota1(util.VoltarNumero1F());
        System.out.println("me informe qual a nota Laboratório peso 3");
        util.PegarNumeroSemNadaF();
        notas.setNota2(util.VoltarNumero1F());
        System.out.println("me informe qual a nota Laboratório peso 5");
        util.PegarNumeroSemNadaF();
        notas.setNota3(util.VoltarNumero1F());
        float media = (notas.getNota1() + notas.getNota3() + notas.getNota3()) / 3;
        if (media > 8) {
            System.out.println("A");
        } else if (media > 7 || media < 8) {
            System.out.println("B");
        } else if (media > 6 || media < 7) {
            System.out.println("C");
        } else if (media > 5 || media < 6) {
            System.out.println("D");
        } else if (media > 0 || media < 5) {
            System.out.println("R");
        }
    }
}
