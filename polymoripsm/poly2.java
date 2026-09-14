class calculator {
    int mul(int a , int b ){
        return a*b;
    }
    double mul (double a, double b){
        return a*b;
    }
}
public class poly2{
    public static void main(String[] args) {
        calculator c = new calculator();
        System.out.println(c.mul(10, 5));
        System.out.println(c.mul(10.2, 2.2));
    }
}