package Algoritmos;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario, salarioAcrescido;

        System.out.print("Informe o seu salário: ");
        salario = entrada.nextDouble();

        salarioAcrescido = salario + (salario * 0.25);

        System.out.println("O novo salário será: R$" + salarioAcrescido);

    }
}
