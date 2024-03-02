
public class LinkedList {
    Node head;
    class Node{
        int data;
        Node next;

        Node(int x){
            data=x;
            next=null;
        }
    }

    LinkedList(){
        head=null;

    }

    public void insertbegin(int val){
        Node newnode = new Node(val);
        // newnode.data=val;
        if (head == null){
            head=newnode;
        }
        else{
            // while (head.next!=null){
            //     head=head.next;              // insert at end of linked list
            // }
            // head.next=newnode;
            newnode.next=head;
            head=newnode;
        }
    }

    public void insertatpos(int pos,int val){
        
        if (pos==0){
            insertbegin(val);
            return;
        }
        Node newNode= new Node(val);
        Node temp=head;
        for(int i=0;i<pos-1;i++){
            temp=temp.next;
            if (temp==null){
                System.out.println("Invalid position");
                return;
            }
        }
        // Node a=temp.next;
        // temp.next=newNode;
        // newNode.next=a;
        newNode.next=temp.next;
        temp.next=newNode;


    }
     
    public void deleteatpos(int pos){
        if (pos==0){
            deleteatbegin();
            return;
        }
        Node temp=head;
        // Node prev=null;
        for (int i=0;i<pos-1;i++){
            // prev=temp;
            temp=temp.next;
        }
        temp.next=temp.next.next;

    }

    public void deleteatbegin(){
        if (head==null){
            System.out.println("Linked List is null");
            return;
        }
        head=head.next;
    }   
    public void display(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
    }

    public void reverse(){
        Node prev=null;
        Node current=head;
        Node next=head.next;

        while (current!=null){
            next=current.next;
            current.next=prev;  // reverse the link P C N
            prev=current;
            current=next;
        }
        head=prev;
    }

}
