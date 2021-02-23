public class StaticVariables {

    public static void main(final String[] args) throws Exception {
            int intPrim = 5; 
            Integer intObj = 5;
            intObj = intPrim; 
            intPrim = intObj;
            String intString = intObj.toString();
            int intPrim2 = Integer.parseInt(intString); 
            Integer intObj2 = Integer.parseInt(intString); 
            Integer intMinValue = Integer.MIN_VALUE; 
            Integer.toString(5);

            // System.out.println(" Access Static " + StaticClass.i);
            //     StaticClass.i = 6;
            //     System.out.println(" Access Static " + StaticClass.i);

    }
    
        
}