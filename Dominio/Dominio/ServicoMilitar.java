package Dominio;

public class ServicoMilitar {
    private int totalAptas;
    private int totalInaptas;

    public ServicoMilitar() {
        totalAptas = 0;
        totalInaptas = 0;
    }

    public void verificarAptidao(PessoaApta pessoa) {
        if (pessoa.isAptaServicoMilitar()) {
            totalAptas++;
        } else {
            totalInaptas++;
        }
    }

    public void exibirTotais() {
        System.out.println("Total de pessoas aptas para o serviço militar: " + totalAptas);
        System.out.println("Total de pessoas inaptas para o serviço militar: " + totalInaptas);
    }
}
