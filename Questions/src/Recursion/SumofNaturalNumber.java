package Recursion;

public class SumofNaturalNumber {
    int sum=0;
    public int Result(int size){
        if(size<1){
            return 0;
        }
        else{
            sum+=size;
            Result(size-1);
        }
        return 0;
    }
}
