package br.edu.up.exercises;
import br.edu.up.Modelos.*;
public class Ex14 {
    public static void run() {
        Wutil util = new Wutil();
        ProdutoFor produtos = new ProdutoFor();
        for (int i = 0; i < 40; i++) {
            System.out.println("item" + (i + 1) + " = " + produtos.getItem(i));
        }
    }
}
