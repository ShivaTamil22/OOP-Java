class display{
    void show(){
        System.out.println("No Arguments");
    }
    void show(String name){
        System.out.println("Name : " + name);
    }
    void show(String name, int age){
        System.out.println("Name : " + name);
        System.out.println("age : " + age);
    }
}
public  class poly3{
    public static void main (String args[]){
        display D =new display();
        D.show();
        D.show("Shiva");
        D.show("Shiva", 22);    
    }
}