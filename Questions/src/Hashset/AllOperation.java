package Hashset;
import java.util.Iterator;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

class Operations {
    static HashSet<Integer> set = new HashSet<>();
    static Scanner sc = new Scanner(System.in);

    public static void addValue() {
        System.out.println("Enter the value want to add in set\nPress stop to STOP");
        while (true) {
            String str = sc.nextLine();
            if (str.equalsIgnoreCase("stop")) {
                break;
            } else {
                try {
                    int data = Integer.parseInt(str);
                    set.add(data);

                } catch (InputMismatchException e) {
                    // e.printStackTrace();
                    System.out.println("Wrong Input\nEnter negative or positive integer Number only");
                    continue;
                }
            }
            // sc.close();

        }
        // System.out.println(set);

    }

    public static void Iteration() {
        // set.iterator();
        addValue();
       Iterator<Integer>i=set.iterator();
       System.out.println(set);
       System.out.println("Iterations  Values are: ");
       while(i.hasNext()){
        System.out.println(i.next()+" ");
       }
    }
    public static void getvalue(){
        addValue();
        set.size();
    }
}

public class AllOperation {
    public static void main(String[] args) {
        Operations ob = new Operations();
        ob.Iteration();

    }
}
