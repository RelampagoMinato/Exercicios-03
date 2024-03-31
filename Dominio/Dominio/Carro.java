package Dominio;
public class Carro {
    private double custoFabrica;
    private double percentagemDistribuidor = 0.28; 
    private double impostos = 0.45; 

    public Carro(double custoFabrica) {
        this.custoFabrica = custoFabrica;
    }

    public double calcularCustoAoConsumidor() {
        double custoComImpostos = custoFabrica * (1 + impostos);
        double custoFinal = custoComImpostos * (1 + percentagemDistribuidor);
        return custoFinal;
    }

    public void exibirCustoAoConsumidor() {
        double custoAoConsumidor = calcularCustoAoConsumidor();
        System.out.println("O custo ao consumidor do carro é: R$" + custoAoConsumidor);
    }
}