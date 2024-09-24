package Recursion;

public class minimum {
    int arr[], size=0,min = arr[0];

    public int CheckMinimum() {
        if(size==0){
            return 0;
        }
        if(arr[size-1]<min){
            min=arr[size-1];
        }
    }
}
