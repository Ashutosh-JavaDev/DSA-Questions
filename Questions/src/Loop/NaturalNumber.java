package Loop;
import java.util.Scanner;
class naturalNumber {
    void Print() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size the till the output want to Print");
        int size=sc.nextInt();
        int i=1;
        while(i<=size){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}

public class NaturalNumber {
    public static void main(String[]args){
        naturalNumber ob=new naturalNumber();
        ob.Print();
    }
}
