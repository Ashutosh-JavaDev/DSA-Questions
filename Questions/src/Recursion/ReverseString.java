package Recursion;

public class ReverseString {
    String str="";

    public String reverseString(String st) {
        if (st.length() < 0) {
            return "";
        }
        else{
            str+=st.length()-1;
            reverseString(st+1);
        }
        return str;
    }
}
