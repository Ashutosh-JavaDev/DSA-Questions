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
    public static void main(String[]args){
        SumofNaturalNumber ob=new SumofNaturalNumber();
        int res=ob.Result(5);
    }
}
