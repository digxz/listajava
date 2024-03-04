package Algoritmos;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double pesoDoSacoEmQuilos, pesoDoSacoEmGramas, quantidadeDiaria, quantidadeFinal, resto, restoEmKg;

        //Recebe em quilos, converte para gramas, e calcula quanto resta em gramas.

    System.out.print("Digite quantos quilos tem o saco de ração: ");
    pesoDoSacoEmQuilos = entrada.nextDouble();

    System.out.print("Digite quantas gramas de ração os gatos consomem por dia: ");
    quantidadeDiaria = entrada.nextDouble();

    pesoDoSacoEmGramas = pesoDoSacoEmQuilos * 1000;
    quantidadeFinal = quantidadeDiaria * 5 * 2;


    resto = pesoDoSacoEmGramas - quantidadeFinal;
    restoEmKg = resto / 1000;
    System.out.println("O restante de ração após os 5 dias em quilogramas é: " + restoEmKg);


    }
}
