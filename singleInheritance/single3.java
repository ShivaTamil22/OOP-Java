class Employee{
    String name;
    int id;
    int salary;
    void display(){
        System.out.println("EMP Name : " + name);
        System.out.println("EMP Id : " + id);
        System.out.println("EMP Salary : " + salary);
    }
}
class Developer extends Employee{
    String programmimglanguage;
    void displayProgram(){
        System.out.println("Programming Language : " + programmimglanguage);
    }
}
public class single3 {
    public static void main (String args[]){
        Developer dev1 = new Developer();
        dev1.name = "Shiva";
        dev1.id = 122;
        dev1.salary = 55000;
        dev1.programmimglanguage = "java";
        dev1.display();
        dev1.displayProgram();
    }
}
