abstract class Vehicle{
    abstract void start();
}
class car extends Vehicle{
    void start(){
        System.out.println("Car started");
    }
}
class bike extends Vehicle{
    void start(){
        System.out.println("Bike started");
    }
}
public class abs2{
    public static void main(String[] args) {
        car car = new car();
        bike bike = new bike();
        car.start();
        bike.start();
    }
}