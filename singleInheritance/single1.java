class Animal{
    void eat(){
        System.out.println("Animal Eats");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog Barks");
    }
}
public  class single1 {

    public static void main (String args[]){
        Dog S1 = new Dog();
        S1.bark();
        S1.eat();
    }
}