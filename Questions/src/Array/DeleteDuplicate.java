package Array;

public class DeleteDuplicate {
    int arr[], size;

    DeleteDuplicate() {
        BasicClass ob = new BasicClass();
        this.arr = ob.getArr();
        this.size = ob.getSize();
        int count=0;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
        }
    }
}
