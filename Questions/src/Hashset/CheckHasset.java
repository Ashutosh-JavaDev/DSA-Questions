package Hashset;
import java.util.Scanner;
import java.util.HashSet;
class checkSet{
    public void CheckSet(){
        HashSet<Integer>set=new HashSet<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value in the Set\npress Enter to Stop");
        while(true){
            String str=sc.nextLine();
            if(str.equals("")){
                break;
            }
            else{
                int num=Integer.parseInt(str);
                set.add(num);
            }
        }
        if(sc.hasNext()){

        }
        System.out.println(set);
    }
}
public class CheckHasset {
    public static void main(String[]args){
        checkSet obb=new checkSet();
        obb.CheckSet();
    }
}
