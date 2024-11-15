package Array;
import java.util.Scanner;
class MissingNumber{
    public int findNumber(int arr[],int size){
        int n=arr.length+1;
        int sum=(n*(n+1))/2;
        for(int i=0;i<size;i++){
            sum-=arr[i];
        }
        return sum;
    }
}
public class findMissingNumber {
    
}
