
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
       System.out.println("Assignment:" + assignmentName);
       double minmumMark = findMinmumMark(studentMarks);
       double maxmumMark = findMaxmumMark(studentMarks);
       System.out.println("The lowest mark:" + minmumMark);
       System.out.println("The highest mark:" + maxmumMark);
       scanner.close();
   }
   
   //Find the minmum mark
   public static double findMinmumMark(double[] marks) {
       double minMark = marks[0];

        for (double mark : marks) {
            if (mark < minMark) {
                minMark = mark;
            }
        }

        return minMark;
   }
   
   //Find the maxmum mark
   public static double findMaxmumMark(double[] marks) {
       double maxMark = marks[0];

        for (double mark : marks) {
            if (mark > maxMark) {
                maxMark = mark;
            }
        }

        return maxMark;
   }
}
