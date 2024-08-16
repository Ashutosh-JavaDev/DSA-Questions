package Array;

import java.util.Scanner;

class Sum {
    int arr[], size;

    int result() {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the size of the Array");
        size = sc.nextInt();
        arr = new int[size];
        System.out.println("Enter the Value in the Array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<size;i++){
            sum+=arr[i];
        }
        return sum;
    }
}

public class sum {

}
