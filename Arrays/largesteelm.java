public class largesteelm {
    public static  void main(String[] args){
        int[] a={1,5,2,8,94,7,56};
        int larg=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>larg){
                larg=a[i];
            }
        }
        System.out.println(larg);
    }
}
