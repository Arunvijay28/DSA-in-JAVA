public class doublylinkedlist {
    
    Node head;
    Node tail;
    class Node{
        int data;
        Node next;
        Node prev;

        Node(int x){
            data=x;
            next=null;
            prev=null;
        }
    }

    doublylinkedlist(){
        head=null;
        tail=null;
    }

    public void insertbegin(int val){
        Node newNode=new Node(val);
        if (head==null){
            head=newNode; 
            tail=newNode;
        }
        else{
            
            head.prev=newNode; 
            newNode.next=head;
            head=newNode;  
        }

    }

    public void insertatpos(int pos,int val){
        Node newNode = new Node(val);
        if (pos==0){
            insertbegin(val);
            return;
        }
        Node temp=head;

        for(int i=0;i<pos-1;i++){
            temp=temp.next;
            if (temp == null){
                System.out.println("Invalid daa..");
                return;
            }
        }

        newNode.next=temp.next;
        newNode.prev=temp;
        if (temp==tail){
            tail=newNode;
        }
        else{
            temp.next.prev=newNode;
        
        }
        temp.next=newNode;

    }

    public void deleteatbegin(){
        if (head == null){
            System.out.println("Null list");
            return;
        }
        head=head.next;
        if (head== null)
            tail=null;
        else    
            head.prev=null;
    }

    public void deleteatpos(int pos){
        if (head==null){
            System.out.println("Delete is not possible");
            return;
        }
        if (pos==0){
            deleteatbegin();
            return;
        }
        Node temp=head;
        Node prev=null;
        for(int i=0;i<=pos-1;i++){
            prev=temp;
            temp=temp.next;
        }

        prev.next=temp.next;
        if(temp.next==null){
            tail=prev;
        }
        else{
            temp.next.prev=prev;
        }

    }

    public void displayRev(){
        if (head==null){
            System.out.println("Empty list");
            return;
        }
        Node temp=tail;
        while (temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.prev;
        }
    }
}
