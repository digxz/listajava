package Algoritmos;

import java.util.Scanner;
public class Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double varA, varB, diferenca, quadrado;

        System.out.print("Digite a variável A: ");
        varA = entrada.nextDouble();

        System.out.print("Digite a variável B: ");
        varB = entrada.nextDouble();

        diferenca = varA - varB;
        quadrado = diferenca * diferenca;

        System.out.println("O quadrado da diferença entre as variáveis resulta em: " + quadrado);

    }
}
