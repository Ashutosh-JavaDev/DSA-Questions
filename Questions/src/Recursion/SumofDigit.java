package Recursion;
import java.util.Scanner;
public class SumofDigit {
    // int sum=0,n=num;
    public int sumofDigit(int num){
        // int n=num;
        if(num==0){
            return 0;
        }
        else{
           return (num%10)+sumofDigit(num/10);
        }
    }
    public static void main(String[]args){
        SumofDigit ob=new SumofDigit();
        int res=ob.sumofDigit(12345);
        System.out.println(res);
    }
}
