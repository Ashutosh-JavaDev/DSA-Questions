class Reverse {
    

    public void result(String str) {
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(i);
        }
        System.out.println();
    }
}

public class reverse {

    public static void main(String[] args) {
        Reverse ob=new Reverse();
        ob.result("Ashutosh");
    }
}
