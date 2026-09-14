interface camera {
    void takePhoto();
}
interface music{
    void playMusic();

}
class smartPhone implements camera, music{
    public  void takePhoto(){
        System.out.println("Taking Photo");
    }
    public void playMusic(){
        System.out.println("Music Playing");
    }
}
public class multiple2 {
    public static void main(String[] args) {
        smartPhone mobile = new smartPhone();
        mobile.takePhoto();
        mobile.playMusic();
    }
}
