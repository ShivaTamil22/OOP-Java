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
public class single2 {
    public static  void main (String args[]){
        Car C1 = new Car();
        C1.Start();
        C1.Drive();
    }
}
