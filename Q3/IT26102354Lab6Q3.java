import java.util.Scanner;

public class IT26102354Lab6Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double sumOfSquares = 0;
        int count = 0;
        int number;

        System.out.println("Enter positive integers (terminate input with -99):");

       
        while (true) {
            System.out.print("Enter a number: ");
            number = input.nextInt();

            if (number == -99) {
                break;
            }

            if (number > 0) {
  
                sumOfSquares += Math.pow(number, 2);
                count++;
            } else {
               
                System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
            }
        }

        
        if (count > 0) {
           
            double meanOfSquares = sumOfSquares / count;
            double rms = Math.sqrt(meanOfSquares);

            System.out.println();
            System.out.println("The Root Mean Square (RMS) is: " + rms);
        } else {
            System.out.println("No valid numbers were entered.");
        }

        input.close();
    }
}