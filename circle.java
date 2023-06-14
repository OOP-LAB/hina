package Graphics;
import java.util.Scanner;
interface area_cal
{
void area();
}
public class circle implements area_cal
{
int radius;
public void area()
{
Scanner sc=new Scanner(System.in);
System.out.println("Input Radius of circle:");
radius=sc.nextInt();
String area=Double.toString(Math.PI*radius*radius);
System.out.println("Area of the circle is:"+area);
sc.close();
}
}
