class Animal {
    void eat(){
        System.out.println("Animals Eat");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog Barks");
    }
} 
class Puppy extends Dog{
    void play(){
        System.out.println("Puppy Plays");
    }
}

public class multi1 {
    public static void main(String[] args) {
    
        Puppy P1 = new Puppy();
        P1.eat();
        P1.bark();
        P1.play();
    }
    
}
