package Hashset;
import java.util.Scanner;
import java.util.HashSet;
class checkSet{
    public boolean CheckSet(){
        boolean result=true;
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
        System.out.println(set);
        if(sc.hasNext()){
            return result;
        }
        else{
            result=false;
        }
    }
}
public class CheckHasset {
    public static void main(String[]args){
        checkSet obb=new checkSet();
        obb.CheckSet();
    }
}
