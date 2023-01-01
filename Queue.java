// Using array
public class Queue{
    static class Q{
    static int arr[];
    static int size;
    static int rear = -1;
    Q(int n){
         arr = new int[n];
         this.size = n;
    }

    public static boolean Empty(){
      return rear == -1;
    }

    public static void add(int data){
        if(rear==size-1){
            System.out.println("full");
            return;
        }
        rear++;
        arr[rear] = data;
    }

    public static int remove(){
        if(Empty()){
            System.out.println("empty");
            return -1;
        }
        int front = arr[0];
        for(int i=0;i<rear;i++){
            arr[i]=arr[i+1];
        }
        rear--;
        return front;
    }

    public static int peek(){
        if(Empty()){
            System.out.println("empty");
            return -1;
        }
        return arr[0];
    }
}

    public static void main(String args[]){
        Q Q1 = new Q(8);
        Q1.add(5);
        Q1.add(7);
        Q1.add(4);
        Q1.add(9);
        while(!Q1.Empty()){
            System.out.println(Q1.peek());
            Q1.remove();
        }
    }

}