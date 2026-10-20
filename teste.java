import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

// public class Main {
//     public static void main(String[] args) {
//         String message = "Hello Mundo, Java!";
//         System.out.println(message);
//   }
// }



    // public class Exemplo {
    //     public static void main(String[] args) {
    //         Scanner leitor = new Scanner(System.in);
    //           System.out.print("Digite sua idade: ");
    //         int idade = leitor.nextInt();

    //         System.out.println("Idade informada: " + idade);
    //         leitor.close();
    //     }
    // }


    public class teste {
        public static void main(String[] args) {

            Scanner leitor = new Scanner(System.in);
            List<String> nomes = new ArrayList<>();
            nomes.add("Borges");
            nomes.add("Paulo");

            System.out.println("Informe a posição do nome que deseja acessar: ");
            int posicao = leitor.nextInt();

            try {
                System.out.println(nomes.get(posicao));
                
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Posição inválida!");
            }
            leitor.close();
        }
     }