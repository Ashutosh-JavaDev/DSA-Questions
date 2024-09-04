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
            sum+=n/10;
            sumofDigit(num/10);
            return sum;
        }
    }
    public static void main(String[]args){
        SumofDigit ob=new SumofDigit();
        int res=ob.sumofDigit(12345);
        System.out.println(res);
    }
}
