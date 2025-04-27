package Hashset;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

class Operations {
    public static void addValue() {
        HashSet<Integer> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value want to add in set\nPress stop to STOP");
        while (true) {
            String str = sc.nextLine();
            if (str.equalsIgnoreCase("stop")) {
                return;
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
            System.out.println(set);

        }

    }
    public static void Iteration(){
        
    }
}

public class AllOperation {
    public static void main(String[] args) {
        Operations ob = new Operations();
        // ob.functions();

    }
}
