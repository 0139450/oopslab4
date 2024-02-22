/*using a constructor and destructor in Java, Write a Java class 'Student' and assign the following :
1. default constructor (string collegeName = "MVGR", int collegeCode=33)
2. parameterized constructor (string fullName, double semPerentage)
Also create the objects respectivelty asd display their values. */
import java.util.Scanner;
class consdest1{
    String collegename;
    int collegecode;
    String name;
    double percentage;

    consdest1(){
        collegename="mvgr";
        collegecode=33; 
    }
    consdest1(String fullname,double sempercentage){
        name=fullname;
        percentage=sempercentage;
    }
    void display(){
        System.out.println("name is:"+name);
        System.out.println("percentage"+percentage);
        System.out.println("college name:"+collegename);
        System.out.println("collegecode"+collegecode);

    }
    public static void main(String args[]){
        consdest1 n=new consdest1("gayi",89);
        consdest1 m=new consdest1();
        System.out.println("fullname is:   "+n.name+"  sempercentage   "+n.percentage+"  college name  "+m.collegename+"  college code   "+m.collegecode);
    }
    
}
