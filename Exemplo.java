import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         String message = "Hello Mundo, Java!";
//         System.out.println(message);
//     }


    public class Exemplo {
        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);
              System.out.print("Digite sua idade: ");
            int idade = leitor.nextInt();

            System.out.println("Idade informada: " + idade);
            leitor.close();
        }
    }
