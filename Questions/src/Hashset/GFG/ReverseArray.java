package Hashset.GFG;

public class ReverseArray {
    public static void Rarray(){
        int arr[]={21,12,24,342,132};
        int start=0,end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }
    public static void main(String[]args){
        Rarray();
    }
}
