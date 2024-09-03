package Recursion;
import java.util.Scanner;
public class SumofDigit {
    int sum=0;
    public int sumofDigit(int num){
        int n=num;
        if(n/10==0){
            return 0;
        }
        else{
            sum+=n;
            sumofDigit(num/10);
            return sum;
        }
    }
}
