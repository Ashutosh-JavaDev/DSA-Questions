package Array;
import java.util.Scanner;
class majorityElement{
    static int element(int arr[],int size){
        int num=0,count=0;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
        }
        return num;
    }
}
public class Majority {
    public static void main(String[]args){
        
    }
}
