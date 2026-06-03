public class maxisubarr {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<nums.length;i++){
            sum +=nums[i];
            max=Math.max(max, sum);
            if(sum<0){
             sum=0;
            }
        }
        System.out.println(max);
        return max;

    }
    public static void main(String[] args){
        int[] nums= {5,4,-1,7,8};
        maxisubarr obj = new maxisubarr();  // Create object
        obj.maxSubArray(nums); 
        //System.out.println(Arrays.toString(obj));
    }
}
