package Array;
import java.util.Scanner;
class secondLargest{
     int Result(int arr[],int size){
        int max=arr[0];
        int secMax=arr[0];
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]>arr[j]){
                    max=arr[i];
                }
            }
        }
        return max;
     }
}
public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the Value in the Array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
    }
}