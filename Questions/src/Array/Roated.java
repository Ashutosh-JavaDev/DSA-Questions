package Array;

class rotated {
    void result(int arr[],int size,int rotate){
        int temp[],j=0;
        temp=new int[size-rotate];
        for(int i=rotate;i<size;i++){
            temp[j]=arr[i];
            System.out.print(arr[i]+" ");
           j++;
        }
        for(int i=0;i<rotate;i++){
            System.out.print(arr[i]);
        }
    }
}

public class Roated {

}