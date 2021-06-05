import java.util.*;
public class genericUc2
{
public static void compareTo(float a,float b,float c)
{
System.out.println(Math.max(a,Math.max(b,c)));
}
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter 3 integers");
compareTo(sc.nextInt(),sc.nextInt(),sc.nextInt());
System.out.println("enter 3 float numbers");
compareTo(sc.nextFloat(),sc.nextFloat(),sc.nextFloat());
}
}
