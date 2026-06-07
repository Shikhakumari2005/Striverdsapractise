
import java.util.Arrays;

public class findreptingandmissing {
    //BRUTE FORCE
    public static int[] FindMissRep(int[] arr){
        // int mis=-1;int rep=-1;
        // for(int i=1;i<=arr.length;i++){
        //     int count=0;
        //     for(int j=1;j<arr.length;j++){
        //         if(arr[j]==i){
        //             count++;
        //         }
        //     }
        //     if(count==2){ rep=i;}
        //     else if(count==0){
        //         mis=i;
        //     }
        //     // Stop early if both found
        //     if (rep!= -1 && mis != -1)
        //         break;
        // }

        // // Return {repeating, missing}
        // return new int[]{rep, mis};





        //BETTER APPROACH
        int mis=0;int rep=0;

        int[] hasharr=new int[arr.length+1];
        for(int i=0; i<arr.length;i++){
            // hasharr.add(arr[i]);
            // hasharr=hasharr[i] +1;
            hasharr[arr[i]]++;
        }
        for(int i=0;i<hasharr.length;i++){
            if(hasharr[i]==0){
                mis=i;

            }else if(hasharr[i]>1){
                rep=hasharr[i];
            }
        }
        return new int[]{rep, mis};
        
    }
    public static void main(String[] args){
       int[] arr={1,2,3,6,5,6};
       System.out.println(Arrays.toString(FindMissRep(arr)));
    }
}
