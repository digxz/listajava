package Algoritmos;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double raio, volume;

        System.out.print("Digite o valor do Raio: ");
        raio = entrada.nextDouble();

        volume = (4/3) * 3.14159 * (raio * raio * raio);

        System.out.println("O volume da esfera resulta em: " + volume);
    }
}
