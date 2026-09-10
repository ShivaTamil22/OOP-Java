class Student {
    String name;
    int age;
    Student(){
        name = "Shiva";
        age = 22;

    }
    void display(){
        System.out.println("Name : " +name);
        System.out.println("Age : " +age);
    }
}
public class cons2 {
    public static void main (String args []){
        Student S1 = new Student();
        S1.display();
    }
}
