class Insert_Sort{
    public static void main(String[] args){
        int a[] = {77,33,84,85,75,82};
        for(int i=1;i<a.length;i++)
        {
            int c = a[i];
            int j = i-1;
            while(j>=0 && a[j]>c){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = c;
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}