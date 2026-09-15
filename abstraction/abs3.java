abstract class Shape{
    abstract void area();
}
class Circle extends Shape{
    int radius = 10;
    void area(){
        double area = 3.14 *radius *radius;
        System.out.println("Area of this circle : "+ area);
    }
}
public class abs3{
    public static void main(String[] args) {
        Shape C1 = new Circle();
            C1.area();
        
    }
}