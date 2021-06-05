import java.util.*;
public class genericUc1
{
public static void compareTo(int a,int b,int c)
{
System.out.println(Math.max(a,Math.max(b,c)));
}
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
compareTo(sc.nextInt(),sc.nextInt(),sc.nextInt());
}
}
