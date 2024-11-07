package Hashset;

import java.util.HashSet;
import java.util.Scanner;

class convertArray {
    public void ArrayConversion() {
        HashSet<Integer> set = new HashSet<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  Value in the list\nPress Enter to Stop");
        while (true) {
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

    }
}

public class ConvertToArray {
    public static void main(String[]args){
        convertArray ob=new convertArray();
        ob.ArrayConversion();
    }
}
