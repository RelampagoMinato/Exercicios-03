package br.edu.up.exercises;
import br.edu.up.Modelos.*;
public class Ex24 {
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
        float media = (notas.getNota1() + notas.getNota2() + notas.getNota3()) / 3;
        System.out.println(media);
    }
}
