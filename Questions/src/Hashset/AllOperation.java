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
        Iterator<Integer> i = set.iterator();
        System.out.println(set);
        System.out.println("Iterations  Values are: ");
        while (i.hasNext()) {
            System.out.println(i.next() + " ");
        }
    }

    public static int getSize() {
        addValue();
        return set.size();
    }

    public static boolean ISEmpty() {
        addValue();
        return set.isEmpty();
    }

    public static void cloneHash() {
        addValue();
        HashSet<Integer> secSet = (HashSet<Integer>) set.clone();
        System.out.println("Second set after cloning first set: " + secSet);
        System.out.println("Enter the Value in the new HashSet\nor Press Stop to stop adding");
        while (true) {
            String newStr = sc.nextLine();
            if (newStr.equalsIgnoreCase("stop")) {
                System.out.println("Final Set: " + secSet);
                return;
            } else {
                try {
                    int data = Integer.parseInt(newStr);
                    secSet.add(data);
                } catch (InputMismatchException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    public static void convertArray() {
        addValue();
        HashSet<String> str=new HashSet<>();
        str.add("Apple");
        str.add("Banana");
        str.add("Guava");
        str.add("Orange");
        str.add("Graphes");

        int n=set.size();
        String arr[]=new String[n];
       str.toArray(arr);
       System.out.println("Array Elements: ");
       for(String c:str){
        System.out.println(c);

       }
    }
}

public class AllOperation {
    public static void main(String[] args) {
        Operations ob = new Operations();
        ob.convertArray();

    }
}
