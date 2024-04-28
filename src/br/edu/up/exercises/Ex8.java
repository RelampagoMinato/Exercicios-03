package br.edu.up.exercises;
import br.edu.up.Modelos.*;
public class Ex8 {
    public static void run(){
        AlunoFaculdade aluno = new AlunoFaculdade();
        Wutil util = new Wutil();
        util.pegarNome();
        aluno.setNome(util.voltarNome1());
        System.out.println("nota 1");
        util.PegarNumeroSemNadaF();
        aluno.setNota1(util.VoltarNumero1F());
        System.out.println("nota 2");
        util.PegarNumeroSemNadaF();
        aluno.setNota2(util.VoltarNumero1F());
        System.out.println("nota 3");
        util.PegarNumeroSemNadaF();
        aluno.setNota3(util.VoltarNumero1F());
        float media = (aluno.getNota1() + aluno.getNota2() + aluno.getNota3()) / 3;
        System.out.println("nome = " + aluno.getNome() + "a media é " + media);
        if (media < 5.0) {
            System.out.println("reprovado");
        }
        else if (media > 7.0) {
            System.out.println("aprovado");
        }
         else 
            System.out.println("recuperaçao");
        


    }
}
