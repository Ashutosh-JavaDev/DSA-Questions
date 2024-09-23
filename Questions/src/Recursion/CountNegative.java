package Recursion;

public class CountNegative {
    int Count = 0;

    public int count(int arr[], int size) {
        if (size == 0) {
            return 0;
        }
        if(arr[size-1]<0){
            Count++;
        }
        return Count;
    }
}
