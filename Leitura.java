import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("seu filme favorito: ");
        String filme = leitura.nextLine();

        System.out.println("quando lançou: ");
        int ano = leitura.nextInt();

        System.out.println("qual nota você dá pra este filme:");
        double avaliacao = leitura.nextDouble();

        System.out.println("Legal! você gosta do " + filme + " certo? \nEste filme foi lançado em " + ano + " \ne a nota que você dá é " + avaliacao + ".");
        leitura.close();
    }
}
