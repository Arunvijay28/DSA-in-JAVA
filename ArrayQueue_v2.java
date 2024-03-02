public class ArrayQueue_v2 {
    static final int Max_size=30;
    int arr[]=new int[Max_size];
    int rear;

    ArrayQueue_v2(){
        int rear=-1;
    }

    public void enqueue(int x){
        if (rear==Max_size){
            System.exit(0);
        }
        arr[++rear]=x;
    } 
    public int dequeue(){
        if (rear ==-1){
            System.exit(0);
        }

        int temp=arr[0];
        for(int i=1;i<=rear;i++){
            arr[i-1]=arr[i];
        }
        rear--;
        return temp;
    }
}
