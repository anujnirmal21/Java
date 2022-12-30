public class fac_ruc {
    public static void main(String args[]){
        int a[] = {5,4,3,2,1};
        for(int i=0;i<a.length-1;i++){
            int s = a[i];
            for(int j =i+1;j<a.length;j++){
                if(a[i]>a[j])
                { int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }  
                s = a[i];      
            }
            
        }  

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
    }
    }
}