public class SumNegativeNumbers {
    public static void main(String[] args) {

        int[] arr = {5, -2, 10, -8, 7, -3};

        int sum = 0;

        for (int num : arr) {
            if (num < 0) {
                sum += num;
            }
        }

        System.out.println("Sum of negative numbers = " + sum);
    }
}