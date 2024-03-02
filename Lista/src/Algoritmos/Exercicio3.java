package Algoritmos;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double anoDeNascimento, anoAtual, idadeAnos, idadeMeses, idadeDias;

        System.out.print("Informe o ano que você nasceu: ");
        anoDeNascimento = entrada.nextDouble();

        System.out.print("Informe o ano atual: ");
        anoAtual = entrada.nextDouble();

        idadeAnos = anoAtual - anoDeNascimento;
        idadeMeses = idadeAnos * 12;
        idadeDias = idadeMeses * 30.4167;

        System.out.println("Sua idade em anos é: " + idadeAnos);
        System.out.println("Sua idade em meses é: " + idadeMeses);
        System.out.println("Sua idade em dias é: " + idadeDias);

    }
}
