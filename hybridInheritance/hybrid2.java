class Employee {
    void Work(){
        System.out.println("Employee works");
    }
}
class Developer extends Employee{
    void coding(){
        System.out.println("Developer code");
    }
}
class Tester extends Employee{
    void Test(){
        System.out.println("Tester Tests");
    }
}
public class hybrid2 {
    public static void main(String[] args) {
        Developer E1 = new Developer();
        E1.Work();
        E1.coding();

        Tester E2 = new Tester();
        E2.Work();
        E2.Test();
    }
}
