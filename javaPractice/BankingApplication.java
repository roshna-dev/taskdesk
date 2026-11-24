class BankAccount{
    final String name;
    double balance;

    BankAccount(String name,double balance){
        this.name=name;
        this.balance=balance;
    }
    void printName(){
        System.out.println("Name:" +name);
    }

    void showSummary(){
        printName();
        System.out.println("Balance: Rs." +balance);
    }
}
class SavingsAccount extends BankAccount{
    double interestRate;
    SavingsAccount(String name,double balance, double interestRate){
        super(name,balance);
        this.interestRate=interestRate;
    }
    void showSummary(){
        super.showSummary();
        System.out.println("Interest rate: Rs." +interestRate);
    }
}
public class BankingApplication {
    public static void main(String[] args) {
        BankAccount bankAccount = new SavingsAccount("Ravi",1000,0.01);
        bankAccount.showSummary();

    }
}
