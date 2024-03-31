package Dominio;

public class Professor {
    public String nome;
    private int nivel;

    public Professor(String nome, int nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }

    public double calcularSalario(int horasAula) {
        double valorHoraAula = obterValorHoraAula();
        return valorHoraAula * horasAula;
    }

    private double obterValorHoraAula() {
        switch (nivel) {
            case 1:
                return 12.00;
            case 2:
                return 17.00;
            case 3:
                return 25.00;
            default:
                return 0.00;
        }
    }
}
