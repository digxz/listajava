package Algoritmos;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double varA, varB, varTroca;

        System.out.print("Digite a variável A: ");
        varA = entrada.nextDouble();

        System.out.print("Digite a variável B: ");
        varB = entrada.nextDouble();

        varTroca = varA;
        varA = varB;
        varB = varTroca;

        //A 'var Troca' passa a receber o valor da 'var A', e então a 'var A' recebe o valor da 'var B', e após isso,
        //a 'var B' recebe o valor da 'var Troca', já que ela continha o valor da 'var A'

        System.out.println("A variável A agora é: " + varA);
        System.out.println("A variável B agora é: " + varB);

    }
}
