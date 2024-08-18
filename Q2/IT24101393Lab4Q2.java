import java.util.Scanner;

public class IT24101393Lab4Q2 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

   
        System.out.print("Enter the exam marks (percentage): ");
        double examMarks = scanner.nextDouble();

 
        System.out.print("Enter the lab submission marks (percentage): ");
        double labMarks = scanner.nextDouble();

        System.out.print("Enter the weight of exam marks (as a percentage, e.g., 70 for 70%): ");
        double examWeight = scanner.nextDouble();

     
        System.out.print("Enter the weight of lab submission marks (as a percentage, e.g., 30 for 30%): ");
        double labWeight = scanner.nextDouble();

   
        if (examWeight + labWeight != 100) {
            System.out.println("Error: The weights must add up to 100%");
            return;
        }

   
        double finalMark = (examMarks * (examWeight / 100)) + (labMarks * (labWeight / 100));

    
        System.out.printf("The final mark of the module is: %.2f%%\n", finalMark);

  
        scanner.close();
    }
}
