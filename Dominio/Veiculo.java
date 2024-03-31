package Dominio;

public class Veiculo {
    private int ano;
    private double valor;

    public Veiculo(int ano, double valor) {
        this.ano = ano;
        this.valor = valor;
    }

    public int getAno() {
        return ano;
    }

    public double getValor() {
        return valor;
    }
}
