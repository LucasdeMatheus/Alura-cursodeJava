public class conditional {
    public static void main(String[] args) {
        boolean includesinPlan = true;
        String tipoPlan = "normal";

        if (includesinPlan == true || tipoPlan.equals("plus")){
            System.out.println("É só assistir!");
        } else {
            System.out.println("Aí ce me quebra né véi");
        }
        
    }
}

