class Employee{
    private int Id;
    private String Name;
    private double Salary;

    public void setId(int Id){
        this.Id = Id;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    public void setSalary(double Salary){
        this.Salary = Salary;
    }
    
    
    public int getId(){
        return Id;
    }
    public String getName(){
        return Name;
    }
    public double getSalary(){
        return Salary;
    }   
}
public class enc2{
    public static void main(String[] args) {
        Employee E1 = new Employee();
        E1.setId(101);
        E1.setName("Shiva");
        E1.setSalary(20000.0);
        System.out.println("Emp ID : "+E1.getId());
        System.out.println("Emp Name : "+E1.getName());
        System.out.println("Emp Salary : "+E1.getSalary());
    }
}