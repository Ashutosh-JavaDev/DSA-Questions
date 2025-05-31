package Hashset.GFG;

public class ReverseArray {
    public static void Rarray(){
        int arr[]={21,12,24,342,132};
        int start=0,end=arr.length-1;
        while(start<end){
            int temp=start;
            start=end;
            end=temp;
            start++;
            end--;
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
    public static void main(String[]args){
        Rarray();
    }
}
