public class CalculaCortisol {
    public static void main(String[] args) {
        double cortisol = 18.2;

        boolean resultadoNormal = cortisol >= 6.0 && cortisol <= 18.4;
        boolean resultadoAnormal = cortisol < 6.0 || cortisol > 18.4;



        System.out.println("Cortisol Normal :" + resultadoNormal);
        System.out.println("Cortisol Anormal : " + resultadoAnormal);
    }
}
