package javaBasics;

public class Findmax {
    public static void main(String[] args) {
        int[] nums = { 12, 45, 7, 89, 23 };

        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println("The maximum number is: " + max);
    }
}