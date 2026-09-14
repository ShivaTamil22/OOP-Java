class Animal{
    void eat(){
        System.out.println("Animals Eat");
    }
}
class dog extends Animal{
    void bark(){
        System.out.println("Dog Barks");
    }
} 
interface puppy1 {
    void soft();
}
interface puppy2{
    void harsh();
}
class pet extends dog implements puppy1, puppy2{
        public void soft(){
            System.out.println("Soft Puppy");
        }
        public void harsh(){
            System.out.println("harsh Puppy");
        }
    }

public class hybrid1 {
    public static void main(String[] args) {
        pet P = new pet();
        P.eat();
        P.bark();
        P.soft();
        P.harsh();
    
    }
}
