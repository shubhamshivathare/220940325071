import java.util.ArrayList;
public class array {
    public static void main(String [] args) {
        ArrayList<String> name= new ArrayList<>();
        name.add("ramesh");
        name.add("suresh");
        name.add("amin");
        name.add("Himanshu");
        name.add("jayeesh");
        System.out.println("names in array using java each loop");
        for(String a :name){
            System.out.println(a);
        }

        
    }
    
}
