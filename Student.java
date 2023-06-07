class Student
{
int rollno;
void display()
{
System.out.println(rollno);
}
public static void main(String args[])
{
Student obj=new Student();
obj.rollno=6;
Student obj1=new Student();
obj1.rollno=7;
obj.display();
obj1.display();
}
}

