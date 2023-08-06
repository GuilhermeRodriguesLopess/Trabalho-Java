import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

       
        System.out.print("Digite seu nome: ");
        String nome = ler.nextLine();


        System.out.print("Digite sua idade: ");
        int idade = ler.nextInt();
        ler.nextLine(); 

     
        System.out.print("Digite a cidade onde reside: ");
        String cidade = ler.nextLine();

      
        System.out.println("Seu nome é: " + nome + " Você tem " + idade + " anos e mora em " + cidade);
        ler.close();
    }
}