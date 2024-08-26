package Array;

public class StoreEven {
    int arr[], second[], third[], size;

    StoreEven() {
        BasicClass ob = new BasicClass();
        this.arr = ob.getArr();
        this.size = ob.getSize();
        BasicClass ob2 = new BasicClass();
        this.second = ob2.getArr();
        this.size = ob2.getSize();
        int even1 = 0;
        int even2=0;
        int total=even1+even2;
        third = new int[total];
        for(int i=0;i<size;i++){
            if(arr[i]%2==0){
                even1++;
            }
        }
        for(int i=0;i<size;i++){
            if(second[i]%2==0){
                even2++;
            }
        }
        for(int i=0;i<total;i++){
            third[i]=arr[i];
        }
    }
}
