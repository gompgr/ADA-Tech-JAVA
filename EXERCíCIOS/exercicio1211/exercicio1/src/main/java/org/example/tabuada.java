package org.example;

import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        //pedir numero ao usuario
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = scan.nextInt();
        //for para tabuada
        for (int i = 1; i <= 10 ; i++) {
            int multiplicacao = numero * i;
            System.out.println(numero + "x" + i + "=" + multiplicacao);
        }
    }

}
