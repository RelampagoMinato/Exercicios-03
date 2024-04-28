package br.edu.up.Modelos;

import java.util.Scanner;

public class Wutil {

    private int num1;
    private int num2;
    private int num3;
    private float num1F;
    private float num2F;
    private float num3F;
    private String nome1;
    private String nome2;

    public void PegarNumeros() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        num1 = scanner.nextInt();
        System.out.println("Digite o segundo número:");
        num2 = scanner.nextInt();
    }

    public void PegarNumerosF() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        num1F = scanner.nextFloat();
        System.out.println("Digite o segundo número:");
        num2F = scanner.nextFloat();
    }

    public void PegarNumeross() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        num1 = scanner.nextInt();
        System.out.println("Digite o segundo número:");
        num2 = scanner.nextInt();
        System.out.println("Digite o terceiro número:");
        num3 = scanner.nextInt();
    }

    public void PegarNumerossF() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        num1F = scanner.nextFloat();
        System.out.println("Digite o segundo número:");
        num2F = scanner.nextFloat();
        System.out.println("Digite o terceiro número:");
        num3F = scanner.nextFloat();
    }

    public void PegarNumero() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número:");
        num1 = scanner.nextInt();
    }

    public void PegarNumeroSemNada() {
        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextInt();
    }

    public void PegarNumeroF() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número:");
        num1F = scanner.nextFloat();
    }

    public void PegarNumeroSemNadaF() {
        Scanner scanner = new Scanner(System.in);
        num1F = scanner.nextFloat();
    }

    public void pegarNome() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("me diga o primeiro nome");
        nome1 = scanner.nextLine();
    }

    public void pegarNomeSemNada() {
        Scanner scanner = new Scanner(System.in);
        nome1 = scanner.nextLine();
    }

    public void pegarNomes() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("me diga o primeiro nome");
        nome1 = scanner.nextLine();
        System.out.println("me diga o segundo nome");
        nome2 = scanner.nextLine();
    }

    public int VoltarNumero1() {
        return num1;
    }

    public int VoltarNumero2() {
        return num2;
    }

    public int VoltarNumero3() {
        return num3;
    }

    public float VoltarNumero1F() {
        return num1F;
    }

    public float VoltarNumero2F() {
        return num2F;
    }

    public int VoltarNumero3F() {
        return num3;
    }

    public String voltarNome1() {
        return nome1;
    }

    public String voltarNome2() {
        return nome2;
    }

    public int ContaDeAdição(int a, int b) {
        return a + b;
    }

    public int ContaDeSubtração(int a, int b) {
        return a - b;
    }

    public int ContaDeMultiplicação(int a, int b) {
        return a * b;
    }

    public int ContaDeDivisão(int a, int b) {
        return a / b;
    }
}