import java.util.ArrayList;
import java.util.Iterator;
public class JavaArrayList {
    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Tesla");
        cars.add("Mazda");
        cars.add("Ford");
        System.out.println(cars);
        
        Iterator<String> it =  cars.iterator();
        System.out.println(it.next());

    }

}