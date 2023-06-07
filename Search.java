import java.util.Scanner;
public class Search
{
public static void main(String[] args){
int i,j,x=0;
boolean state=false;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number of elements in array");
int num=sc.nextInt();
String word[]=new String[num];
sc.nextLine();
for(i=0;i<num;i++){
System.out.println("\n Enter the elements");
word[i]=sc.nextLine();
}
System.out.println("enter the lement to search");
String search=sc.nextLine();
for(i=0;i<num;i++)
{
if(word[i].equals(search)){
x=i;
state=true;
}
}
if(state){
System.out.println("Element found at position="+x);
}
else{
System.out.println("Elemnt not found");
}
}
}
