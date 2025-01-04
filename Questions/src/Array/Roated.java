package Array;
import java.util.Scanner;
class rotated {
    void result(int arr[],int size,int rotate){
        int temp[],j=0;
        temp=new int[size-rotate];
        for(int i=rotate;i<size;i++){
            temp[j]=arr[i];
            System.out.print(arr[i]+" ");
           j++;
        }
        for(int i=0;i<rotate;i++){
            System.out.print(arr[i]+" ");
     
      
        }
        System.out.println();
    }

}

public class Roated {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the value in the Array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the rotated value");
        int roated=sc.nextInt();
        rotated ob=new rotated();
        ob.result(arr, size, roated);

    }
}