
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
       double MinimumMark = findMinimumMark(studentMarks);
       double MaximumMark = findMaximumMark(studentMarks);
       double averageMark = findAverageMark(studentMarks);
       double standardDeviation = findStandardDeviation(studentMarks, averageMark);
       System.out.println("The lowest mark:" + MinimumMark);
       System.out.println("The highest mark:" + MaximumMark);
       System.out.println("Average mark:" + averageMark);
       System.out.println("Standard deviation:" + standardDeviation);
       scanner.close();
   }

   //Find the Minimum mark
   public static double findMinimumMark(double[] marks) {
       double minMark = marks[0];

        for (double mark : marks) {
            if (mark < minMark) {
                minMark = mark;
            }
        }

        return minMark;
   }
   
   //Find the Maximum mark
   public static double findMaximumMark(double[] marks) {
       double maxMark = marks[0];

        for (double mark : marks) {
            if (mark > maxMark) {
                maxMark = mark;
            }
        }

        return maxMark;
   }
   
   //Find the mean of the marks
   public static double findAverageMark(double[] marks) {
       double sum = 0;

        for (double mark : marks) {
            sum += mark;
        }
        double mean = sum / marks.length;
        return mean;
   }
   
   //Find the standard deviation of the marks
   public static double findStandardDeviation(double[] marks, double mean) {
       double sumSquaredDifference = 0;
        for (double mark : marks) {
            double difference = mark - mean;
            sumSquaredDifference += difference * difference;
        }
        double standardDeviation = Math.sqrt(sumSquaredDifference / marks.length);
        return standardDeviation;
   }
}
