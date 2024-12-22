package Array;
class secondLargest{
     int Result(int arr[],int size){
        int max=arr[0];
        int secMax=arr[0];
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]>arr[j]){
                    max=arr[i];
                }
            }
        }
        return max;
     }
}
public class SecondLargest {
    
}
