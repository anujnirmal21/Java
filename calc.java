import java.util.*;
class calc{
    public static void main(String args[])
    {
    Scanner b = new Scanner(System.in);
    for(int i=0;i<5;i++)
    {
    System.out.println("\nENTER TWO NUMBERS TO CALCULATE\n");
    int a = b.nextInt(),c = b.nextInt();
    System.out.println("\nPRESS:\n1-Addition\n2-Substractio\n3-Multiplication\n4-Division");
    int n = b.nextInt();
    switch (n){
        case 1:System.out.println("Sum ="+(a+c));
        break;
        case 2:System.out.println("Sub ="+(a-c));
        break;
        case 3:System.out.println("mul ="+(a*c));
        break;
        case 4:System.out.println("Div ="+(a/c));
        break;
        default:System.out.println("Invalid Action");
    }
      System.out.println("--Thank You--");
        
    }
    }
}
    