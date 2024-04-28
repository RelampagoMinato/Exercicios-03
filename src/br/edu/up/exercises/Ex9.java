package br.edu.up.exercises;
import br.edu.up.Modelos.*;
public class Ex9 {
    public static void run(){
    int[] vet = new int[80];
    Wutil util = new Wutil();
    System.out.println("me diga os numeros");
        for(int i = 0; i < 80; i++){
            System.out.println("numero " + i);
            util.PegarNumeroSemNada();
            vet[i] = util.VoltarNumero1();
        }

        for(int i = 0; i < 80; i++){
            System.out.println(vet[i]);
        }
}
    

}
