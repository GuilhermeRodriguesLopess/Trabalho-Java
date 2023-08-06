import java.util.Scanner;

public class ex {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = ler.nextLine();
        System.out.print("Digite a sua idade: ");
        int idade = ler.nextInt();


        if (idade >= 18) {
            System.out.println(nome+ " maior de 18 anos.");
        } else {
            System.out.println(nome+ " menor de 18 anos.");
        }

        ler.close();
    }
}
