package Dominio;

public class PessoaApta {
    private String nome;
    private char sexo;
    private int idade;
    private boolean saude;

    public PessoaApta(String nome, char sexo, int idade, boolean saude) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.saude = saude;
    }

    public boolean isAptaServicoMilitar() {
        return (idade >= 18 && saude);
    }
}
