import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double media = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Diga sua avalaiação para o filme:");
            nota = leitura.nextDouble();
            media += nota;
            if (i == 3){
                media = media / 4;
            }
        }

        System.out.println("A média destas notas é " + media);

        leitura.close();
    }
}
