package Array;
import java.util.Scanner;
public class RecursiveSum {
    // int arr[],size;
    // ,size=1;
    int sum=0;
    public int recursiveSum(int size,int num){
        // int sum=0;
        if(size==num){
            return 0;
        }
        else{
            sum+=size+1;
           recursiveSum(size+1,num); 
        }
        return sum;
    }
    public static void main(String[]args){
        RecursiveSum ob=new RecursiveSum();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Value till Number wants Print");
        int num=sc.nextInt();
        int result=ob.recursiveSum(0,num);
        System.out.println(result);
    }
}
