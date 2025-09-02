package Array;
public class RotatedArray {
    public  static void printRotate(int arr[],int d){
       int i=d;
       while(i<arr.length){
        System.out.print(arr[i]+" ");
        i++;
       }
       for(int j=0;j<d;j++){
        System.out.print(arr[j]+" ");
       }
        System.out.println();
    }    
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        printRotate(arr, 2);
    }
}
