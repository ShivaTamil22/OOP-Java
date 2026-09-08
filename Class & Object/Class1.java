class Student{
    String name;
    int age;
    String course;
}

public class Class1 {
    public static void main (String args []){

        Student S1 = new Student();
        S1.name = "Shiva";
        S1.age = 22;
        S1.course = "Java";

        System.out.println("Name : " + S1.name);
        System.out.println("Age : " + S1.age);
        System.out.println("Course : " + S1.course);

        Student S2 = new Student();
        S2.name = "Kavin";
        S2.age = 22;
        S2.course = "Data Analytics";

        System.out.println("Name : " + S2.name);
        System.out.println("Age : " + S2.age);
        System.out.println("Course : " + S2.course);

        Student S3 = new Student();
        S3.name = "Ram";
        S3.age = 22;
        S3.course = "Python";

        System.out.println("Name : " + S3.name);
        System.out.println("Age : " + S3.age);
        System.out.println("Course : " + S3.course);

    }
}
