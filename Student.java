class Student{
    int rollno;
    void display(){
        System.out.println(rollno);
    }
public static void main(String args[])
{
    Student obj=new Student();
    obj.rollno=6;
    obj.display();
}
}
