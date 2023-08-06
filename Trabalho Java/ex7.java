import java.util.Scanner;

    public class ex7 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();
    
            System.out.print("Digite o sexo: ");
            String sexo = scanner.nextLine();
    
            System.out.print("Digite o ano de nascimento: ");
            int anoNascimento = scanner.nextInt();
    
            System.out.print("Digite o curso: ");
            scanner.nextLine();
            String curso = scanner.nextLine();
    
            System.out.print("Digite a disciplina: ");
            String disciplina = scanner.nextLine();
    
            double somaNotas = 0;
            for (int i = 1; i <= 4; i++) {
                System.out.print("Digite a nota " + i + ": ");
                double nota = scanner.nextDouble();
                somaNotas += nota;
            }
    
            double media = somaNotas / 4;
    
            System.out.println("Nome: " +nome);
            System.out.println("Sexo: "+sexo);
            System.out.println("Idade: " + (2023-anoNascimento));
            System.out.println("Curso: " +curso);
            System.out.println("Disciplina: "+ disciplina);
            System.out.println("Média das notas: "+ media);
            if (media < 6){
            System.out.println("Reprovado");
            } else {
                System.out.println("Aprovado");
            }
            scanner.close();
        }
    }