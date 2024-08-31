package Array;

public class RecursiveSum {
    // int arr[],size;
    int sum=0,size=1;
    public void recursiveSum(int size){
        if(size==5){
            return;
        }
        else{
            sum+=size+1;
           recursiveSum(size+1); 
        }
    }
}
