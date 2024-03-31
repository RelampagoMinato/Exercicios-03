package Dominio;
public class Funcionario2 {
    private String nome;
    private double salarioAtual;

    public Funcionario2(String nome, double salarioAtual) {
        this.nome = nome;
        this.salarioAtual = salarioAtual;
    }

    public void reajustarSalario(double salarioMinimo, double percentualReajuste) {
        double novoSalario = salarioAtual + (salarioAtual * percentualReajuste / 100);
        double reajuste = novoSalario - salarioAtual;
        System.out.println("Nome do funcionário: " + nome);
        System.out.println("Reajuste: " + reajuste);
        System.out.println("Novo salário: " + novoSalario);

        double aumentoFolha = novoSalario - salarioAtual;
        System.out.println("Aumento na folha de pagamento: " + aumentoFolha);
    }
}
