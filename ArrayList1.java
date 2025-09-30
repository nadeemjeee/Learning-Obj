import java.util.ArrayList;
public class ArrayList1 {

    
    public static void main(String[] args) {

       
       ArrayList<Integer> mArrayList = new ArrayList<>();{
        mArrayList.add(10);
        mArrayList.add(20);
        mArrayList.add(30);
        mArrayList.add(40);
        mArrayList.add(50);
        System.out.println(mArrayList.get(4));
       }
       System.out.println("*********Using For Each Loop**********");
         for(int i=0; i<mArrayList.size(); i++){
         System.out.println(mArrayList.get(i));
    }

   } 
}   