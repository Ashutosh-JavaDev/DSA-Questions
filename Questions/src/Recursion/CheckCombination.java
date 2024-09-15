package Recursion;

public class CheckCombination {
    public void check(int arr[], int target) {
        if (arr.length <= 1) {
            return;
        }
        if(arr[arr.length-1]+arr[arr.length-2]==target){
            System.out.println("arr["+arr[arr.length-1]+"]"+"arr["+arr[arr.length-2]+"]");
        }
    }
}
