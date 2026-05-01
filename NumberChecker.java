import java.util.Scanner;

public class NumberChecker {

    public static int countDigits(int number) {
        if (number == 0) return 1;
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    public static int[] getDigits(int number) {
        int n = Math.abs(number);
        int count = countDigits(n);
        int[] digits = new int[count];
        int index = 0;
        if (n == 0) {
            digits[index] = 0;
        } else {
            while (n != 0) {
                digits[index++] = n % 10;
                n /= 10;
            }
        }
        return digits;
    }

    public static boolean isDuckNumber(int[] digits) {
        boolean hasNonZero = false;
        for (int d : digits) {
            if (d != 0) hasNonZero = true;
        }
        return hasNonZero;
    }

    public static boolean isArmstrong(int number, int[] digits) {
        int n = digits.length;
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, n);
        }
        return sum == Math.abs(number);
    }

    public static int[] largestTwo(int[] digits) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > max1) {
                max2 = max1;
                max1 = d;
            } else if (d > max2 && d != max1) {
                max2 = d;
            }
        }
        return new int[]{max1, max2};
    }

    public static int[] smallestTwo(int[] digits) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < min1) {
                min2 = min1;
                min1 = d;
            } else if (d < min2 && d != min1) {
                min2 = d;
            }
        }
        return new int[]{min1, min2};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int count = countDigits(number);
        int[] digits = getDigits(number);

        System.out.println("Count of digits: " + count);

        System.out.print("Digits: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }
        System.out.println();

        System.out.println("Duck Number: " + isDuckNumber(digits));
        System.out.println("Armstrong Number: " + isArmstrong(number, digits));

        int[] largest = largestTwo(digits);
        int[] smallest = smallestTwo(digits);

        System.out.println("Largest: " + largest[0]);
        System.out.println("Second Largest: " + largest[1]);

        System.out.println("Smallest: " + smallest[0]);
        System.out.println("Second Smallest: " + smallest[1]);

        sc.close();
    }
}