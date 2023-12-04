
package javaexception1;

public class JavaException1 {

    public static void main(String[] args) {
        
        try {
             int resultado = 3/0;
        }
        catch (Exception e) {
            System.out.println("It can not be divided by zero.");
        }
        
        try {
            int ages [] = {15, 12, 23, 30};
            System.out.println("The 4º age is: " + ages[4]);
        }
        catch (Exception a) {
           System.out.println("That index don't exist.");
        
        }
  
    }
    
}
