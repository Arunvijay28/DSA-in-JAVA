public class ArrayQueue {
    static final int Max_size=30;
    int arr[];
    int front,rear;

    ArrayQueue(){
        arr=new int[Max_size];
        front=0;
        rear=-1;
    }
    
    public void enqueue(int val){
        if (rear == Max_size-1){
            System.out.println("queue is full");
            return;

        }
        rear=rear+1;
        arr[rear]=val;

    }
    public int dequeue(){
        if(front==-1 || front>rear){
            System.out.println("queue is empty");
            System.exit(0);
        }
        return arr[front++];
    }

}
