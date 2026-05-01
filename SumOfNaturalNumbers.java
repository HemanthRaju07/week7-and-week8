import java.util.Scanner;

public class SumOfNaturalNumbers {

    
    public static int recursiveSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + recursiveSum(n - 1);
    }

    
    public static int formulaSum(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

       
        if (n <= 0) {
            System.out.println("Please enter a natural number (greater than 0).");
        } else {
            int sumRecursion = recursiveSum(n);
            int sumFormula = formulaSum(n);

            
            System.out.println("Sum using recursion = " + sumRecursion);
            System.out.println("Sum using formula = " + sumFormula);

           
            if (sumRecursion == sumFormula) {
                System.out.println("Both results are equal. Computation is correct.");
            } else {
                System.out.println("Results are not equal. Something is wrong.");
            }
        }

        sc.close();
    }
}