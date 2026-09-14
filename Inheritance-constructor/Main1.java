class parent{
    parent(){
        System.out.println("Parent constructor");
    }
}
class child extends parent{
    child(){
        System.out.println("Child Constructor");
    }
}

public class Main1 {
    public static void main(String[] args) {
        child P = new child();
        
    }
}
