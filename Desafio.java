import java.util.Scanner;

public class Desafio {
        static String nome = "Lucas Matheus";
        static String tipoConta = "corrente";
        static Double saldo = 1500.0;
    public static void main(String[] args) {
        conta();
    }
    public static void conta(){
        Scanner leitura = new Scanner(System.in);


        System.out.println("""
    ********************************************************
        Dados iniciais do cliente:
        
        Nome:               %s
        Tipo de conta:      %s
        Saldo:              R$ %.2f
    *********************************************************""".formatted(nome, tipoConta, saldo));
        System.out.println("""
                Operações:
                1- Consultar saldos
                2- Saque
                3- Deposito
                4- Finalizar                
                """);
        int operacao = leitura.nextInt();
        switch(operacao){
            case 1:
                System.out.println("""
                        Saldo: R$ %.2f
                        """.formatted(saldo));
                conta();
            case 2:
                System.out.println("""
                        Digite o valor:
                        """);
                double saque = leitura.nextDouble();
                if (saque < saldo){
                    saldo = saldo - saque;
                    System.out.println("""
                            Saque de R$ %.2f feita!
                            Saldo: R$ %.2f
                            """.formatted(saque, saldo));
                }else{
                    System.out.println("Saldo insuficiente!");
                }
                conta();
            case 3:
                System.out.println("""
                        Digite o valor:
                        """);
                double deposito = leitura.nextDouble();
                saldo = saldo + deposito;
                System.out.println("""
                    Depósito de R$ %.2f feita!
                    Saldo: R$ %.2f
                    """.formatted(deposito, saldo));
                conta();
            case 4:
                break;
            default:
                System.out.println("Opção inválida");
                conta();
        }

        leitura.close();
    }
}
