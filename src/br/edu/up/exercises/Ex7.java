package br.edu.up.exercises;
import br.edu.up.Modelos.*;
public class Ex7 {
    public static void run(){
        Concessionaria concessionaria = new Concessionaria();
        Consumidor consumidor = new Consumidor();
        Wutil util = new Wutil();
        System.out.println("os produtos sao");
        System.out.println("1 ferrari = " + concessionaria.getFerrari());
        System.out.println("2 fiat2014 = " + concessionaria.getFiat2014());
        System.out.println("3 lamborghini = " + concessionaria.getLamborghini());
        System.out.println("4 uno = " + concessionaria.getUno());
        util.PegarNumero();
        consumidor.setEscolha(util.VoltarNumero1());
        float total = 0;
        float imposto = 0;
        float distribuidor = 0;
        
        switch (consumidor.getEscolha()) {
            case 1:
            imposto = concessionaria.getFerrari() * 0.45f;
            distribuidor = concessionaria.getFerrari() * 0.28f;
            total = concessionaria.getFerrari() + imposto + distribuidor;
                break;
            case 2:
            imposto = concessionaria.getFiat2014() * 0.45f;
            distribuidor = concessionaria.getFiat2014() * 0.28f;
            total = concessionaria.getFiat2014() + imposto + distribuidor;
                break;
            case 3:
            imposto = concessionaria.getLamborghini() * 0.45f;
            distribuidor = concessionaria.getLamborghini() * 0.28f;
            total = concessionaria.getLamborghini() + imposto + distribuidor;
                break;

            case 4:
            imposto = concessionaria.getUno() * 0.45f;
            distribuidor = concessionaria.getUno() * 0.28f;
            total = concessionaria.getUno() + imposto + distribuidor;
                break;
            default:
                break;
        }

        System.out.println(total);
    }
}

