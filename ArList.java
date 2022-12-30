import java.util.ArrayList;
import java.util.Collections;
public class ArList {
    public static void main(String args[]){
    ArrayList<Integer> a1 = new ArrayList<>();
    a1.add(1);
    a1.add(5);
    a1.add(83);
    a1.add(34); 
    System.out.println(a1);
    int d = a1.get(1);
    System.out.println(d);
    a1.add(2,84);
    System.out.println(a1); 
    a1.set(1,88);
    System.out.println(a1);
    a1.remove(2);
    System.out.println(a1);
    int siz = a1.size();
    System.out.println(siz);
    for(int i=0;i<a1.size();i++){
        System.out.println(a1.get(i));
    }

    Collections.sort(a1);
    System.out.println(a1);
}
}
