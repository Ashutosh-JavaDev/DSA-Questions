package Array;
import java.util.Scanner;
public class TwoDClass {
    int arr1[],arr2[],row,col,size;
    TwoDClass(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Row");
        row=sc.nextInt();
        arr1=new int[row];
        System.out.println("Enter the size of Column");
        col=sc.nextInt();
        arr2=new int[col];

    }
}
