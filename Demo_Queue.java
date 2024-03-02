public class Demo_Queue {
    public static void main(String[] args) {
        ArrayQueue  q = new ArrayQueue();
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);
        q.dequeue();
        System.out.println("dequeue :"+q.dequeue());
        System.out.println("dequeue :"+q.dequeue());
        System.out.println("dequeue :"+q.dequeue());
    }
}
