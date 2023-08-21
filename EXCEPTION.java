import java.util.Scanner;
public class EXCEPTION {
public static void main(String[] args) {
String username = "veenakuppam";
String password = "hello";
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Username");
String u1 = sc.nextLine();
System.out.println("Enter the Password");
String u2 = sc.nextLine();
try 
{if ((u1.equals(username)) && (u2.equals(password))) 
{
System.out.println("Acess Granted");}
else {
throw new credentialexception("Invalid Credentials");} }
catch (credentialexception e){
System.out.println(e.getMessage());}}}
class credentialexception extends Exception{
public credentialexception(String s){
super(s);}}
