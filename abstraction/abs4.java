abstract class Empoyee{
    String name;
    int id;
    Empoyee(String name,int id){
        this.name = name;
        this.id = id;
    }
    void displayDetails(){
        System.out.println("Employee Name : "+name);
        System.out.println("Employee Id : "+id);
    }
    abstract void work();
}
class Developer extends Empoyee{
        Developer(String name, int id){
        super(name,id);
    }
    void work(){
        System.out.println("Developer writes code");
    }
}
public class abs4{
    public static void main(String[] args) {
        Empoyee E1 = new Developer("Shiva",123);
        E1.work();
        E1.displayDetails();
    }
}