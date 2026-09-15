class Person{
    protected String name = "Shiva";
}
class Emp extends Person{
    Emp(){
        System.out.println("Name :" + name);
    }
}
public class mod4{
    public static void main(String[] args) {
        Person P = new Emp();
                
    }
}