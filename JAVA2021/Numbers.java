
import java.util.Scanner;

    
    public class Numbers
    
    {
    
      public static void main (String[] args)
    
      {
    
          int [] number = new int[51];
          System.out.println("Enter integers in the range of 0 to 50 \nTo quit, enter a number higher than 50");
          Scanner user = new Scanner(System.in);
          int userNumber = user.nextInt();
          
          while(userNumber >= 0 && userNumber < 51) {
              number[userNumber] = number[userNumber] + 1;
              userNumber = user.nextInt();
            }
           System.out.println("Number \t Times");
              for (int i = 0; i < 51; i++){
                  if (number[i] > 0)
                        System.out.println(i + ":\t" + number[i]);
                }
        
        
      }
    
    
}