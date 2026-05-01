import java.util.Scanner;

public class TriangleRun {

   
    public static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        return 5000 / perimeter; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter side 1 (in meters): ");
        double side1 = sc.nextDouble();

        System.out.print("Enter side 2 (in meters): ");
        double side2 = sc.nextDouble();

        System.out.print("Enter side 3 (in meters): ");
        double side3 = sc.nextDouble();

       
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            System.out.println("Invalid input! Sides must be positive.");
        } else {
            double rounds = calculateRounds(side1, side2, side3);

            
            System.out.println("Number of rounds required to complete 5 km: " + rounds);
        }

        sc.close();
    }
}