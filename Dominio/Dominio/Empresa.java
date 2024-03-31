package Dominio;

import Funcionario;

public class Empresa {
    private Funcionario[] funcionarios;
    private int totalFuncionarios;

    public Empresa(int capacidade) {
        funcionarios = new Funcionario[capacidade];
        totalFuncionarios = 0;
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        if (totalFuncionarios < funcionarios.length) {
            funcionarios[totalFuncionarios] = funcionario;
            totalFuncionarios++;
        } else {
            System.out.println("Capacidade máxima de funcionários atingida.");
        }
    }

    public void aplicarReajusteSalario() {
        for (int i = 0; i < totalFuncionarios; i++) {
            funcionarios[i].aplicarReajuste();
        }
    }

    public void exibirSalarios() {
        for (int i = 0; i < totalFuncionarios; i++) {
            System.out.println("Nome: " + funcionarios[i].getNome() + ", Salário: " + funcionarios[i].getSalario());
        }
    }
}
