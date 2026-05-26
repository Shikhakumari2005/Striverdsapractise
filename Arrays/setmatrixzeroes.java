
import java.util.Scanner;

public class setmatrixzeroes {
     public static void setzero(int[][] arr ,Scanner sc){
        // Scanner sc=new Scanner(System.in);
        // int r=sc.nextInt();
        // int c=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int[] row = new int[arr.length];
        int[] col = new int[arr[0].length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==0){
                    row[i]=-1;
                    col[j]=-1;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(row[i]==-1 || col[j]==-1){
                    arr[i][j]=0;
                }
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] arr=new int[r][c];
        //int[][] arr = new int[r][c];
        setzero(arr, sc);
    }
}
