class Employee {
    void display(){
        System.out.println("Employee works");
    }
}
class dev extends  Employee{
    
    void display(){
        super.display();
        System.out.println("Develepor writer code");
    }
}

public class Main4 {
    public static void main(String[] args) {
        dev D = new dev();
        D.display();
    }
}
