public class GreaterLessThan{
    public static void main(String[] args) {
        double creditsEarned = 175.2;

        double creditsOfSeminar = 7;
        double creditsToGraduate = 180;
        double creditsAfterSeminar = creditsEarned + creditsOfSeminar;
        System.out.println(creditsEarned > creditsToGraduate);
        System.out.println(creditsToGraduate < creditsAfterSeminar);  
    }
}