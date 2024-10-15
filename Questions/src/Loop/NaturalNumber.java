package Loop;
import java.util.Scanner;
class naturalNumber {
    void Print(int size) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size the till the output want to Print");
        size=sc.nextInt();
        int i=1;
        while(i<=size){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}

public class NaturalNumber {

}
