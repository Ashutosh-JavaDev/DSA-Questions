package Array;
import java.util.Scanner;
public class Factorial {
    int fact=1;
    public int factorial(int size,int num) {
        if(size==num){
            return 0;
        }
        else{
            fact*=size;
            factorial(size+1, num);
        }
        return fact;
    }
    public static void main(String[]args){
        Factorial ob=new Factorial();
        Scanner sc=new Scanner(System.in);
        int res=ob.factorial(1, 0);
    }
}
