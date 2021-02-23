import java.util.HashMap;

public class ModeHashMap {
    static int mode(final int a[]) {
        HashMap<Integer, Integer> modeMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < a.length; ++i) {
            Integer key = a[i];
            if(modeMap.containsKey(key)){
                Integer count = modeMap.get(key);
                modeMap.put(key, ++count);
            }else{
                modeMap.put(key, 1);
            }
        }
        System.out.println(modeMap);
        Integer maxValue=0, maxKey = 0;
        for (Integer key : modeMap.keySet()) {
            System.out.println(key);
            Integer value = modeMap.get(key);
            if(value > maxValue){
                maxValue = value;
                maxKey = key;
            }
            
        }
        return maxKey;
    }

    public static void main(final String args[]) {
        final int a[] = { 0, 6, 7, 2, 7 };
        System.out.println("Mode ::"+mode(a));
     }

}