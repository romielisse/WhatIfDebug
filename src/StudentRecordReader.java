// Wrong spelling of Scanner class
import java.util.Scanner;

public class StudentRecordReader {

    // Brackets are backwards next to String[]
    public static void main(String[] args) {
        String fname, lname;
        // GPA should be a double
        double gpa;

        Scanner keyboard = new Scanner(System.in);

        System.out.print( "Student's First Name? " );
        fname = keyboard.next();

        System.out.print( "Student's Last Name? " );
        lname = keyboard.next();

        System.out.print( "Student's GPA? " );
        gpa = keyboard.nextDouble();

        System.out.println();
        System.out.println("Student Name :" + fname + " " + lname);
        System.out.println("Student GPA :" + gpa);
        if (gpa >= 3)
        {
            System.out.println("This student is in good standing.");
        }
        // Comparison operator is ==, not =
        else if (gpa == 1)
        {
            System.out.println("This student is on academic probation.");
        }
        else
        {
            // Should be System.out
            System.out.println("This student has been expelled.");
        }
    }
}