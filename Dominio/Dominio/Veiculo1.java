package Dominio;
public class Veiculo1 {
    private String tipoCombustivel;
    private double valor;

    public Veiculo1(String tipoCombustivel, double valor) {
        this.tipoCombustivel = tipoCombustivel;
        this.valor = valor;
    }

    public double calcularDesconto() {
        if (tipoCombustivel.equalsIgnoreCase("álcool")) {
            return valor * 0.25;
        } else if (tipoCombustivel.equalsIgnoreCase("gasolina")) {
            return valor * 0.21;
        } else if (tipoCombustivel.equalsIgnoreCase("diesel")) {
            return valor * 0.14;
        } else {
            return 0; 
        }
    }

    public double calcularValorPago() {
        return valor - calcularDesconto();
    }

    public double getValor() {
        return valor;
    }
}
