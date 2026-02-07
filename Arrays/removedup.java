public class removedup {
    public static void main(String[] args){
        int[] ar={1,1,3,2,4,4,5,6};
        int i=0;
        for(int j=0;j<ar.length;j++){
            if(ar[j]!=ar[i]){
                ar[i+1]=ar[j];
                i++;
            }
        }        
        System.out.print(ar);
    }
}
