package br.edu.up.exercises;
import br.edu.up.Modelos.*;
public class Ex23 {
    public static void run() {
        Wutil util = new Wutil();
        Usuario usuario = new Usuario();
        System.out.println("Informe o nome:");
        util.pegarNomeSemNada();
        usuario.setSexo(util.voltarNome1());
        System.out.println("Informe o sexo (M/F):");
        util.pegarNomeSemNada();
        usuario.setSexo(util.voltarNome1());
        System.out.println("Informe a altura:");
        util.PegarNumeroSemNadaF();
        usuario.setAltura(util.VoltarNumero1F());
        System.out.println("Informe a idade:");
        util.PegarNumeroSemNada();
        usuario.setIdade(util.VoltarNumero1());

        if (usuario.getSexo().equalsIgnoreCase("m") || (usuario.getSexo().equalsIgnoreCase("masculino"))) {
            if (usuario.getAltura() > 1.70f) {
                if (usuario.getIdade() <= 20) {
                    float resu = (72.7f * usuario.getAltura()) - 58;
                    System.out.println("O peso ideal para um homem de " + usuario.getAltura() + " metros e "
                            + usuario.getIdade() + " anos é: " + resu);
                } else if (usuario.getIdade() >= 21 && usuario.getIdade() <= 39) {
                    float resu = (72.7f * usuario.getAltura()) - 53;
                    System.out.println("O peso ideal para um homem de " + usuario.getAltura() + " metros e "
                            + usuario.getIdade() + " anos é: " + resu);
                } else if (usuario.getIdade() > 40) {
                    float resu = (72.7f * usuario.getAltura()) - 45;
                    System.out.println("O peso ideal para um homem de " + usuario.getAltura() + " metros e "
                            + usuario.getIdade() + " anos é: " + resu);
                }
            } else {
                if (usuario.getIdade() <= 40) {
                    float resu = (72.7f * usuario.getAltura()) - 50;
                    System.out.println("O peso ideal para um homem de " + usuario.getAltura() + " metros e "
                            + usuario.getIdade() + " anos é: " + resu);
                } else if (usuario.getIdade() > 40) {
                    float resu = (72.7f * usuario.getAltura()) - 58;
                    System.out.println("O peso ideal para um homem de " + usuario.getAltura() + " metros e "
                            + usuario.getIdade() + " anos é: " + resu);
                }
            }
        } else if (usuario.getSexo().equalsIgnoreCase("f") || usuario.getSexo().equalsIgnoreCase("feminino")) {
            if (usuario.getAltura() > 1.70f) {
                if (usuario.getIdade() <= 20) {
                    float resu = (72.7f * usuario.getAltura()) - 58;
                    System.out.println("O peso ideal para uma mulher de " + usuario.getAltura() + " metros e "
                            + usuario.getIdade() + " anos é: " + resu);
                } else if (usuario.getIdade() >= 21 && usuario.getIdade() <= 39) {
                    float resu = (72.7f * usuario.getAltura()) - 53;
                    System.out.println("O peso ideal para uma mulher de " + usuario.getAltura() + " metros e "
                            + usuario.getIdade() + " anos é: " + resu);
                } else if (usuario.getIdade() > 40) {
                    float resu = (72.7f * usuario.getAltura()) - 45;
                    System.out.println("O peso ideal para uma mulher de " + usuario.getAltura() + " metros e "
                            + usuario.getIdade() + " anos é: " + resu);
                }
            } else {
                if (usuario.getIdade() <= 40) {
                    float resu = (72.7f * usuario.getAltura()) - 50;
                    System.out.println("O peso ideal para uma mulher de " + usuario.getAltura() + " metros e "
                            + usuario.getIdade() + " anos é: " + resu);
                } else if (usuario.getIdade() > 40) {
                    float resu = (72.7f * usuario.getAltura()) - 58;
                    System.out.println("O peso ideal para uma mulher de " + usuario.getAltura() + " metros e "
                            + usuario.getIdade() + " anos é: " + resu);
                }
            }
        } else {
            System.out.println("Sexo inválido.");
        }
    }
}
