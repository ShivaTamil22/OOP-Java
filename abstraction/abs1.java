abstract class Animal {
    abstract void sound();
    void eat(){
        System.out.println("Animals Eat");
    }
}
class dog extends  Animal{
    void sound(){
        System.out.println("Dog barks");
    }
}
public class abs1{
    public static void main(String[] args) {
        dog d = new dog();
        d.sound();
        d.eat();
    }
}