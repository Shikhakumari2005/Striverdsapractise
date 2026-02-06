// public class longest1sub{
//     public static int Longsubarr(int[] arr,int n,int k){
//         int count=0;
//         for(int i=0; i<arr.length;i++){
//             int sum=0;
//             for(int j=i;j<n;j++){
//                 sum +=arr[j];
//                 System.out.print(sum +" ->");
//             }
//             System.out.println(" ");
//             if(sum==k){
//                 count++;
//                 System.out.println(count);
//             }
//         }
//         return count;

//     }
//     public static void main(String[] args){
//       int[] arr={1,2,3,4,1,2};
//       int n=arr.length;
//       Longsubarr(arr,n,10);
//     }
// }
import java.util.HashMap;

public class LongestSubarraySumK {

    public static int longestSubarray(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // Case 1: subarray from 0 to i
            if (sum == k) {
                maxLen = i + 1;
            }

            // Case 2: subarray exists ending at i
            if (map.containsKey(sum - k)) {
                maxLen = Math.max(maxLen, i - map.get(sum - k));
            }

            // Store first occurrence only
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,1,1};
        int k = 3;
        System.out.println(longestSubarray(arr, k)); // Output: 4
    }
}
