class vehicle {
    void start(){
        System.out.println("Vehicle starts");
    }
}
class twoWheeler extends vehicle{
    void type(){
        System.out.println("It's Two wheeler ");
    }
}
class bike extends  twoWheeler{
    void bikeType(){
        System.out.println("This is Hero Splender");
    }
}
class scooter extends twoWheeler{
    void scooterType(){
        System.out.println("This is Honda Activa");
    }
}
public class hybrid3 {
    public static void main(String[] args) {
        bike bike = new bike();
        bike.start();
        bike.type();
        bike.bikeType();

        scooter scooter = new scooter();
        scooter.start();
        scooter.type();
        scooter.scooterType();
    }
}
