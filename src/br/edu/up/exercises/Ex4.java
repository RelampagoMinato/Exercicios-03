package br.edu.up.exercises;
import br.edu.up.Modelos.*;
public class Ex4 {
    public static void run(){
        Wutil util = new Wutil();
        conversor conversor = new conversor();
        System.out.println("me informe a cotaçao atual do dolar");
        util.PegarNumeroF();
        conversor.setCotacao(util.VoltarNumero1F());
        System.out.println("me informe q quantidade de dinheiro em dolar");
        util.PegarNumeroF();
        conversor.setQuantidade(util.VoltarNumero1F());
        float comversao = conversor.getQuantidade() * conversor.getCotacao(); 
        System.out.println(comversao);
    }
}
