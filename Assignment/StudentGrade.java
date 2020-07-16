import java.util.Scanner;
public class StudentGrade {
    public static void main(String[] args) {
        System.out.println("Enter the marks scored by the students:");
        Scanner sc=new Scanner(System.in);
        System.out.print("Written Test =");
        float scoreWritten=sc.nextFloat();
        System.out.println();
        System.out.print("Lab Exams =");
        float scoreLab=sc.nextFloat();
        System.out.println();
        System.out.print("Assignments =");
        float scoreAssignments=sc.nextFloat();
        System.out.println();
        float totalGrade=((scoreWritten*70)/100+(scoreLab*20)/100+(scoreAssignments*10)/100);
        System.out.println("Grade of the student is ="+totalGrade);
    }    
}