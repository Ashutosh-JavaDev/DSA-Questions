package Array;

import java.util.Scanner;

public class Positive {
    int arr[], size;

    Positive() {
        this.arr = arr;
        this.size = size;
        new BasicClass(arr, size);
        for(int i=0;i<size;i++){
            if(arr[i]>0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
