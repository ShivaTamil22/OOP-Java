class Employee{
    String name;
    int id;
    int age;
    
    void display(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Emp Id : " + id);
    }
}

public class Class2 {

    public static void main (String args[]){
        Employee E1 = new Employee();
        E1.name = "Kavi";
        E1.age = 22;
        E1.id = 132;
        E1.display();

        Employee E2 = new Employee();
        E2.name = "Priya";
        E2.age = 22;
        E2.id = 133;
        E2.display();
    }
    
}
