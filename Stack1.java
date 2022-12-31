// Using ArrayList
import java.util.*;
public class Stack1 {
    static class Stack{
    static ArrayList<Integer> S = new ArrayList<>();
    public static boolean Empty(){
        return S.size()==0;
    }
    //push
    public static void push(int data){
        S.add(data);
    }
    //pop
    public static int pop(){
        if(Empty()){
            return -1;
        }
        int top = S.get(S.size()-1);
        S.remove(S.size()-1);
        return top;
    }
    //peek
    public static int peek(){
        if(Empty()){
            return -1;
        }
        return S.get(S.size()-1);

    }
}
public static void main(String args[]) {
    
    Stack S2 = new Stack();
    S2.push(3);
    S2.push(5);
    S2.push(6);
    S2.push(1);
    while(!S2.Empty()){
        System.out.println(S2.peek());
        S2.pop();
         }

}
}