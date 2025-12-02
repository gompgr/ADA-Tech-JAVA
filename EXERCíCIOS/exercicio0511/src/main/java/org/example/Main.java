import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o primeiro número inteiro: ");
        int n1 = sc.nextInt();
        System.out.println("Informe o segundo número inteiro: ");
        int n2 = sc.nextInt();
        System.out.println("Informe qual a operação: ");
        String op = sc.next();

        int resultado = 0;

        if (op.equals("+")) {
            resultado = n1 + n2;
        } else if (op.equals("-")) {
            resultado = n1 - n2;
        } else if (op.equals ("*")) {
            resultado = n1 * n2;
        }
        else if (op.equals("/") && n2 != 0){
            resultado = n1 / n2;
        }
        else {
            System.out.println("Não é possivel divisão por 0");
            return;
        }
        System.out.printf("A operação de n1 %d %s n2 %d = %d \n",n1,op,n2,resultado);

    }

}