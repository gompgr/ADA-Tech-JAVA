package org.example;

import java.util.Random;
import java.util.Scanner;

public class adivinheOnumero {
    public static void main(String[] args) {

        //gerar numero randomico de 1 a 10
        Random random = new Random();
        int adivinhe = random.nextInt(10) + 1;
        //imprimir na tela adivinhe o numero entre 1 e 10
        System.out.println("Adivinhe o numero entre 1 e 10!");
        //pegar numero digitado pelo usuario
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        //condicional
        while (numero != adivinhe) {
            if (numero > adivinhe) {
                System.out.println("Número inserido é muito alto");
            } else {
                System.out.println("Número inserido é muito baixo");
            }
            numero = scanner.nextInt();
        }
            System.out.println("Você acertou o numero!");


            }
        }
