public class HackerComparison {
    public static void main(String[] args) {
        boolean hasPermission = false;
        String blackHatGoal = "Personal gain, stealing data, transferring bank funds";
        String greyHatGoal = "Identify weaknesses and reveal them to system owner";
        System.out.println("Cracker (Black Hat): Unauthorized = " + !hasPermission + " | Goal: " + blackHatGoal);
        System.out.println("Grey Hat: Unauthorized = " + !hasPermission + " | Goal: " + greyHatGoal);
    }
}