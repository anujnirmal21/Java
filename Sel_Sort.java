public class Sel_Sort{
    public static void main(String args[]){
        int a[] = {5,4,3,2,1};
        for(int i=0;i<a.length-1;i++){
            int small = i;
            for(int j= i+1;j<a.length;j++){
                if(a[small]>a[j]){
                    small = j;
                }
            }
            int t = a[small];
                a[small] = a[i];
                a[i] = t;

        }
          for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");

    }
}
}