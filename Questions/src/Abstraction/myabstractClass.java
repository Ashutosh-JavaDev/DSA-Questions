package Abstraction;
abstract class MyabstractClass{
    abstract void greet();
    abstract void sound();
}
class inheritAbstractClass extends MyabstractClass{
    @Override
    void greet() {
        System.out.println("Good Morning");
    }
    void sound(){
        
    }
}
class abst extends inheritAbstractClass{
    @Override
    void greet(){
        System.out.println("Good Afternoon");
    }
}
public class myabstractClass {
    inheritAbstractClass ob=new inheritAbstractClass();
    
    // ob.greet();
    // ob.sound();
}
