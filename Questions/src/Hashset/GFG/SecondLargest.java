package Hashset.GFG;
public class SecondLargest {
    public static void main(String[]args){
        int[]  arr={6432,9443,8021,3231,8021};
        int max=arr[0];
        int secMax=arr[1];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secMax=max;
                max=arr[i];
               
            }
            else if(arr[i]>secMax&&arr[i]<max){
                secMax=arr[i];
            }
           
        }
        System.out.println(max);
        System.out.println(secMax);
    }
}
