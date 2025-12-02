import java.util.Scanner;

public class bissexto {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um ano para saber se é bissexto: ");
        int ano = scanner.nextInt();
        int var;

        String bissexto = ano % 4 == 0 && ano % 100 !=0 || ano % 400 == 0 ? "bissexto":"não bissexto";
        System.out.println(bissexto);
    }
}