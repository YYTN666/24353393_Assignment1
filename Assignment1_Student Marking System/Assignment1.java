
/**
 * Write a description of class Assignment1 here.
 *
 * @author (Yutaien Yang)
 * @version (20230909)
 */
import java.util.Scanner;
public class Assignment1
{
   public static void main (String[] args){
       //Ask the user to input the name of assignmnet  
       Scanner scanner = new Scanner(System.in);
       System.out.print("Please enter the name of the assignment:");
       String assignmentName = scanner.nextLine();
       
       
       //Ask the user to input the marks of assignmnet  
       double[] studentMarks = new double[30];
       for (int i = 0; i < 30; i++) {
           while(true) {
           System.out.print("Please enter the marks of the student " + ( i + 1 ) + ": ");
           if(scanner.hasNextDouble()) {//Check for invalid data 
             double mark = scanner.nextDouble();
             if(mark > 30 || mark < 0) {//Check for invalid data 
                 System.out.println("Invalid! The mark should be a number between 0 and 30!");
             } else {
                 studentMarks[i] = mark; break;
             }
           } else {
               System.out.println("Invalid! The mark should be a number between 0 and 30!");
               scanner.next();//Preventing an infinite loop
           }
        }
       }
       scanner.close();
   }

}
