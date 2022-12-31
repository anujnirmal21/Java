// Using LinkedList
public class Stack {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
             next = null;
        }
    }

    static class Stk{
     public static Node head;
     public static boolean Empty(){
        return head == null;
        }
     public void push(int data){
        Node newNod = new Node(data);
        if(Empty()){
            head = newNod;
            return;
        }
        newNod.next =head;
        head = newNod;
     }

     public static int pop(){
       if(Empty()){
        return -1;
       }
        int top =  head.data; 

        head = head.next;
          return top;
     }

     public static int peek(){
        if(Empty()){
            return -1;
           }
         return head.data;  
     }

     }
     public static void main(String args[]){
        Stk S = new Stk();
        S.push(5);
        S.push(6);
        S.push(7);
        S.push(8);
        
         while(!S.Empty()){
        System.out.println(S.peek());
        S.pop();
         }

     }
    }

