package graphics;
import java.util.Scanner;
interface area_cal {
void area();
}
public class Square implements area_cal{
int side;
public void area() {
Scanner sc = new Scanner(System.in);
System.out.println("Input side length of square : ");
side = sc.nextInt();
String area = Double.toString(side*side);
System.out.println("Area of the square : "+area);
}
}
