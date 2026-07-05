import java.util.HashMap;
import java.util.Scanner;

public class two_sum {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];/*
                                               * Calculate the complement of the current number
                                               * meanwhile, check if the complement exists in the HashMap.
                                               * If it does, return the indices of the two numbers that add up to the
                                               * target.
                                               * If not, add the current number and its index to the HashMap for future
                                               * reference.
                                               */

            if (seen.containsKey(complement)) {
                return new int[] { seen.get(complement), i };
            }

            seen.put(nums[i], i);
        }

        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int[] result = new two_sum().twoSum(nums, target);

        if (result[0] != -1) {
            System.out.println("Answer: " + result[0] + " " + result[1]);
        } else {
            System.out.println("No solution found");
        }

        sc.close();
    }
}
