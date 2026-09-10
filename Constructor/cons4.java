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
public class cons4 {
    public static void main (String args []){
        Student S1 = new Student("Shiva",22);
        S1.display();
        Student S2 = new Student("Kavi",24);
        S2.display();
        Student S3 = new Student("Harish",25);
        S3.display();
        Student S4 = new Student("Ram",33);
        S4.display();
    }
}
