import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        
		Scanner skanneri = new Scanner(System.in);
        
        int minutesofexercise = 0;
        String activity_level = "";
        int muscleActivity = 0;
        
        System.out.println("Activity level of exercise (vigorous/moderate)?");
        activity_level = skanneri.nextLine();
        
        for (int i = 0; i < 7; i++) {
            
            System.out.println("Minutes on " + (i + 1) + ". day?");
            int days_exercise = skanneri.nextInt();
            minutesofexercise += days_exercise;
        }
        
        System.out.println("How many times you did muscle strengthening and balance activities?");
        muscleActivity += skanneri.nextInt();
        
        System.out.println("You did " + minutesofexercise + " minutes " + activity_level + " exercise during week.");
        
        checkActivityRecommendation(activity_level, muscleActivity, muscleActivity);
    }
		
    public static void checkActivityRecommendation(String activityLevel, int amount, int muscleActivity) {
    
    	if (activityLevel.equalsIgnoreCase("vigorous") && amount >= 75) {
    		System.out.println("You exercise enough according to the recommendations!");
    	} else if (activityLevel.equalsIgnoreCase("moderate") && amount >= 150) {
    		System.out.println("You exercise enough according to the recommendations!");
    	} if (muscleActivity > 2) {
    		System.out.println("You exercise enough according to the recommendations!");
    	} else {
    		System.out.println("You should exercise more!");
    	}
    	
    }
}
