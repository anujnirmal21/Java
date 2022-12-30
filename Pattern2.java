class Pattern2{
    public static void main(String args[])
    {
        int a=30;
        for(int i=1;i<=a;i++)
        {
            for(int j=1;j<=a-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            } 
            System.out.println();
        }
        for(int i=a;i>=1;i--)
        {
            for(int j=1;j<=a-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            } 
            System.out.println();
        }

    }
}