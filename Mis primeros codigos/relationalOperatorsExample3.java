public class GreaterThanEqualTo{
    public static void main(String[] args) {
        double recommendedWaterIntake = 6;
      double daysInChallenge = 40;
      double yourWaterIntake = 152.5;
      double totalRecommendedAmount = recommendedWaterIntake*daysInChallenge;
      boolean isChallengeComplete = yourWaterIntake >= totalRecommendedAmount;
      System.out.println(isChallengeComplete); 
    }
}