package br.edu.up.exercises;
import br.edu.up.Modelos.*;
public class Ex15 {
    public static void run() {
        Wutil util = new Wutil();
        Carango concessionaria = new Carango();

        System.out.println("Escolha o carro para ver a promoção:");
        System.out.println("Opção 1: " + concessionaria.getFerrari());
        System.out.println("Opção 2: " + concessionaria.getFiat2014());
        System.out.println("Opção 3: " + concessionaria.getLamborghini());
        System.out.println("Opção 4: " + concessionaria.getUno());

        util.PegarNumero();
        concessionaria.setEscolhaCar(util.VoltarNumero1());

        System.out.println("Qual o combustível? (1) Álcool = 25%, (2) Gasolina = 21%, ou (3) Diesel = 14%");
        util.PegarNumero();
        concessionaria.setOpcaoCombustivel(util.VoltarNumero1());

        switch (concessionaria.getEscolhaCar()) {
            case 1:
                if (concessionaria.getOpcaoCombustivel() == 1) {
                    float imposto = concessionaria.getFerrari() * 0.25f;
                    concessionaria.util = concessionaria.getFerrari() + imposto;
                    System.out.println(concessionaria.util);
                } else if (concessionaria.getOpcaoCombustivel() == 2) {
                    float imposto = concessionaria.getFerrari() * 0.21f;
                    concessionaria.util = concessionaria.getFerrari() + imposto;
                    System.out.println(concessionaria.util);
                } else if (concessionaria.getOpcaoCombustivel() == 3) {
                    float imposto = concessionaria.getFerrari() * 0.14f;
                    concessionaria.util = concessionaria.getFerrari() + imposto;
                    System.out.println(concessionaria.util);
                } else {
                    System.out.println("Opção de combustível inválida!");
                }
                break;

            case 2:
                if (concessionaria.getOpcaoCombustivel() == 1) {
                    float imposto = concessionaria.getFiat2014() * 0.25f;
                    concessionaria.util = concessionaria.getFiat2014() + imposto;
                    System.out.println(concessionaria.util);
                } else if (concessionaria.getOpcaoCombustivel() == 2) {
                    float imposto = concessionaria.getFiat2014() * 0.21f;
                    concessionaria.util = concessionaria.getFiat2014() + imposto;
                    System.out.println(concessionaria.util);
                } else if (concessionaria.getOpcaoCombustivel() == 3) {
                    float imposto = concessionaria.getFiat2014() * 0.14f;
                    concessionaria.util = concessionaria.getFiat2014() + imposto;
                    System.out.println(concessionaria.util);
                } else {
                    System.out.println("Opção de combustível inválida!");
                }
                break;

            case 3:
                if (concessionaria.getOpcaoCombustivel() == 1) {
                    float imposto = concessionaria.getLamborghini() * 0.25f;
                    concessionaria.util = concessionaria.getLamborghini() + imposto;
                    System.out.println(concessionaria.util);
                } else if (concessionaria.getOpcaoCombustivel() == 2) {
                    float imposto = concessionaria.getLamborghini() * 0.21f;
                    concessionaria.util = concessionaria.getLamborghini() + imposto;
                    System.out.println(concessionaria.util);
                } else if (concessionaria.getOpcaoCombustivel() == 3) {
                    float imposto = concessionaria.getLamborghini() * 0.14f;
                    concessionaria.util = concessionaria.getLamborghini() + imposto;
                    System.out.println(concessionaria.util);
                } else {
                    System.out.println("Opção de combustível inválida!");
                }
                break;

            case 4:
                if (concessionaria.getOpcaoCombustivel() == 1) {
                    float imposto = concessionaria.getUno() * 0.25f;
                    concessionaria.util = concessionaria.getUno() + imposto;
                    System.out.println(concessionaria.util);
                } else if (concessionaria.getOpcaoCombustivel() == 2) {
                    float imposto = concessionaria.getUno() * 0.21f;
                    concessionaria.util = concessionaria.getUno() + imposto;
                    System.out.println(concessionaria.util);
                } else if (concessionaria.getOpcaoCombustivel() == 3) {
                    float imposto = concessionaria.getUno() * 0.14f;
                    concessionaria.util = concessionaria.getUno() + imposto;
                    System.out.println(concessionaria.util);
                } else {
                    System.out.println("Opção de combustível inválida!");
                }
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }
}
