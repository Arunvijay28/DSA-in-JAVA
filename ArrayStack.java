public class ArrayStack {
    static final int Max_size=30;
    int top;
    int arr[]=new int[Max_size];

    ArrayStack(){
        top=-1;
    }

    public void push(int val){
        if (top == Max_size-1){
            System.out.println("Stack Overflow");
        }
        arr[++top]=val;

    }

    public int pop(){
        if (top==-1){
            System.out.println("Stack undeflow");
        }
        return arr[top--];
    }
    
    public int peek(){
        return arr[top];
    }
}