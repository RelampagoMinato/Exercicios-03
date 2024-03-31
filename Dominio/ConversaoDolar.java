package Dominio;
public class ConversaoDolar {
    private double cotacaoDolar;
    private double quantidadeDolar;
 
    public ConversaoDolar(double cotacaoDolar, double quantidadeDolar) {
        this.cotacaoDolar = cotacaoDolar;
        this.quantidadeDolar = quantidadeDolar;
    }
    

    public double calcularValorEmReais() {
        return cotacaoDolar * quantidadeDolar;
    }
    
    public void exibirInformacoes() {
        System.out.println("Cotação do dólar: R$" + cotacaoDolar);
        System.out.println("Quantidade de dólares: " + quantidadeDolar);
        System.out.println("Valor em reais: R$" + calcularValorEmReais());
    }
}
