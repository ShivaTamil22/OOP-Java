class Calculator{
    private void add(){
        int a = 20;
        int b = 10;
        System.out.println(a+b);
    }
    Calculator(){
       add();
    }
}
public class mod3{
    public static void main(String[] args) {
        Calculator C = new Calculator();
    }
}