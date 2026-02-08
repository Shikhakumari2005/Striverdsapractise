import java.util.Arrays;

public class longestconsecutiveseq {
    public static boolean contain(int[] arr,int num){
        for(int x:arr){
            if(x==num){
                return true;

            }

        }
        return false;
    }
    public static int[] longcos(int[] arr){
    // public static int longcos(int[] arr){
        int larg=0;
        int printsequ=0;
        for(int i=0;i<arr.length;i++){
            int x=arr[i];
            int count=1;
            while(contain(arr,x+1)){
                x=x+1;
                count++;
            }
            if (count > larg) {
                larg = count;
                printsequ = arr[i];
            }
            //larg=Math.max(larg,count);
        }
        // Printing the sequence
        // System.out.print("Longest Consecutive Sequence: ");
        // for (int i = 0; i < larg; i++) {
        //     System.out.print((printsequ + i) + " ");
        // }


        //store sequence in array
        int[] result = new int[larg];
        for (int i = 0; i < larg; i++) {
            result[i] = printsequ + i;
        }

        return result;
    }
    public static void main(String[] args) {
        int[] arr={1,102,101,2,103,3,5,4};
       // System.out.println(longcos(arr));
        int[] sequence = longcos(arr);

        System.out.println(Arrays.toString(sequence));
    }













    //beeterapproach
    // public static List<list<Integer> long(int[] arr){
    //     int ccountcur=0;
    //     int smaller=INT-MIN;
    //     int long=0;
    //     for(int i=0;i<arr.length;i++){
            
    //     }
    // }
}
