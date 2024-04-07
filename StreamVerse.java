public class StreamVerse {
    public static void main(String[] args) {
        System.out.println("Filme: Clube da Luta");

        int year = 1999;
        System.out.println("Ano de lançamento: " + year);
        boolean includesinPlan = true;
        System.out.println("Incluso no Plano: " + includesinPlan);
        double nota = 4.6;
        System.out.println("nota: " + nota);
        System.out.println((int)(nota)+" estrelas");
        int classificacao = 18;
        System.out.println("classificacao: +" + classificacao);
        String sinopse = """
                Um homem deprimido que sofre de insônia conhece um estranho vendedor chamado Tyler Durden e se vê morando em uma casa suja depois que seu 
                perfeito apartamento é destruído. A dupla forma um clube com regras rígidas onde homens lutam. A parceria perfeita é comprometida quando uma mulher,
                Marla, atrai a atenção de Tyler. + year
                """;
        System.out.println("sinopse: " + sinopse);
    }
}
