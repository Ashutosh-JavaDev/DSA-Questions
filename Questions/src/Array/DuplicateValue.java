package Array;

import java.util.ArrayList;
import java.util.HashSet;

public class DuplicateValue {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(4);
        list.add(2);
        HashSet<Integer> dupli = new HashSet<>();
        for (int val : list) {
            if (!set.add(val)) {
                dupli.add(val);
            }
        }
        System.out.println(dupli);
    }
}
