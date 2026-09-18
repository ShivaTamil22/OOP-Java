class Student {
    private String Name;
    private int Age;
    private String Email;

    public void setName(String Name){
        this.Name = Name;
    }
    public String getName(){
        return Name;
    }
    public void setAge(int Age){
        this.Age = Age;
    }
    public int getAge(){
        return Age;
    }
    public void setEmail(String Email){
        this.Email = Email;
    }
    public String getEmail(){
        return Email;
    }
}
public class enc1{
    public static void main(String[] args) {
        Student S = new Student();
        S.setName("Shiva");
        S.setAge(22);
        S.setEmail("Sivatamil@gmail.com");
        System.out.println(S.getName());
        System.out.println(S.getAge());
        System.out.println(S.getEmail());
    }
}