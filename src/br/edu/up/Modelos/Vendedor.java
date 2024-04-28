package br.edu.up.Modelos;

public class Vendedor {

    private String nome;
    private float salario;
    private float totalDeVendas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getsalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getTotalDeVendas() {
        return totalDeVendas;
    }

    public void setTotalDeVendas(float totalDeVendas) {
        this.totalDeVendas = totalDeVendas;
    }

}
