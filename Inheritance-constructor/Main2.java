class person{
    person(String name){
        System.out.println("Name : "+ name);
    }
}
class student extends person{
    student(){
        super("Shiva");
        System.out.println("Student Constructor");

    }
}

public class Main2 {
    public static void main(String[] args) {
        student s = new student();
    }
}
