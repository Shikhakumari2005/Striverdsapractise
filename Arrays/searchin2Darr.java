import java.util.Scanner;
public class searchin2Darr {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r=matrix.length;
        int c=matrix[0].length;
        int low=0;
        int high=matrix.length *matrix[0].length-1;
        while(low<=high){
            int mid=(low + high)/2;
            int row=mid /c;
            int col=mid%c;
            if(matrix[row][col]==target){
                return true;
            }else if(matrix[row][col]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args){
        searchin2Darr obj=new searchin2Darr();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int c=sc.nextInt();
        int[][] matrix=new int[c][c];
        for(int i=0;i<c;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<c;i++){
            for(int j=0;j<c;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println("");
        }
        int target=8;

        System.out.println(obj.searchMatrix(matrix,8));
    }
}
