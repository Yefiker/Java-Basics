package javaBasics;

public class practice {
    public static int arraySum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };

        int totalSum = arraySum(nums);
        System.out.print("The sum of the numbers is: " + totalSum);
    }
}