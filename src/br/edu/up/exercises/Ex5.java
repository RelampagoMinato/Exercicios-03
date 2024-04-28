package br.edu.up.exercises;
import br.edu.up.Modelos.*;
public class Ex5 {
    public static void run(){
        Wutil util = new Wutil();
        MamaoComAcucar loja1 = new MamaoComAcucar();
        System.out.println("qual o valor q vai ser dividido em 5 vezes");
        util.PegarNumeroF();
        loja1.setprestacao(util.VoltarNumero1F());
        float resultado; 
        resultado =  loja1.getprestacao() / 5; 
        System.out.println("o valor em 5 vezes é " + resultado);        
    }
}
