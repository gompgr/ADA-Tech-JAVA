package org.example;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate hoje = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Informe um feriado no formato dd/mm/yyyy");
        String dataInformada = sc.nextLine();
        LocalDate feriado = LocalDate.parse(dataInformada, formato);
        //System.out.println(hoje);
        //System.out.println(dataInformada);
        DayOfWeek dia = feriado.getDayOfWeek();
        if (dia == DayOfWeek.TUESDAY || dia == DayOfWeek.THURSDAY) {
            System.out.println("Vamos planejar uma viagem no feriado!");
            //Contagem de dias úteis dentro do if e não uteis fora do if
            int diasuteis = 0;
            int quantosDias = 0;
            while (hoje.isBefore(feriado)) {
                quantosDias++;
                DayOfWeek diaDaSemana = hoje.getDayOfWeek();
                if (diaDaSemana != DayOfWeek.SATURDAY && diaDaSemana != DayOfWeek.SUNDAY) {
                    diasuteis++;
                }
                hoje = hoje.plusDays(1);

            }
            //contagem de semanas
            int semanas = quantosDias / 7;
            //impressão das informações
            System.out.println("Total de dias até o feriado: " + quantosDias);
            System.out.println("Total de dias úteis até o feriado: " + diasuteis);
            System.out.println("Faltam " + semanas +" semanas para o feriado!");
        }


        sc.close();
    }
}
