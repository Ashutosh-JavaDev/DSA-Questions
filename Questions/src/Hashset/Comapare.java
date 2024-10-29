package Hashset;
import java.util.HashSet;
// import java.util.Scanner;

class comapare{
    public void Comparision(){
        HashSet<Integer>set=new HashSet<>();
        HashSet<Integer>set2=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        set2.add(1);
        set2.add(3);
        set2.add(2);
        set2.add(6);
        set2.add(4);

       boolean res= set.equals(set2);
        System.out.println(res);
    }
}
public class Comapare {
    public static void main(String[]args){
        comapare ob=new comapare();
        ob.Comparision();
    }
}
