import java.util.Scanner;
class GetInputFromUser
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
String s=in.nextLine();
System.out.println("You entered string\t"+s);
int a=in.nextInt();
System.out.println("You entered integer\t"+a);
float b=in.nextFloat();
System.out.println("You entered float\t"+b);
}
}
