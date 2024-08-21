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
        int  count=0;
        for(int i=0;i<size;i++){
            if(arr[i]==num){
                count++;
                System.out.println("Position["+i+"]");
            }
        }
        if(count>0){
            System.out.println("Number Found");
        }
        else{
            System.out.println("Number Not Found");
        }
    }
}
