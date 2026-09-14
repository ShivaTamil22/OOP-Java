class shape{
    void draw(){
        System.out.println("Draw shape");
    }
}
class square extends shape{
    @Override
    void draw(){
        super.draw();
        System.out.println("Draw square");
    }
}
class triangle extends shape{
    @Override
    void draw(){
        super.draw();
        System.out.println("Draw triangle");
    }
}
public class poly4{
    public static void main (String args[]){
        shape S1 = new square();
        shape T1 = new triangle();
        S1.draw();
        T1.draw();
    }
}