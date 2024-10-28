package Hashset;

import java.util.HashSet;
import java.util.Scanner;

class add {
    public void AddValue() {
        HashSet<Integer> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value in Set\nPress Enter to Stop");
        while (true) {
            String str = sc.nextLine();
            if(str.equals("")){
                break;
            }
            else{
                int num=Integer.parseInt(str);
                set.add(num);
            }
        }
        System.out.println(set);
    }
}

public class Add {

    public static void main(String[] args) {
        add ob=new add();
        ob.AddValue();
    }
}
