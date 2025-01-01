package Array;

class Sorting{
    void sorting(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Array After sort in Ascending Order");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }

}
public class AscendingSort {
    public static void main(String[] args) {
        int arr[]={32,24,442,42,65};
        Sorting ob=new Sorting();
        ob.sorting(arr);
    }
}
