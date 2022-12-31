// push at Bottom and Reversing Stack
import java.util.Stack;
public class StackR{
        public static void rev(Stack<Integer> I){
            if(I.isEmpty()){
                return;
               }
            int t = I.pop();
            rev(I);
            pushBott(t, I);
        }
        public static void pushBott(int data,Stack<Integer> I){
            if(I.isEmpty()){
             I.push(data);
             return;
            }
            int t =I.pop();
            pushBott(data,I);
            I.push(t);
            }
    public static void main(String args[]) {
      Stack<Integer> I = new Stack<Integer>();
      I.push(6);
      I.push(9);
      I.push(4);
      I.push(3);
      rev(I);
       while(!I.isEmpty()){
        System.out.println(I.peek());
        I.pop();
       }  
    }
    }