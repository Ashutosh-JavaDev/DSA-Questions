package Array;
import java.util.Scanner;
class perfect{
    void check(int num){
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        num=sc.nextInt();
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
    
}
