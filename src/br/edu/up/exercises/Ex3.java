package br.edu.up.exercises;
import br.edu.up.Modelos.*;
public class Ex3 {

    public static void run() {
        Wutil util = new Wutil();
        Vendedor vendedor1 = new Vendedor();
        util.pegarNome();
        vendedor1.setNome(util.voltarNome1());
        System.out.println("me fale  o salario fixo");
        util.PegarNumeroF();
        vendedor1.setSalario(util.VoltarNumero1F());
        System.out.println("me fale o total de vendas");
        util.PegarNumeroF();
        vendedor1.setTotalDeVendas(util.VoltarNumero1F());
        float totalDeVendasComJuros = vendedor1.getTotalDeVendas() * 1.15f; 
        System.out.printf("nome = %s total de venda %f salarario com juros adicionado %f", vendedor1.getNome(), vendedor1.getsalario(), totalDeVendasComJuros);
    }
}