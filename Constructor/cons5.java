class Student {
    String name;
    int age;
    Student(String name, int age ){
        this.name = name;
        this.age = age;
    }
    void display(){
        System.out.println("Name : " +name);
        System.out.println("Age : " +age);
    }
}
public class cons5 {
    public static void main (String args []){
        Student S1 = new Student("Shiva",22);
        S1.display();
    }
}
