public class LLQueue {
    class Node{
        int data;
        Node next;

        Node(int x){
            data=x;
            next=null;
        }
       
    }

    Node front,rear;
    LLQueue(){
        front=null;
        rear=null;
    }

    public void enqueue(int x){
        Node newNode =new Node(x);
        if (front ==null){
            front=newNode;
        }
        else{
            rear.next=newNode;
        }
        rear=newNode;
    }

    public int dequeue(){
        if (front==null){
            System.out.println("emptyy");
            System.exit(0);
        }

        int temp=front.data;
        front=front.next;
        if(front == null){
                rear=null;
        }
        return temp;
    }
}
