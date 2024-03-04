package Algoritmos;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double varA, varB, soma, subtracao, multiplicacao, divisao;

        System.out.print("Digite a variável A: ");
        varA = entrada.nextDouble();

        System.out.print("Digite a variável B: ");
        varB = entrada.nextDouble();

        soma = varA + varB;
        subtracao = varA - varB;
        multiplicacao = varA * varB;
        divisao = varA / varB;

        System.out.println("A soma das variáveis resulta em: " + soma);
        System.out.println("A subtração das variáveis resulta em: " + subtracao);
        System.out.println("A multiplicação das variáveis resulta em: " + multiplicacao);
        System.out.println("A divisão das variáveis resulta em: " + divisao);


    }
}
