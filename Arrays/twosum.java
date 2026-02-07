import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class twosum {
    public static boolean twoSum(List<Integer> arr,int tar){
        HashMap<Integer>mp=new HashMap<>();
        //boolean a=false;
        for(int i=0;i<arr.size();i++){
            int com=tar-arr.get(i);
            if(mp.containsKey(com)){
                //mp.put(arr.get(i),mp.get(arr.get(i)+1));
                return true;
            }else{
                mp.put(arr.get(i),1);
                
            }
        }
        return false;
    }
    public static void main(String[] args){
         List<Integer>arr=new ArrayList<>();
         arr.add(1);
         arr.add(2);
         arr.add(13);
         arr.add(10);
         arr.add(21);
         arr.add(15);
         arr.add(16);
         twoSum(arr, 11);

    }
}
