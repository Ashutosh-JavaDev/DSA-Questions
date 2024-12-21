package Array;
import java.util.Scanner;
class majorityElement{
    static int element(int arr[],int size){
        int count=0,temp=0;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]==arr[j]){
                    temp=arr[i];
                    count++;
                }
            }
        }
        if(count>0){
            System.out.println("Majority Element Found");
        }
        else{
            System.out.println("No Majority Element Found");
        }
        return temp;
    }
}
public class Majority {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the value in the Array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        majorityElement opb=new majorityElement();
        int res=opb.element(arr, size);
        System.out.println("Majority Element: "+res);
    }
}
