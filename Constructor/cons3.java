class Student {
    String name;
    int age;
    Student(String n, int a ){
        name = n;
        age = a;
    }
    void display(){
        System.out.println("Name : " +name);
        System.out.println("Age : " +age);
    }
}
public class cons3 {
    public static void main (String args []){
        Student S1 = new Student("Shiva",22);
        S1.display();
    }
}
