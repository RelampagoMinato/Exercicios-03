package Dominio;

public class Vendedor {
    private String nome;
    private double salarioFixo;
    private double totalVendas;
    
    public Vendedor(String nome, double salarioFixo, double totalVendas) {
        this.nome = nome;
        this.salarioFixo = salarioFixo;
        this.totalVendas = totalVendas;
    }
    
    public double calcularSalarioFinal() {
        double comissao = 0.15 * totalVendas;
        return salarioFixo + comissao;
    }
    
    public void exibirInformacoes() {
        System.out.println("Nome do vendedor: " + nome);
        System.out.println("Salário fixo: R$" + salarioFixo);
        System.out.println("Total de vendas: R$" + totalVendas);
        System.out.println("Salário final: R$" + calcularSalarioFinal());
    }
}