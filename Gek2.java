public class Gek2 {
    public static void main(String args[]){
        String a = "bad";
        String b = "dab";
        System.out.println(m(a,b));
        
    }
    public static boolean m(String a,String b){
    boolean c = false;
    for(int i=0;i<a.length();i++){
        for(int j=0;j<a.length();j++){
            if(a[i]==a[j]){
                 c = true;
                break;
            }
            
        }
        if(c == false){
            return false;
        }
        
    }
}
}
