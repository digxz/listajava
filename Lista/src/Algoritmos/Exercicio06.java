package Algoritmos;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double comprimento, largura, altura, volume;

        System.out.print("Digite o comprimento da caixa: ");
        comprimento = entrada.nextDouble();

        System.out.print("Digite a largura da caixa: ");
        largura = entrada.nextDouble();

        System.out.print("Digite a altura da caixa: ");
        altura = entrada.nextDouble();

        volume = comprimento * largura * altura;

        System.out.println("O volume da caixa é: " + volume);
    }
}
