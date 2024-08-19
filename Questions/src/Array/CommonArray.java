package Array;

public class CommonArray {
    int arr[],size;
    CommonArray() {
        BasicClass ob = new BasicClass();
        this.arr=ob.getArr();
        this.size=ob.getSize();
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]==arr[j]){
                    
                }
            }
        }
    }
}
