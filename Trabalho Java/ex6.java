import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um numero decimal: ");
         int num = ler.nextInt();

        if (num > 0) {
            System.out.println("O numero "+num+ " é positivo");
        } if (num < 0) {
            System.out.println("O numero "+num+ " é negativo");
        } if (num == 0) {
            System.out.println("O numero digitado é "+num);
        }

        ler.close();
    }

}