import java.util.Scanner;

public class FactorsProgram {

    
    public static int[] getFactors(int number) {
        int count = 0;

       
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        
        int[] factors = new int[count];
        int index = 0;

       
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }

    
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) {
            product *= f;
        }
        return product;
    }

    
    public static double sumOfSquares(int[] factors) {
        double sum = 0;
        for (int f : factors) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            int[] factors = getFactors(number);

           
            System.out.print("Factors: ");
            for (int f : factors) {
                System.out.print(f + " ");
            }
            System.out.println();

            
            int sum = sumOfFactors(factors);
            long product = productOfFactors(factors);
            double sumSquares = sumOfSquares(factors);

            
            System.out.println("Sum of factors = " + sum);
            System.out.println("Product of factors = " + product);
            System.out.println("Sum of squares of factors = " + sumSquares);
        }

        sc.close();
    }
}