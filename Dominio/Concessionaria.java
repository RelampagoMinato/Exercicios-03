package Dominio;

public class Concessionaria {
    private int totalCarrosAte2000;
    private int totalGeral;

    public Concessionaria() {
        totalCarrosAte2000 = 0;
        totalGeral = 0;
    }

    public void calcularDesconto(Veiculo veiculo) {
        double desconto;
        if (veiculo.getAno() <= 2000) {
            desconto = 0.12; // 12% de desconto para carros até 2000
            totalCarrosAte2000++;
        } else {
            desconto = 0.07; // 7% de desconto para carros acima de 2000
        }

        double valorDesconto = veiculo.getValor() * desconto;
        double valorFinal = veiculo.getValor() - valorDesconto;

        System.out.println("Desconto: R$" + valorDesconto);
        System.out.println("Valor a ser pago pelo cliente: R$" + valorFinal);

        totalGeral++;
    }

    public void exibirTotais() {
        System.out.println("Total de carros até o ano 2000: " + totalCarrosAte2000);
        System.out.println("Total geral de carros: " + totalGeral);
    }
}
