package org.example;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.Scanner;

public class agendamento {
    public static void main(String[] args) {
        System.out.println("Vamos agendar o proximo compromisso: ");
        try (Scanner scan = new Scanner(System.in)){

            System.out.println("Digite o ano: ");
            int ano = scan.nextInt();

            System.out.println("Digite o mes: ");
            int mes = scan.nextInt();

            System.out.println("Digite o dia: ");
            int dia = scan.nextInt();

            System.out.println("Digite a hora: ");
            int hora = scan.nextInt();

            System.out.println("Digite o minuto: ");
            int minuto = scan.nextInt();

            LocalDateTime agendamento = LocalDateTime.of(ano, mes, dia, hora, minuto);

            LocalDateTime hoje = LocalDateTime.now();

            DayOfWeek diaUtil = agendamento.getDayOfWeek(); //esta pegando o dia da semana
            int horario = agendamento.getHour();  //esta pegando a hora

            if (diaUtil == DayOfWeek.SATURDAY || diaUtil == DayOfWeek.SUNDAY){
                System.out.println("Não agendado: fim de semana.");
            } else if (horario < 9 || horario > 18)
                System.out.println("Não agendado: fora do horário comercial.");
            else {
                System.out.println("Agendamento confirmado!");
            }

        }
        catch (Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
        }
    }
