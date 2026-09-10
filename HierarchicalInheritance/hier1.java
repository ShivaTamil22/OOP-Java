class Vehicle{
    void Start(){
        System.out.println("Vehicle Started.");
    }
}
class Car extends Vehicle{
    void Drive(){
        System.out.println("You can drive car.");
    }
}
class Bike extends Vehicle{
    void ride(){
        System.out.println("You can ride bike");
    }
}
public class hier1 {
    public static  void main (String args[]){
        Car C1 = new Car();
        C1.Start();
        C1.Drive();

        Bike B1 = new Bike();
        B1.Start();
        B1.ride();
    }
}
