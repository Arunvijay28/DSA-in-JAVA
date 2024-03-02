public class StackUsingLL {
    class Node{
        int data;
        Node next;

        Node(int x){
            data=x;
        }
    }

    Node top;
    StackUsingLL(){
        top=null;
    }

    public void push(int x){
        Node newNode =new Node(x);
        if(top ==null){
            top=newNode;
        }
        newNode.next=top;
        top=newNode;
    }

    public int pop(){
        if (top == null){
            System.out.println("stack is empty");
        }
        int temp=top.data;
        top=top.next;
        return temp;
    }
   
    public int peek(){
        return top.data;
    }
}
