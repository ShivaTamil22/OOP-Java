interface Father{
    void work();
}
interface Mother{
    void mom();
}
class child implements Father , Mother{
    public void work() {
        System.out.println("Father works ");
    }
    public void mom(){
        System.out.println("Mother manages");
    }
}
public class multiple1 {
    public static void main(String[] args) {
        child son = new child();
        son.work();
        son.mom();    
    }
    
}
