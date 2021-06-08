import java.util.*;
public class genericUc3Refactor {
  
   //using comparable
   public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
      T max = x;   // assigning x as initially the largest
      
      if(y.compareTo(max) > 0) {
         max = y;   
      }
      
      if(z.compareTo(max) > 0) {
         max = z;                    
      }
      return max;   // returns the maximum object   
   }
   
   public static void main(String args[]) {
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter 3 integers");
      System.out.println(maximum( sc.nextInt(), sc.nextInt(), sc.nextInt() ));
      System.out.println("Enter 3 floats");
      System.out.println(maximum( sc.nextFloat(), sc.nextFloat(), sc.nextFloat() ));
      System.out.println("Enter 3 strings");
      String str1 = sc.nextLine();
      String str2 = sc.nextLine();
      String str3 = sc.nextLine();
sc.nextLine();
      System.out.println(maximum(str1,str2 ,str3));
      
   }
}
