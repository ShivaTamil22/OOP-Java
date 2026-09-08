class calculator{
    int add(int a,int b){
        return a+b;
    }
    int sub(int a,int b){
        return a-b;
    }
    int mul(int a,int b){
        return a*b;
    }
    int div(int a,int b){
        return a/b;
    }
}
public class Class4 {
    public static void main (String args[]){
        calculator a = new calculator();
        calculator b = new calculator();
        calculator c = new calculator();
        calculator d = new calculator();

        System.out.println("Addition : " + a.add(10, 20));
        
        System.out.println("Subtraction : " + b.sub(50, 10));
        
        System.out.println("Multiply : " + c.mul(20, 2));
        
        System.out.println("Divition : " + d.div(50, 5));

    }
    
}
