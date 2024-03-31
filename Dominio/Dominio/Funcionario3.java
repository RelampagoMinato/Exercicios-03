package Dominio;


public class Funcionario3 {
    private String nome;
    private int idade;
    private char sexo;
    private double salarioFixo;

    public Funcionario3(String nome, int idade, char sexo, double salarioFixo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.salarioFixo = salarioFixo;
    }

    public double calcularAbono() {
        double abono = 0;
        if (sexo == 'M') {
            if (idade >= 30) {
                abono = 100;
            } else {
                abono = 50;
            }
        } else if (sexo == 'F') {
            if (idade >= 30) {
                abono = 200;
            } else {
                abono = 80;
            }
        }
        return abono;
    }
    public double calcularSalarioLiquido() {
        double abono = calcularAbono();
        return salarioFixo + abono;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }
}
