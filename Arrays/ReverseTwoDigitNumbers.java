import java.util.Arrays;

public class ReverseTwoDigitNumbers {

    public static void reverseTwoDigitNumbers(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] >= 10 && arr[i] <= 99) {

                int tens = arr[i] / 10;
                int ones = arr[i] % 10;

                arr[i] = ones * 10 + tens;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {12, 45, 7, 89, 100, 23};

        System.out.println("Original Array:");
        System.out.println(Arrays.toString(arr));

        reverseTwoDigitNumbers(arr);

        System.out.println("After Reversing Two-Digit Numbers:");
        System.out.println(Arrays.toString(arr));
    }
}