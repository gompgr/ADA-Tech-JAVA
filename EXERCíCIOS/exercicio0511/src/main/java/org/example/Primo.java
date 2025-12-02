package org.example;

import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("digite um numero inteiro");
        int numero = scan.nextInt();
        scan.close();
        String primo = (numero / 1 == numero) && (numero / numero != 1) ? "não primo" : "primo";
        System.out.println(primo);
    }

}
