package Recursion;
import java.util.Scanner;
public class Power {

    int result=1;

    public int power(int number,int pow){

        if(pow<1){
            return 0;
        }
        else{
            result*=number;
            power(number, pow-1);
        }
        return result;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Power ob=new Power();
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        System.out.println("Enter the Power");
        int pow=sc.nextInt();
        int res=ob.power(num, pow);
        System.out.println("Result: "+res);
    }
}
