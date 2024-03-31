package Dominio;
public class ContadeLuz {
    private int tipoCliente;
    private double consumo;

    public ContadeLuz(int tipoCliente, double consumo) {
        this.tipoCliente = tipoCliente;
        this.consumo = consumo;
    }

    public double calcularValor() {
        double valorKWh = 0;
        switch (tipoCliente) {
            case 1:
                valorKWh = 0.60;
                break;
            case 2:
                valorKWh = 0.48;
                break;
            case 3:
                valorKWh = 1.29;
                break;
            default:
                System.out.println("Tipo de cliente inválido.");
                return 0;
        }
        return consumo * valorKWh;
    }
}
