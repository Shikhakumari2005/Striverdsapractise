
public class nextpermutation {
    public static void nextPermutation(int[] nums) {

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
        int[] arr = new int[nums.length];

        for(int k = 0; k < nums.length; k++) {
          arr[k] = nums[k];
          System.out.print( arr[k]);
        } 
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
        int[] nums={1,2,5,4,3};
        nextPermutation(nums);
    }
}
