package Dominio;
public class Alunonota {
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;

    
    public Alunonota(String nome, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }
    public void exibirMencao() {
        double media = calcularMedia();
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Média: " + media);

        if (media >= 7) {
            System.out.println("Menção: Aprovado");
        } else if (media <= 5) {
            System.out.println("Menção: Reprovado");
        } else {
            System.out.println("Menção: Recuperação");
        }
    }
}
