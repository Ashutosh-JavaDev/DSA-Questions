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

        int result=ob.recursiveSum(0);
        System.out.println(result);
    }
}
