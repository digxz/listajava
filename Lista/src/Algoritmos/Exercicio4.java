package Algoritmos;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double pesoDoSacoEmQuilos, pesoDoSacoEmGramas, quantidadeDiaria, quantidadeFinal, resto;

        //Recebe em quilos, converte para gramas, e calcula quanto resta em gramas.

    System.out.print("Digite quantos quilos tem o saco de ração: ");
    pesoDoSacoEmQuilos = entrada.nextDouble();

    System.out.print("Digite quantas gramas de ração os gatos consomem por dia: ");
    quantidadeDiaria = entrada.nextDouble();

    pesoDoSacoEmGramas = pesoDoSacoEmQuilos * 1000;
    quantidadeFinal = quantidadeDiaria * 5;

    resto = pesoDoSacoEmGramas - quantidadeFinal;

    System.out.println("O restante de ração após os 5 dias em gramas é: " + resto);


    }
}
