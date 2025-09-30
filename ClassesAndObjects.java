class Nokia {
    private int mic;
    private int camera;
    void setValue(){
        mic = 2;
        camera = 40;
    }
    void display(){
        System.out.println("Mic: "+mic);
        System.out.println("Camera: "+camera);
    }
}
public class ClassesAndObjects {
    public static void main(String[] args) {
        Nokia n1 = new Nokia();
        n1.setValue();
        n1.display();
        

    }
}
