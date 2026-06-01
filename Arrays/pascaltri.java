import java.util.ArrayList;
public class pascaltri {
    public static ArrayList<ArrayList<Integer>>  pascalTriangle(int row){
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        for(int i=0;i<row;i++){
            ArrayList<Integer> current=new ArrayList<>();
            int ans = 1;
    
           for(int j = 0;j<= i; j++) {
            current.add(ans);
            ans = ans * (row - j) / (j + 1);
           }
           res.add(current);
        }
        return res;
 //for printing particular row
        // void ncr(row){
        //     int ans = 1;
    
        //    for(int r = 0; r <= row; r++) {
        //     System.out.print(ans + " ");
        //     ans = ans * (row - r) / (r + 1);
        //    }

        // }
    }
    public static void main(String[] args) {
        System.out.println(pascalTriangle(5));
    }
    
}

