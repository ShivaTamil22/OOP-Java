class BankAccount {

    String name;
    double balance;

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Balance : Rs." + balance);
    }
}

class SavingsAccount extends BankAccount {

    void showInterest() {
        double interest = balance * 0.06;
        System.out.println("Interest Per Year : Rs." + interest);
    }
}

class CurrentAccount extends BankAccount {

    void showInterest() {
        System.out.println("Interest Per Year : Current account has no interest");
    }
}

class FDAccount extends BankAccount {

    void showInterest() {
        double interest = balance * 0.09;
        System.out.println("Interest Per Year : Rs." + interest);
    }
}

public class hier2 {

    public static void main(String[] args) {

        SavingsAccount s1 = new SavingsAccount();

        s1.name = "Shiva";
        s1.balance = 2000;

        s1.display();
        s1.showInterest();

        System.out.println();

        CurrentAccount c1 = new CurrentAccount();

        c1.name = "Sathish";
        c1.balance = 5000;

        c1.display();
        c1.showInterest();

        System.out.println();

        FDAccount f1 = new FDAccount();

        f1.name = "Praveen";
        f1.balance = 100000;

        f1.display();
        f1.showInterest();
    }
}

