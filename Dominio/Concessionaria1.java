import Dominio.Veiculo1;

public class Concessionaria1 {
    private double totalDesconto;
    private double totalPago;

    public Concessionaria1() {
        totalDesconto = 0;
        totalPago = 0;
    }

    public void registrarVenda(Veiculo1 veiculo) {
        double desconto = veiculo.calcularDesconto();
        double valorPago = veiculo.calcularValorPago();

        totalDesconto += desconto;
        totalPago += valorPago;

        System.out.println("Valor do veículo: " + veiculo.getValor());
        System.out.println("Desconto aplicado: " + desconto);
        System.out.println("Valor pago pelo cliente: " + valorPago);
        System.out.println();
    }

    public double getTotalDesconto() {
        return totalDesconto;
    }

    public double getTotalPago() {
        return totalPago;
    }
}
