package Array;

class Bankcheck {
    private int amount;
    private int CreditMoney;
    private int DebitMoney;


    public int read(int amount) {
        this.amount = amount;
        return amount;
    }
    public int credit(int addMoney){
        CreditMoney=amount+addMoney;
        amount=CreditMoney;
        return CreditMoney;
    }
    public int debit(int subMoney){
       while(true){
        if(subMoney>amount){
            System.out.println("Insufficent Balance: "+amount);
            continue;
        }
        else{
            DebitMoney=amount-subMoney;
            return DebitMoney;
        }
       }
    }
    public void abort(){
        // if()
    }
}

public class BankManage {

}
