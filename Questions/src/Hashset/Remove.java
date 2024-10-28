package Hashset;

import java.util.HashSet;
import java.util.Scanner;

class RemoveElement {
    public void removeElement(HashSet set){
        set=new HashSet<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Value in the List\nPress Enter to Stop");
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
   `    set.removeAll(set);
   System.out.println(set);
    }
}

public class Remove {
    public static void main(String[] args) {
        RemoveElement ob = new RemoveElement();
        ob.removeElement(null);
    }
}
