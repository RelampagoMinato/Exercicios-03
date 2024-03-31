package Dominio;
public class Seguro {
    private String nome;
    private int idade;
    private int grupoRisco;

    public Seguro(String nome, int idade, int grupoRisco) {
        this.nome = nome;
        this.idade = idade;
        this.grupoRisco = grupoRisco;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getGrupoRisco() {
        return grupoRisco;
    }

    public String calcularCategoria() {
        if (idade >= 17 && idade <= 20) {
            switch (grupoRisco) {
                case 1:
                    return "Categoria 1";
                case 2:
                    return "Categoria 2";
                case 3:
                    return "Categoria 3";
                default:
                    return "Nenhuma categoria encontrada";
            }
        } else if (idade >= 21 && idade <= 24) {
            switch (grupoRisco) {
                case 2:
                    return "Categoria 2";
                case 3:
                    return "Categoria 3";
                case 4:
                    return "Categoria 4";
                default:
                    return "Nenhuma categoria encontrada";
            }
        } else if (idade >= 25 && idade <= 34) {
            switch (grupoRisco) {
                case 3:
                    return "Categoria 3";
                case 4:
                    return "Categoria 4";
                case 5:
                    return "Categoria 5";
                default:
                    return "Nenhuma categoria encontrada";
            }
        } else if (idade >= 35 && idade <= 64) {
            switch (grupoRisco) {
                case 4:
                    return "Categoria 4";
                case 5:
                    return "Categoria 5";
                case 6:
                    return "Categoria 6";
                default:
                    return "Nenhuma categoria encontrada";
            }
        } else if (idade >= 65 && idade <= 70) {
            switch (grupoRisco) {
                case 7:
                    return "Categoria 7";
                case 8:
                    return "Categoria 8";
                case 9:
                    return "Categoria 9";
                default:
                    return "Nenhuma categoria encontrada";
            }
        } else {
            return "Idade não está na faixa necessária";
        }
    }
}
