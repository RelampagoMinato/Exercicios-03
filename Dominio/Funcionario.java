
public class Funcionario {
    private String nome;
    private double salario;
    private static double salarioMinimo = 1100; 

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void aplicarReajuste() {
        if (salario < 3 * salarioMinimo) {
            salario *= 1.5; 
        } else if (salario >= 3 * salarioMinimo && salario < 10 * salarioMinimo) {
            salario *= 1.2; 
        } else if (salario >= 10 * salarioMinimo && salario < 20 * salarioMinimo) {
            salario *= 1.15;
        } else {
            salario *= 1.1; 
        }
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
}
