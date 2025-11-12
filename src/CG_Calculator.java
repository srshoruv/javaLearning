import java.util.Scanner;

public class CG_Calculator {
    static double marksToGrades(double marks)
    {
        double grade;
        if (marks >= 80 && marks <= 100)
        {
            grade = 4.0;
        }
        else if (marks >= 75)
        {
            grade = 3.75;
        }
        else if (marks >= 70)
        {
            grade = 3.5;
        }
        else if (marks >= 65)
        {
            grade = 3.25;
        }
        else if (marks >= 60)
        {
            grade = 3.0;
        }
        else if (marks >= 55)
        {
            grade = 2.75;
        }
        else if (marks >= 50)
        {
            grade = 2.5;
        }
        else if (marks >= 45)
        {
            grade = 2.25;
        }
        else if (marks >= 40)
        {
            grade = 2.0;
        }
        else grade = 0;

        return grade;
    }
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int total_courses;
        double total_Credit = 0;
        double total_GP = 0;
        System.out.print("Enter the total Number of Course you have: ");
        total_courses = input.nextInt();
        int i = 1;

        while(total_courses > 0)
        {
            int marks;
            double credit;
            double grade;
            System.out.print("Enter Obtained Marks of Course " +  i + ": ");
            marks = input.nextInt();
            System.out.print("Enter Course Credit of Course " +  i + ": ");
            credit = input.nextFloat();

            grade = marksToGrades(marks);

            total_Credit += credit;
            total_GP += credit * grade;

            total_courses--;
            i++;

        }

        double CG = Math.round((total_GP / total_Credit) * 100.0) / 100.0;
        System.out.println("Your CGPA of this semester is: " + CG);

    }
}