import java.util.Scanner;

public class atleta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a idade do atleta: ");
        int idade = sc.nextInt();

        String categoria = idade < 18 ? "Juvenil": (idade >= 18 && idade <= 40) ? "Adulto" : "Master";
        System.out.println(categoria);
    }
}