
/**
 * Write a description of class Assignment1 here.
 *
 * @author (Yutaien Yang)
 * @version (20230909)
 */
import java.util.Scanner;
public class Assignment1
{
   public void ReceiveAssignmentName(){ //ask the user to input the name of assignmnet  
       Scanner scanner = new Scanner(System.in);
       System.out.print("Please enter the name of the assignment:");
       String assignmentName = scanner.nextLine();
       scanner.close();
   }
   
   public void ReceiveAssignmentMarks(){ //ask the user to input the marks of assignmnet  
       double[] studentMarks = new double[30];
       Scanner scanner = new Scanner(System.in);
       for (int i = 0; i < 30; i++) {
           System.out.print("Please enter the marks of the assignment " + ( i + 1 ) + ": ");
           double mark = scanner.nextDouble();
           if(mark > 30 || mark < 0) {
               System.out.print("Invalid input! Mark should be between 0 and 30!");
           } else {
               studentMarks[i] = scanner.nextDouble();
           }
       }
       scanner.close();
   }

}
