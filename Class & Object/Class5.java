class BankAccount{
    String name;
    double balance;

    void deposit(double amount){
        balance = balance + amount;
        System.out.println("Deposited :" + amount);
    }
    void display(){
        System.out.println("Account Holder : " + name);
        System.out.println("Balance : Rs." + balance);
    }
}
public class Class5 {
    public static void main(String[] args) {
        BankAccount A1 = new BankAccount();
        System.out.println("Available Balance : Rs." +A1.balance );
        A1.name = "Shiva";
        A1.balance = 12000;
        System.out.println("Available Balance : Rs." +A1.balance );
        A1.deposit(2000);
        A1.display();
    }
    
}
