class bankAccount {
    double balance;
    String name;
    double deposit;

     void display(String name,double balance){
        this.name = name;
        this.balance = balance;
        System.out.println("Account Holder Name :" + name);
        System.out.println("Available Balance : Rs." + balance);
     }
}
class savingsAccount extends bankAccount{

    void deposit(double deposit){
        super.deposit = deposit;
        super.balance += deposit;
        System.out.println("Deposit Amount : Rs." + deposit );
        System.out.println("Current Balance : Rs." + this.balance );

    }
}
public class single4 {
    public static void main (String args[]){
        savingsAccount A1 = new savingsAccount();
        A1.display("Shiva",  20000);
        A1.deposit(2000);

        System.out.println("------------------------------------------");

        savingsAccount A2 = new savingsAccount();
        A2.display("Shalini",  5600);
        A2.deposit(1900);

        System.out.println("------------------------------------------");

        savingsAccount A3 = new savingsAccount();
        A3.display("Kumar",  12000);
        A3.deposit(1500);

        System.out.println("------------------------------------------");
    }
}
