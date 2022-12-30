import java.util.*;

class GreatDiv{
    public static void printCircumference(int a,int b){
        int g=0;
         for(int i=1;i<=a;i++)
       {
        if(a%i==0 && b%i==0 ){
        g=i;
        }
        }
        System.out.println("greatest divisior is "+ g);
        }

    public static void main(String args[])
    {   Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     int b = sc.nextInt();
       printCircumference(a,b);
    }

}