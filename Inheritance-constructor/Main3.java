class parent {
    int num = 200;
}
class child extends parent{
    child(){
        int num = 100;
        System.out.println("Parent : "+ super.num);
        System.out.println("Child :"+ num);
    }
}
public class Main3 {
    public static void main(String[] args) {
        child p = new child();
    }
    
}
