package br.edu.up.exercises;
import br.edu.up.Modelos.*;
public class Ex6 {
    public static void run(){
        Produto produto = new Produto();
        Comprador comprador = new Comprador();
        Wutil util = new Wutil();
        System.out.println("os produtos sao");
        System.out.println("1 = " + produto.getCelular());
        System.out.println("2 = " + produto.getTablet());
        System.out.println("3 = " + produto.getPc());
        System.out.println("4 = " + produto.getNotbook());
        System.out.println("5 = " + produto.getMac());
        util.PegarNumero();
        comprador.setEscolha(util.VoltarNumero1());
        System.out.println("me informe o acrecimo");
        util.PegarNumeroF();
        comprador.setacrecimo(util.VoltarNumero1F());
        switch (comprador.getEscolha()) {
            case 1:
            float resuCelular = produto.getCelular() + comprador.getacrecimo();
            System.out.println(resuCelular);
                break;
            case 2:
            float resuTablet = produto.getTablet() + comprador.getacrecimo();
            System.out.println(resuTablet);

                break;
            case 3:
            float resuPc = produto.getPc() + comprador.getacrecimo();
            System.out.println(resuPc);
                break;
            case 4:
            float resuNotbook = produto.getNotbook() + comprador.getacrecimo();
            System.out.println(resuNotbook);
                break;
            case 5:
            float resuMac = produto.getMac() + comprador.getacrecimo();
            System.out.println(resuMac);

                break;
            default:
                break;
        }


    }
}
