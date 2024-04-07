import java.util.Scanner;

public class Exc3 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        // identificar se o número é positivo, negativo ou neutro.
        System.out.println("Diga um número aí homem.");
        int numero = leitura.nextInt();
        if (numero > 0){
            System.out.println("macho, teu número é positivo viu.");
        } else if (numero < 0){
            System.out.println("negativo!");
        } else{
            System.out.println("preguiça de escrever um numero em.");
        }

        // comparar 2 números, qual é maior e se são iguais
        System.out.println("fala 1 numero ai vai");
        int numero1 = leitura.nextInt();
        
        System.out.println("fala outro!!");
        int numero2 = leitura.nextInt();
        if (numero1 > numero2){
            System.out.println("o numero 1, vulgo " + numero1 + "é maior que o numero 2 (" + numero2 + ")");
        } else if (numero1 < numero2){
            System.out.println("o numero 2 é maior então.");
        }
        if(numero1 != numero2){
            System.out.println("e mais, nada ver um com o outro");
        }else{
            System.out.println("preguiça de escrever um numero diferente macho, meu deus.");
        }

        // calcular a área do quadrado ou do circulo
        System.out.println("tu quer calcular o que em, 1. Calcular área do quadrado, ou, 2. Calcular área do círculo\n(escreva só o numero faz favor)");
        int escolha = leitura.nextInt();
        if (escolha == 1){
            System.out.print("Digite o lado do quadrado: ");
            double lado = leitura.nextDouble();
            double areaQuadrado = lado * lado;
            System.out.println("o diaxo da área: " + areaQuadrado);
        }else if (escolha == 2){
            System.out.print("Digite o raio do círculo aí vai ");
            double raio = leitura.nextDouble();
            double areaCirculo = Math.PI * raio * raio;
            System.out.println("é " + areaCirculo);
        }else{
            System.out.println("teu unico dever era escrever 1 ou 2, \ne tu me mete um " + escolha + " cara, meu deus.");
        }

        // recebe a tabuada!
        System.out.println("tabuada de que em");
        int tabuada = leitura.nextInt();

        System.out.println("receba!");
        for(int i = 0; i < 11; i++){
            System.out.println(tabuada + " x " + i + " = " + tabuada * i);
        }


        // par ou impar?

        System.out.println("diga um número aí");
        int numero3 = leitura.nextInt();

        if(numero3 % 2 == 0){
            System.out.println("é par amigão, relaxa");
        }else{
            System.out.println("vix, é impar kkk");
        }

        // fatorial
        System.out.println("fala o numero ai homem");
        int fator = leitura.nextInt();
        int fatorial = fator;

        for(int i = (fatorial - 1); i >= 1; i--){
            System.out.println(fatorial + " x " + i + " = " + fatorial * i);
            fatorial = fatorial * i;
        }
        System.out.println("fatorial de " + fator + " é: " + fatorial);
        leitura.close();
    }
}
