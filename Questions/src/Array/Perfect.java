package Array;
import java.util.Scanner;
class perfect{
    void check(){
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if(sum==num){
            System.out.println("Number is Perfect Number");
        }
        else{
            System.out.println("Number is Not a Perfect Number");
        }
    }
}
public class Perfect {
    public static void main(String[]args){
        perfect ob=new perfect();
        ob.check();
    }
}
