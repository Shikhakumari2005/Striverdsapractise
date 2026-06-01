public class maxmin {
    public static void main(String[] args) {
        int[] arr = {23, 92, 56, 39, 93, 10};
        
        int min = arr[0];
        int max = arr[0];

        // Iterate through the array starting from the second element (index 1)
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i]; // Update min if a smaller element is found
            }
            if (arr[i] > max) {
                max = arr[i]; // Update max if a larger element is found
            }
        }

        System.out.println("Minimum value in the array is: " + min);
        System.out.println("Maximum value in the array is: " + max);
    }
}