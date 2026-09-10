class Student {
    String name;
    int age;
    Student (){
        name = "Dinesh";
        age = 24;
    }
    Student(String name){
        this.name = name;
        this.age = 23;
    }
    Student(String name, int age ){
        this.name = name;
        this.age = age;
    }
    void display(){
        System.out.println("Name : " +name);
        System.out.println("Age : " +age);
    }
}
public class cons6 {
    public static void main (String args []){
        Student S1 = new Student();
        S1.display();
        Student S2 = new Student("Raja");
        S2.display();
        Student S3 = new Student("Shiva",22);
        S3.display();
    }
}