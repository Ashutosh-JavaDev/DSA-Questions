package OOPS.Abstraction;

abstract interface Interfacess {
    abstract String payment();
}
class Rayzor implements Interfacess{
    @Override
    public String payment(){
        String payment="Razor payment Successful";
        return payment;
    }
}
class Strive implements Interfacess{
    @Override
    public String payment(){
       String payment="Strive Payment Successful";
       return payment;
    }
}
