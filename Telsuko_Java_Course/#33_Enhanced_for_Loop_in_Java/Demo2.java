import javax.management.StringValueExp;

class Student{
    int rollno;
    String name;
    int marks;
}

public class Demo2 {
    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Jack";
        s1.marks = 76;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Daniel";
        s2.marks = 76;
        
        Student s3 = new Student();
        s3.rollno = 1;
        s3.name = "Thomas";
        s3.marks = 76;
        
        Student students[] = new Student[3];

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // Enhanced for loop.
        for(Student stud : students)
        {
            System.out.println(stud.rollno + " : " + stud.name + " : " + stud.marks);
        }

    }
}
