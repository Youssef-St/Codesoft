
  import java.util.Scanner;

public class Task2 {
    

        public static void main(String[] args) {
            
            Scanner scanner = new Scanner(System.in);
    
            // Get student name
            System.out.println("Enter student name:");
            String studentName = scanner.nextLine();
    
            // Get number of subjects
            System.out.println("Enter number of subjects:");
            int numSubjects = scanner.nextInt();
    
            // Array to store grades
            double[] grades = new double[numSubjects];
            double total = 0;
    
            // Loop to input grades and calculate total
            for (int i = 0; i < numSubjects; i++) {
                System.out.println("Enter grade for subject " + (i + 1) + ":");
                grades[i] = scanner.nextDouble();
                total += grades[i]; // Adding grades to total
            }
    
            // Calculate average
            double average = total / numSubjects;
    
            // Display result
            System.out.println("Student: " + studentName);
            System.out.println("Average grade: " + average);
            
            if(average >= 80)
            System.out.println("Status: A+ " );
            else if (average >= 75 && average <= 79)
            System.out.println("Status: A " );
            else if (average >= 70 && average <= 74)
            System.out.println("Status: A- " );
            else if(average >= 65 && average <= 69)
            System.out.println("Status: B+ " );
            else if (average >= 60 && average <= 64 )
            System.out.println("Status: B " );
            else if (average >= 55 && average <= 59)
            System.out.println("Status: B- " );
            else if (average >= 50 && average <= 54)
            System.out.println("Status: C+ " );
            else if(average >= 45 && average <= 49)
            System.out.println("Status: C " );
            else if (average >= 40 && average <= 44 )
            System.out.println("Status: D " );
            else 
            System.out.println("Status: F " );

    
            scanner.close();
        }
    }

