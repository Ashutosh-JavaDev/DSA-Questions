package Array;

public class RecursiveSum {
    // int arr[],size;
    // ,size=1;
    public int recursiveSum(int size){
        int sum=0;
        if(size==5){
            return 0;
        }
        else{
            sum+=size+1;
           recursiveSum(size+1); 
        }
        return sum;
    }
    public static void main(String[]args){
        RecursiveSum ob=new RecursiveSum();
        
    }
}
