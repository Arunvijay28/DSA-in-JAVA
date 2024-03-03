package search;
import java.util.Scanner;
class summa{
    public int bin(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

        while (start<=end){
            int mid=(start+end)/2;
            if (arr[mid]<target){
                start=mid+1;
            }
            else if(arr[mid]>target){
                end=mid-1;

            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
public class BinarySearch {
    public static void main(String[] args) {
        int arr[]=new int[5];
        int target;
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter a no:");
            int j=scanner.nextInt();
            arr[i]=j;
        }

        System.out.println("Enter target :");
        target=scanner.nextInt();
        summa s = new summa();
        System.out.println("after binary search"+target+"index is :"+s.bin(arr,target));
    }
}
