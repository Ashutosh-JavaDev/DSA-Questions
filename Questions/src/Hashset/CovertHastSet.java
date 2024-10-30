package Hashset;
import java.util.HashSet;
class Conversion{
    public void convert(){
        HashSet<Integer>set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        // int arr[]=new int[set.size()];
        set.toArray();
        System.out.println(set);
    }
}
public class CovertHastSet {
    public static void main(String[]args){
        Conversion ob=new Conversion();
        ob.convert();
    }
}
