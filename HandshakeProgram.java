import java.util.Scanner;

public class HandshakeProgram {

    // Method to calculate number of handshakes
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();

        // Validate input
        if (numberOfStudents < 0) {
            System.out.println("Invalid number of students");
        } else {
            int result = calculateHandshakes(numberOfStudents);

            // Output
            System.out.println("The maximum number of handshakes is " + result);
        }

        sc.close();
    }
}