package Algoritmos;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario, percentual, salarioAcrescido;

        System.out.print("Informe o seu salário: ");
        salario = entrada.nextDouble();

        System.out.print("Informe a porcentagem que deverá ser acrescida: ");
        percentual = entrada.nextDouble();

        salarioAcrescido = salario + (salario * (percentual / 100));

        System.out.println("O novo salário será: R$" + salarioAcrescido);
    }
}
