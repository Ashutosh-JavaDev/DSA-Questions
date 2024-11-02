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
    }
}
public class CheckHasset {
    
}
