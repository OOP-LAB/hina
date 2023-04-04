import java.util.Scanner;
public class Addition{
public static void main(String[] args){
int row,col,i,j;
Scanner in=new Scanner(System.in);
System.out.println("Enter the number of rows:");
row=in.nextInt();
System.out.println("Enter the number of columns:");
col=in.nextInt();
int Mat[][]=new int[row][col];
int Mat3[][]=new int[row][col];
System.out.println("Enter the values:");
for(i=0;i<row;i++)
for(j=0;j<col;j++)
Mat[i][j]=in.nextInt();
int Rix[][]=new int[row][col];
System.out.println("Enter the values:");
for(i=0;i<row;i++)
for(j=0;j<col;j++)
Rix[i][j]=in.nextInt();
for(i=0;i<row;i++)
for(j=0;j<col;j++)
Mat3[i][j]=Mat[i][j]+Rix[i][j];
for(i=0;i<row;i++)
{
System.out.print("\n");
for(j=0;j<col;j++)
System.out.print("\t"+Mat3[i][j]);
}
}
}
