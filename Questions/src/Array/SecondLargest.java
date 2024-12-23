package Array;
import java.util.Scanner;
class secondLargest{
     int Result(int arr[],int size){
        int max=arr[0];
        int secMax=arr[0];
        for(int i=0;i<size;i++){
            
                if(arr[i]>max){
                    max=arr[i];
                    if(secMax<max&&secMax>arr[i]){
                        secMax=arr[i];
                    }
                }
            
        }
        return secMax;
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
        secondLargest ob=new secondLargest();
        int result=ob.Result(arr, size);
        System.out.println("Maximum Number: "+result);
    }
}
