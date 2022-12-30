
public class Quick_sort {
    public static void main(String args[]){
           int a[]={6,5,4,3,2,9};
           int n = a.length;
           quicksort(a,0,n-1);
           for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
           }
}

public static void quicksort(int a[],int st,int ls){
    if(st<ls){
    int pidx = sorting(a,st,ls);
    //System.out.print(a[pidx]+" "+pidx+"<=\n");
    quicksort(a,st,pidx-1);
    quicksort(a, pidx+1, ls);
}
}

public static int sorting(int a[],int st,int ls){
    //int piv = a[ls];
    int i = st-1;
    for(int j=st;j<ls;j++){
        if(a[j]<a[ls]){
            i++;
            int t = a[i];
            a[i] = a[j];
            a[j] = t;
            
        }
    }
    i++;
    int t = a[i];
    a[i] =a[ls];
    a[ls]  = t;
    return i;
}
}