import java.util.Scanner;
public class average{
public static void main(String[] args) {
int n;double res=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter how many numbers to cal  avg");
n=sc.nextInt();
try{
if(n < 0)
throw new MyException("Number is negative");
}
catch(MyException e) 
{
System.out.println(e.getMessage());
}
int a[]=new int[n];
System.out.println("enter "+n+"  numbers");
for(int i=0;i<n;i++)
a[i]=sc.nextInt();
for(int i=0;i<n;i++)
res =res+a[i];
System.out.println("average="+res/n);}

}

class MyException extends Exception{
public MyException(String s){
super(s);}}



