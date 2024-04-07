public class Exc2 {
    public static void main(String[] args) {
        // 3.14 e 5.27
        double media = (3.14 + 5.27)/2;
        System.out.println(media);

        int mediaInt = (int)media;
        System.out.println(mediaInt);

        char inicial = 'L';
        String nome = " de Lucas";
        System.out.println(inicial + nome);

        double precoProduto = 5.99;
        int quantidade = 3;
        double precoFinal = precoProduto * quantidade;
        System.out.println(precoFinal);

        double dolar;
        double valorDolar = 4.97;
        dolar = 5;
        System.out.println("Conversão em real de " + dolar + " é " + (int)(dolar * valorDolar));

        double precoOriginal = 200;
        double percentualDesconto = 10;
        double desconto = precoOriginal * (percentualDesconto/100);
        precoOriginal = precoOriginal - desconto;
        System.out.println("preço agora: " + precoOriginal + " com desconto de: " + desconto);


    }
}
