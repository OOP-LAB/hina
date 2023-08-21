package graphics;
import java.util.Scanner;
interface area_cal
{
void area();
}
public class Rectangle implements area_cal{
int l,b;
public void area()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the length of the rectangle:");
l= sc.nextInt();
System.out.println("Enter the breadth of the rectangle:");
b= sc.nextInt();
System.out.println("Area of the rectangle ="+l*b);
}
}

