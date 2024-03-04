package Algoritmos;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valorEmDolar, cotacaoDolar, valorEmReal;

        System.out.print("Digite o valor em dólar: ");
        valorEmDolar = entrada.nextDouble();

        System.out.print("Digite a cotação do dólar: ");
        cotacaoDolar = entrada.nextDouble();

        valorEmReal = valorEmDolar * cotacaoDolar;

        System.out.println(valorEmReal);
    }
}
