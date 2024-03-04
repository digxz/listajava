package Algoritmos;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valorInteiro, sucessor, antecessor;

        System.out.print("Digite o número inteiro: ");
        valorInteiro =  entrada.nextInt();

        sucessor = valorInteiro + 1;
        antecessor = valorInteiro - 1;

        System.out.println("O sucessor do número é: " + sucessor);
        System.out.println("O antecessor do número é: " + antecessor);

    }
}
