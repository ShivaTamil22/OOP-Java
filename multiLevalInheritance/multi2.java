class Person{
    void speak(){
        System.out.println("Person Speaks");
    }
}
class Employee extends  Person{
    void work(){
        System.out.println("Employee Works");
    }
}
class Manager extends Employee{
    void manage(){
        System.out.println("Managing");
    }
}
public class multi2 {
    public static void main (String args []){
        Manager M1 = new Manager();
        M1.speak();
        M1.work();;
        M1.manage();
    }
}
