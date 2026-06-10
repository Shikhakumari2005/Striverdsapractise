package recursion;
import java.util.ArrayList;
import java.util.Collections;
public class subsetsum {
  public static void subsetsum(int[] arr ,ArrayList<Integer> ans ,int sum ,int i){
      if(i==arr.length){
         ans.add(sum);
        return ;
     }
     //ans.add(arr[i]);
     subsetsum(arr, ans, sum + arr[i] , i+1);
     //ans.remove(ans.length-1);
     subsetsum(arr, ans, sum, i+1);
  }  
  public static void main(String[] args) {
      int[] arr={1,2,3};
      ArrayList<Integer> ans=new ArrayList<>();
      subsetsum(arr, ans, 0, 0);
      Collections.sort(ans);

      System.out.println(ans);
  }
}
