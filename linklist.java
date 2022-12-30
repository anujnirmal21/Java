public class linklist {
    Node head = null;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        
    }
}

      // Adding element at fst
    public void addFst(int data){
        Node newNode = new Node(data);
        if(head == null){
           head = newNode;
           return;
      }
      newNode.next = head;
      head = newNode;
    }

     public Node revruc(Node head){
       if(head == null || head.next == null){
         return head;
       }
        Node newhd = revruc(head.next);
        head.next.next = head;
        head.next = null;
        return newhd;

     }
    // reverse Linked list
    public void rev(){
        Node prvNod = head;
        Node crNod = head.next;
        if(head == null || head.next == null ){
            return;
        }

        while(crNod != null){
            Node nexNod = crNod.next;
            crNod.next = prvNod;
            
            prvNod = crNod;
            crNod = nexNod;    
        }
        head.next = null;
        head = prvNod;
    }
   
    //Add at last
    public void addLst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node cutNod = head;
        while(cutNod.next != null){
            cutNod = cutNod.next;
        }
        cutNod.next = newNode;

    }
    // delete first
    public void delfs(){
        if(head==null){
            System.out.println("empty");
            return;
        }
       head = head.next;
    }
    //delete last
    public void dels(){
        if(head.next == null){
                head = null;
        }
        Node ls = head.next;
        Node sl = head;
        while(ls.next != null ){
        ls= ls.next;
        sl = sl.next;
    }
    sl.next = null;
}

    // print
    public void print(){
        if(head == null){
            System.out.println("EMPTY");
            return;
        }
        Node cutNod = head;

        while(cutNod != null){
            System.out.print(cutNod.data+"->");
            cutNod = cutNod.next;
        }
        System.out.println("NULL");

    }
    public Node nth(Node head,int s){
        if(head.next == null){
            return null;
        }

        int siz =0;
        Node cut = head;
        while(cut != null){
            cut = cut.next;
            siz++;
        }
        if(s == siz){
            return head.next;
        }
        
        int se = siz-s;
        Node pr = head;
        int i = 1;
        while(i < se){
            pr = pr.next;
            i++;
        }
        pr.next = pr.next.next;
        return head;
    }

    public static void main(String args[]){
        linklist L = new linklist();
          L.addFst(1);
          L.addFst(2);
          L.addFst(3);
         L.addLst(4);
         L.addLst(5);
          L.delfs();
          L.dels();
         L.head = L.revruc(L.head);
         L.print();
        L.head = L.nth(L.head,1);
        L.print();
    }
}


    
