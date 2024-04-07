import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double media = 0;
        double nota = 0;
        int totalNotas = 0;

        while(nota != -1){
            System.out.println("Diga sua avalaiação para o filme:\n(digite -1 para sair)");
            nota = leitura.nextDouble();
            if(nota != -1){
                media += nota;
                totalNotas++;
            }
        }
        System.out.println("São " + totalNotas + " notas\na média é" + media/totalNotas);
        leitura.close();
    }

}
