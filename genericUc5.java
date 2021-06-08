import java.util.*;
public class genericUc5	 {
  
   public static <T extends Comparable<T>> T printMax(T... elements) {
    T max = elements[0];
    for (T element : elements) {
        if (element.compareTo(max) > 0) {
            max = element;
        }
    }
    return max;
}   
   public static void main(String args[]) {
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter size");
      int n = sc.nextInt();
      String str[]=new String[n];
      Integer arr[]=new Integer[n];
      Double arr2[]= new Double[n];
       System.out.println("Enter "+n+" Integers");
      for(int i=0;i<n;i++)
      arr[i]=sc.nextInt();
       System.out.println("Enter "+n+" Floats");
      for(int i=0;i<n;i++)
      arr2[i]=sc.nextDouble();
       System.out.println("Enter "+n+" Strings");
      for(int i=0;i<n;i++)
      {
      String str1=sc.next();
      
      str[i]=str1;
      
      }
      //sc.nextLine();
      System.out.println(printMax(arr));
      System.out.println(printMax(arr2));
      System.out.println(printMax(str));
   }
}
