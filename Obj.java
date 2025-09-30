class Ex{
    private int x; // private variable
    private int y; // private variable

     int sum (int x, int y){ // non static method
        return x+y;
    }
}

public class Obj {
    public static void main(String[] args) {
        Ex v1 = new Ex(); // to call non static method and variable we need to create object
        System.out.println(v1.sum(10,20));
        
    }
}