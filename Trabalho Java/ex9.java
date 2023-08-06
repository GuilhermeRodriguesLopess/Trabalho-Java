import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite a altura em metros: ");
        double altura = ler.nextDouble();
        
        System.out.print("Digite o sexo (M ou F): ");
        String sexo = ler.next();
        
        double peso;
        
        if (sexo.equalsIgnoreCase("M")) {
            peso = (72.7 * altura) - 58;
            System.out.println("O peso ideal é: " + peso + " kg");
        } else if (sexo.equalsIgnoreCase("F")) {
            peso = (62.1 * altura) - 44.7;
            System.out.println("O peso ideal é: " + peso + " kg");
        } else {
            System.out.println("Sexo inválido!");
        }
        ler.close();  
    }
}