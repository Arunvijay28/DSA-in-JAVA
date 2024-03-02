
public class CircularLinkedList {

    Node last;
    class Node{
        int data;
        Node next;

        Node(int x){
            data=x;
            next=null;
        }

    } 

    CircularLinkedList(){
        last=null;

    }

    public void inseratbegin(int x){
        Node newNode= new Node(x);
        if (last==null){
            newNode.next=newNode;
            last=newNode;
        }
        else{
            newNode.next=last.next;
            last.next=newNode;
        }
        
    }

    public void inseratend(int x){
        Node newNode= new Node(x);
        if (last==null){
            newNode.next=newNode;
            last=newNode;
        }
        else{
            newNode.next=last.next;
            last.next=newNode;
            last=newNode;
        }
        
    }

    public void display(){
        if (last==null){
            return ;
        }
        Node temp =last.next;
        while (temp!=last.next){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
    }

    public void deleteatbegining(){
        if (last ==null){
            return ;
        }
        if (last.next==null){
            last=null;
        }
        last.next=last.next.next;
    }

    public void deleteAtEnd(){
        if (last==null){
            return ;
        }
        if (last.next==null){
            last=null;
        }
        else{
            Node temp =last.next;
            while(temp.next !=last){
                temp=temp.next;
            }
            temp.next=last.next;
            last=temp;
        }
    }
}
