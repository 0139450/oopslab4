/*Using a constructor and destructor in Java, Write a Java class 'Student' and assign the following :
* string fullName
* int rollNum
* double semPerentage
* string collegeName
* int collegeCode*/
import java.util.Scanner;
class student{
    String name;
    int num;
    double percent;
    String cllgname;
    int code;
    student(String fullName,int rollNum,
    double semPerentage,
    String collegeName,
    int collegeCode){
        /*System.out.println("enter name");
        Scanner s=new Scanner(System.in);
        String name=s.next();
        System.out.println(name);*/
        name=fullName;
        num=rollNum;
        percent=semPerentage;
        cllgname= collegeName;
        code=collegeCode;

    }
       void display()
    {
        System.out.println(name);
        System.out.println(num);
        System.out.println(percent);
        System.out.println(cllgname);
        System.out.println(code);
    }
    public static void main(String args[])
    {
        
        student n=new student("gayi",501,89,"mvgr",33);
        System.out.println("name is:"+n.name+"   roll num  "+n.num+"  sempercentage  "+n.percent+"  college name  "+n.cllgname+"   collegecode  "+n.code);
    }
}
