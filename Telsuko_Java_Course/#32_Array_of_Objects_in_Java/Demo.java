import javax.swing.text.StyledEditorKit;

class Student
{
    int rollnumber;
    String name;
    int marks;
}

public class Demo {
    public static void main(String[] args) 
    {
        
        // int nums[] = new int[5];

        // nums[0] = 4;
        // nums[1] = 8;
        // nums[2] = 2;

        // for(int i=0;i<nums.length;i++)
        //     System.out.print(nums[i] + " ");

        Student s1 = new Student();
        s1.rollnumber = 1;
        s1.name = "Kiran";
        s1.marks = 47;

        Student s2 = new Student();
        s2.rollnumber = 2;
        s2.name = "Kishore";
        s2.marks = 99;

        Student s3 = new Student();
        s3.rollnumber = 3;
        s3.name = "Murthy";
        s3.marks = 87;

        Student students[] = new Student[3];

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i=0;i<students.length;i++)
        {
            System.out.println(students[i].rollnumber + " : " + students[i].name + " : " + students[i].marks);
        }

    }    
}
