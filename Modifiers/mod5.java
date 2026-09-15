class Person{
    final String name = "Shiva";
}
class Emp extends Person{
    Emp(){
        System.out.println("Name :" + name);
    }
}
public class mod5{
    public static void main(String[] args) {
        Person P = new Emp();
                
    }
}