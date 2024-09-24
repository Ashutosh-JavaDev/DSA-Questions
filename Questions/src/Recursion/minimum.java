package Recursion;

public class minimum {
    int arr[], size = 0, min = arr[0];

    public int CheckMinimum(int arr[]) {
        this.arr=arr;
        if (size == 0) {
            return 0;
        }
        if (arr[size - 1] < min) {
            min = arr[size - 1];
        }
        return min;
    }
    public static void main(String[]args){
        minimum ob=new minimum();
        int arr[]={12,21,23,32,24};

        int result=ob.CheckMinimum(arr);

    }
}
