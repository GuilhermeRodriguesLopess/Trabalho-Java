import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        
        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = ler.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = ler.nextInt();
        String concate = String.valueOf(num1) + String.valueOf(num2);
        System.out.println("A concatenação dos números é: " + concate);
         ler.close();
    }

}