import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayArrayList {
   public static void main(String args[]) {
      String[] array = {"apple", "banana", "canada", "dallas", "elephant"};

      List<String> list = Arrays.asList(array);          
      System.out.println(list);

      List<String> list1 = new ArrayList<String>();
      Collections.addAll(list1, array);
      System.out.println(list1);

      
   }  

}