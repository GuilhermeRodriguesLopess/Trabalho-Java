import java.util.Scanner;

public class ex5 {
        public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

       
        System.out.print("Digite a primeira palavra: ");
        String palavra1 = ler.nextLine();

        System.out.print("Digite a segunda palavra: ");
        String palavra2 = ler.nextLine();

        System.out.print("Digite a terceira palavra: ");
        String palavra3 = ler.nextLine();

       
        String novapalavra = palavra1 + palavra2 + palavra3;

        
        System.out.println("A concatenação das palavras é: " + novapalavra);
        ler.close();
    }
}

