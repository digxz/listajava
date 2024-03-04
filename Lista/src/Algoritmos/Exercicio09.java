package Algoritmos;

import java.util.Scanner;
public class Exercicio09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double varA, varB, varC, soma, quadrado;

        System.out.print("Digite a variável A: ");
        varA = entrada.nextDouble();

        System.out.print("Digite a variável B: ");
        varB = entrada.nextDouble();

        System.out.print("Digite a variável C: ");
        varC = entrada.nextDouble();

        soma = varA + varB + varC;
        quadrado = soma * soma;

        System.out.println("O quadrado da soma entre as variáveis resulta em: " + quadrado);
    }
}
