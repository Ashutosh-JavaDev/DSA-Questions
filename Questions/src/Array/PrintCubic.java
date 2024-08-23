package Array;

public class PrintCubic {
    int arr[],size;
    PrintCubic(){
        int num=0;
        BasicClass ob=new BasicClass();
        this.arr=ob.getArr();
        this.size=ob.getSize();
        for(int i=0;i<size;i++){
            num=arr[i]*arr[i]*arr[i];
        }
        
    }
}
