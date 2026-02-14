

Copy code
import java.util.Arrays;
import java.util.Scanner;

public class NextPermutation {

    // Method to compute the next permutation in-place
    public static boolean nextPermutation(int[] nums) {
        if (nums == null || nums.length <= 1) return false;

        // Step 1: Find the first decreasing element from the right
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) {
            // Step 2: Find the element just larger than nums[i] from the right
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }

        // Step 3: Reverse the elements after index i
        reverse(nums, i + 1, nums.length - 1);

        // If i < 0, it means the array was in descending order (last permutation)
        return i >= 0;
    }

    // Swap helper
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Reverse helper
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start++, end--);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter number of elements: ");
            int n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Array size must be positive.");
                return;
            }

            int[] nums = new int[n];
            System.out.println("Enter " + n + " integers:");
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }

            boolean hasNext = nextPermutation(nums);

            if (hasNext) {
                System.out.println("Next permutation: " + Arrays.toString(nums));
            } else {
                System.out.println("No next permutation (array was in descending order).");
                System.out.println("Smallest permutation: " + Arrays.toString(nums));
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter integers only.");
        } finally {
            sc.close();
        }
    }
}
How It Works
Find pivot: Scan from right to left to find the first index i where nums[i] < nums[i+1].
Find successor: From the right, find the first number greater than nums[i] and swap them.
Reverse suffix: Reverse the subarray from i+1 to the end to get the smallest possible order after the pivot.
Example Run

Copy code
Enter number of elements: 3
Enter 3 integers:
1 2 3
Next permutation: [1, 3, 2]

Copy code
Enter number of elements: 3
Enter 3 integers:
3 2 1
No next permutation (array was in descending order).
Smallest permutation: [1, 2, 3]
If you want, I can also give you a version that works directly on strings for generating the next permutation of characters.
Do you want me to prepare that?

