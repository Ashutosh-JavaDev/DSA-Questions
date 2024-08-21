package Array;
import java.util.Scanner;
public class Search {
    int arr[], size;

    Search() {
        BasicClass ob = new BasicClass();
        this.arr = ob.getArr();
        this.size = ob.getSize();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number wants to be Search");
        int num=sc.nextInt();
    }
}
