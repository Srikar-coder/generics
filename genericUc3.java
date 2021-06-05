import java.util.*;
public class genericUc3
{
public static void compareTo(int a,int b,int c)
{
System.out.println(Math.max(a,Math.max(b,c)));
}
public static void compareTo(float a,float b,float c)
{
System.out.println(Math.max(a,Math.max(b,c)));
}

public static void compareTo(String a,String b,String c)
{
if(a.compareTo(b)>0 && a.compareTo(c)>0)
System.out.println(a);

else if(b.compareTo(a)>0 && b.compareTo(c)>0)
System.out.println(b);

else if(c.compareTo(a)>0 && c.compareTo(b)>0)
System.out.println(c);

}
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter 3 integers");
compareTo(sc.nextInt(),sc.nextInt(),sc.nextInt());
System.out.println("enter 3 float numbers");
compareTo(sc.nextFloat(),sc.nextFloat(),sc.nextFloat());
System.out.println("enter 3 strings");
String s1=sc.nextLine();
String s2=sc.nextLine();
String s3=sc.nextLine();
sc.nextLine();
compareTo(s1,s2,s3);
}
}
