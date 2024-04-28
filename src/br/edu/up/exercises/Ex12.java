package br.edu.up.exercises;
import br.edu.up.Modelos.*;
public class Ex12 {
    public static void run() {
        Wutil util = new Wutil();
        LojaDeCarro concessionaria = new LojaDeCarro();
        System.out.println("escolha o carro para ver a promoçao");
        System.out.println("opçao 1: " + concessionaria.getFerrari());
        System.out.println("opçao 2: " + concessionaria.getFiat2014());
        System.out.println("opçao 3: " + concessionaria.getLamborghini());
        System.out.println("opçao 4: " + concessionaria.getUno());
        util.PegarNumero();
        int escolha = util.VoltarNumero1();
        switch (escolha) {
            case 1:
                if (concessionaria.getFerrariAno() <= 2000) {
                    float desconto = concessionaria.getFerrari() * 0.12f;
                    
                    concessionaria.setNovoPreço(concessionaria.getFerrari() + desconto);
                    System.out.println(concessionaria.getNovoPreço());
                    System.out.println("se vc quer ver os outros carros aperte 1 se quiser fechar o programa apert 2");
                    util.PegarNumero();
                    escolha = util.VoltarNumero1();
                    if (escolha == 1) {
                        Ex12.run();
                    }
                } else if (concessionaria.getFerrariAno() > 2000) {
                    float desconto = concessionaria.getFerrari() * 0.07f;
                    concessionaria.setNovoPreço(concessionaria.getFerrari() + desconto);
                    System.out.println(concessionaria.getNovoPreço());
                    System.out.println("se vc quer ver os outros carros aperte 1 se quiser fechar o programa apert 2");
                    util.PegarNumero();
                    escolha = util.VoltarNumero1();
                    if (escolha == 1) {
                        Ex12.run();
                    } else
                        System.out.println("NAN");
                }
                break;
            case 2:
                if (concessionaria.getFiat2014Ano() <= 2000) {
                    float desconto = concessionaria.getFiat2014() * 0.12f;
                    concessionaria.setNovoPreço(concessionaria.getFiat2014() + desconto);
                    System.out.println(concessionaria.getNovoPreço());
                    System.out.println("se vc quer ver os outros carros aperte 1 se quiser fechar o programa apert 2");
                    util.PegarNumero();
                    escolha = util.VoltarNumero1();
                    if (escolha == 1) {
                        Ex12.run();
                    }
                } else if (concessionaria.getFiat2014Ano() > 2000) {
                    float desconto = concessionaria.getFiat2014() * 0.07f;
                    concessionaria.setNovoPreço(concessionaria.getFiat2014() + desconto);
                    System.out.println(concessionaria.getNovoPreço());
                    System.out.println("se vc quer ver os outros carros aperte 1 se quiser fechar o programa apert 2");
                    util.PegarNumero();
                    escolha = util.VoltarNumero1();
                    if (escolha == 1) {
                        Ex12.run();
                    } else
                        System.out.println("NAN");
                }
                break;
            case 3:
                if (concessionaria.getLamborghiniAno() <= 2000) {
                    float desconto = concessionaria.getLamborghini() * 0.12f;
                    concessionaria.setNovoPreço(concessionaria.getLamborghini() + desconto);
                    System.out.println(concessionaria.getNovoPreço());
                    System.out.println("se vc quer ver os outros carros aperte 1 se quiser fechar o programa apert 2");
                    util.PegarNumero();
                    escolha = util.VoltarNumero1();
                    if (escolha == 1) {
                        Ex12.run();
                    }
                } else if (concessionaria.getLamborghiniAno() > 2000) {
                    float desconto = concessionaria.getLamborghini() * 0.07f;
                    concessionaria.setNovoPreço(concessionaria.getLamborghini() + desconto);
                    System.out.println(concessionaria.getNovoPreço());
                    System.out.println("se vc quer ver os outros carros aperte 1 se quiser fechar o programa apert 2");
                    util.PegarNumero();
                    escolha = util.VoltarNumero1();
                    if (escolha == 1) {
                        Ex12.run();
                    } else
                        System.out.println("NAN");
                }
                break;
            case 4:
                if (concessionaria.getUnoAno() <= 2000) {
                    float desconto = concessionaria.getUno() * 0.12f;
                    concessionaria.setNovoPreço(concessionaria.getUno() + desconto);
                    System.out.println(concessionaria.getNovoPreço());
                    System.out.println("se vc quer ver os outros carros aperte 1 se quiser fechar o programa apert 2");
                    util.PegarNumero();
                    escolha = util.VoltarNumero1();
                    if (escolha == 1) {
                        Ex12.run();
                    }
                } else if (concessionaria.getUnoAno() > 2000) {
                    float desconto = concessionaria.getUno() * 0.07f;
                    concessionaria.setNovoPreço(concessionaria.getUno() + desconto);
                    System.out.println(concessionaria.getNovoPreço());
                    System.out.println("se vc quer ver os outros carros aperte 1 se quiser fechar o programa apert 2");
                    util.PegarNumero();
                    escolha = util.VoltarNumero1();
                    if (escolha == 1) {
                        Ex12.run();
                    } else
                        System.out.println("NAN");
                }
                break;
            default:
                break;
        }

    }
}
