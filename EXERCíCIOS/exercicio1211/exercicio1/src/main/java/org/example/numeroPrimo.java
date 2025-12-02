package org.example;

import java.util.Scanner;

public class numeroPrimo {
    public static void main(String[] args) {

        System.out.println("Informe um numero inteiro!");
        var scanner = new Scanner(System.in);
        int primo = scanner.nextInt();

        if (primo < 10){
            System.out.println(primo);

        } else {
            System.out.println("muito grande");
        }

    }
}
