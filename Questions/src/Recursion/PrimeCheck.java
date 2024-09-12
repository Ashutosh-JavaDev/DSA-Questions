package Recursion;

public class PrimeCheck {
    int count=0;
    boolean result=true;
    public boolean check(int num,int counter){
        if(num==0){
            return true;
        }
        else{
            if(num%counter==0){
                count++;
            }
        }
        return result;
    }
}
