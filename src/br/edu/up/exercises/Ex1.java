package br.edu.up.exercises;
import br.edu.up.Modelos.*;
public class Ex1 {
    public static void run() {
        Aluno aluno1 = new Aluno();
        Wutil util = new Wutil();
        util.pegarNome();
        aluno1.setNome(util.voltarNome1());
        util.PegarNumeroF();
        aluno1.setNota1(util.VoltarNumero1F());
        util.PegarNumeroF();
        aluno1.setNota2(util.VoltarNumero1F());

        util.PegarNumeroF();
        aluno1.setNota3(util.VoltarNumero1F());

        float media = ((aluno1.getNota1() + aluno1.getNota2() + aluno1.getNota3()) / 3);
        System.out.printf("%s a sua nota do semestre 1 é %.2f a do semestre 2 é %.2f e do semestre 3 é %.2f totalizando a media é %.2f",aluno1.getNome(), aluno1.getNota1(), aluno1.getNota2(), aluno1.getNota3(), media);
    }
}
