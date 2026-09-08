class Student{
    void display(String name, int age){
        System.out.println("Name : " + name);
        System.out.println("Age : "+ age);
    }
}

public class Class3 {
    public static void main (String args[]){
        Student S1 = new Student();
        S1.display("Shiva", 22);
        Student S2 = new Student();
        S2.display("Hari", 22);

    }
}
