import java.util.Scanner;

class DynamicArray{
    private static final int initial_cap=4;
    private int arr[];
    private int size,capacity;      // changes must be done within the class so private
    DynamicArray(){
            size=0;
            arr=new int[initial_cap];
            capacity=initial_cap;
    }

    private void shrinkarray(){
        capacity/=2;
        arr=java.util.Arrays.copyOf(arr, capacity);
    }
    private void expandarray(){
        capacity*=2;
        arr=java.util.Arrays.copyOf(arr, capacity);
    }
    public void add(int x){
        if(size==capacity){
            expandarray();
        }
        arr[size]=x;
        size++;

    }   
    
    public void display(){
        System.out.println("Arrays elements");
        for (int i=0;i<size;i++){
            System.out.print(arr[i]+" ");

        }
    }

    public void insert(int pos,int val){
        if (size==capacity)
            expandarray();
        for(int k=size-1;k>=pos;k--){
            arr[k+1]=arr[k];  // if we traverse from pos to size then same value will be replaced till end of array

            }
            arr[pos]=val;
            size++;
        }

    public void delete(int pos){
            for (int i=pos+1;i<size;i++){
                arr[i-1]=arr[i];
            }
            size--;
            if (capacity>initial_cap && capacity >3*size)
                shrinkarray();
        }

    public void deleteend(){
        arr[size-1]=0;
        size--;
        if (capacity>initial_cap && capacity >3*size)
                shrinkarray();
    }
    }


        

public class array {

    public static void main(String[] args) {
        DynamicArray list=new DynamicArray();
        Scanner scanner=new Scanner(System.in);
        while(true) {
			System.out.println("\n -------- List Menu -----------\n");
	        System.out.println("1.Insert at End\n");
	        System.out.println("2.Display the list\n");
	        System.out.println("3.Insert at specified position \n");
	        System.out.println("4.Delete from specified position\n");
	        System.out.println("5.Exit\n");
	        System.out.println("\n--------------------------------------\n");
	        System.out.println("Enter your choice:\t");
	        int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the data:");
                    int val=scanner.nextInt();
                    list.add(val);
                    break;
                case 2: list.display();
                        break;
                case 3:
                        System.out.println("Enter position (starts at 0):");
                        int pos=scanner.nextInt();
                        System.out.println("Enter the value:");
                        int val1=scanner.nextInt();
                        list.insert(pos,val1);
                        break;
                
                case 4:
                    System.out.println("Enter position (starts at 0):");
                    int pos1=scanner.nextInt();
                    if (pos1<0){
                        System.out.println("Invalid position");
                        break;
                    }
                    list.delete(pos1);
                    break;

                case 5:
                    list.deleteend();
                    list.display();
                    System.exit(0);

                default:
                    System.out.println("invalid choice");
                    break;
            }
    }
}
}