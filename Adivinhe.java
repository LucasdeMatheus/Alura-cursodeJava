import java.util.Random;
import java.util.Scanner;

public class Adivinhe {
    public static void main(String[] args) {
        // adivinhe o número
        Scanner leitura = new Scanner(System.in);
        Random rand = new Random();

        int numero = rand.nextInt(101);
        int tentativas = 0;
        int chute = 0;

        while (chute != numero){
            System.out.println("chute um numero:");
            chute = leitura.nextInt();

            if (chute > numero){
                System.out.println("seu numero é maior!");
            }else if (chute < numero){
                System.out.println("seu numero é menor!");
            }
            tentativas++;
        }

        System.out.println("boa! você acertou com " + tentativas + " tentativas.");

        leitura.close();
    }
}
