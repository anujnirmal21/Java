public class permutation{
   public static void main(String args[]){
      permutation("abc","");
   }
   public static void permutation(String a,String permut){
    if(a.length()==0){
      System.out.println(permut);
      return;
    } 
      for(int i=0;i<a.length();i++)
      {   
         char currentcr = a.charAt(i);
         String newstring = a.substring(0, i)+a.substring(i+1);
        
         permutation(newstring,permut+currentcr);
      }
      
   }
}