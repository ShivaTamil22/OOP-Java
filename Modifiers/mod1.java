class Student {
    public String name = "Shiva";
    private int age = 22;
}
public class mod1{
    public static void main(String[] args) {
        Student S = new Student();
        System.out.println(S.name);
        System.out.println("S.age  - is private variable");
    }
}