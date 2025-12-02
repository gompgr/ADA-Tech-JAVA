package org.example;

import java.util.Scanner;

public class divisaoSegura {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            //informe o primeiro numero
            System.out.println("Informe um número inteiro: ");
            int prim = scan.nextInt();
            //informe o segundo numero
            System.out.println("Informe outro número inteiro: ");
            int sec = scan.nextInt();
            int operacao = prim / sec;

            System.out.println("resultado = " + operacao);

        } catch (ArithmeticException e) {
            System.out.println("Erro de calculo: " + e.getMessage());
        }
    }
}
