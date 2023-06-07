import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Test
{
public static void main(String[] args)throws IOException
{
int a;
BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
String name=obj.readLine();
System.out.println("Enter number");
a=Integer.parseInt(obj.readLine());
System.out.println(name);
}
}
