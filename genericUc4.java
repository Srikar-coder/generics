import java.util.*;
public class genericUc4	 {
  
   public static < E > void printArray( E[] inputArray ) {
      // Display array elements
      for(E element : inputArray) {
         System.out.printf("%s ", element);
      }
      System.out.println();
   }
   
   public static void main(String args[]) {
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter size");
      int n = sc.nextInt();
      String str[]=new String[n];
      Integer arr[]=new Integer[n];
      Double arr2[]= new Double[n];
       System.out.println("Enter "+n+"Integers");
      for(int i=0;i<n;i++)
      arr[i]=sc.nextInt();
       System.out.println("Enter "+n+"Floats");
      for(int i=0;i<n;i++)
      arr2[i]=sc.nextDouble();
       System.out.println("Enter "+n+"Strings");
      for(int i=0;i<n+1;i++)
      {
      String str1=sc.nextLine();
      str[i]=str1;
      }
//sc.nextLine();
      printArray(arr);
      printArray(arr2);
      printArray(str);
   }
}
