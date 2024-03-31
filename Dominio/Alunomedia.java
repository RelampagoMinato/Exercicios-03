package Dominio;
public class Alunomedia {
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;

    public Alunomedia(String nome, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    
    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public void exibirMediaSemestre() {
        double media = calcularMedia();
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Média do semestre: " + media);
    }
}