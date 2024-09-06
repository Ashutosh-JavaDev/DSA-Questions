package Recursion;

public class ReverseString {
    String str="";

    public String reverseString(String st) {
        if (st.length() == 0) {
            return str;
        }
        else{
            str+=st.charAt(st.length()-1);
            reverseString(st.substring(0, st.length()-1));
        }
        return str;
    }
    public static void main(String[]args){
        ReverseString ob=new ReverseString();
        String res=ob.reverseString("Ashutosh");
        System.out.println("Result: "+res);
    }
}
