import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ArrayHashmap {

    public static void main( String[] args) throws Exception {
        String[] scienceFair = { "Sahana", "Leo", "Ananya", "Sukrutha", "Vibha, " };
        List<String> scienceFairList = Arrays.asList(scienceFair);

        System.out.println("Here is a List" + scienceFairList);
        System.out.println("This is a List to Array" + scienceFairList.toArray());
        for ( String car : scienceFair) {
            System.out.print(car + " ");
        }

        for ( String num : scienceFairList) {
            System.out.print(num + "\n");
        }

        final HashMap<String, Integer> age = new HashMap<>();
        age.put("Sahana", 17);
        age.put("Leo", 2);
        age.put("Ananya", 17);
        age.put("Sukrutha", 17);
        age.put("Vibha", 17);

        final HashMap<String, List> ageList = new HashMap<>();
        ageList.put("Names", scienceFairList);
        System.out.println("Age : " + ageList);

    }
}
