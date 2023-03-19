import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Select an option:");
        System.out.println("1. Find factorial");
        System.out.println("2. Check palindrome");
        System.out.println("3. Check Armstrong number");

        int option = input.nextInt();

        switch (option) {
            case 1:
                System.out.print("Enter a number to find its factorial: ");
                int n = input.nextInt();
                int factorial = findFactorial(n);
                System.out.println("Factorial of " + n + " is " + factorial);
                break;

            case 2:
                System.out.print("Enter a number to check if it's a palindrome: ");
                int num = input.nextInt();
                boolean isPalindrome = checkPalindrome(num);
                if (isPalindrome) {
                    System.out.println(num + " is a palindrome");
                } else {
                    System.out.println(num + " is not a palindrome");
                }
                break;

            case 3:
                System.out.print("Enter a number to check if it's an Armstrong number: ");
                int number = input.nextInt();
                boolean isArmstrong = checkArmstrong(number);
                if (isArmstrong) {
                    System.out.println(number + " is an Armstrong number");
                } else {
                    System.out.println(number + " is not an Armstrong number");
                }
                break;

            default:
                System.out.println("Invalid option selected");
        }
    }

    public static int findFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * findFactorial(n - 1);
        }
    }

    public static boolean checkPalindrome(int num) {
        int reversedNum = 0;
        int originalNum = num;

        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        if (originalNum == reversedNum) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkArmstrong(int number) {
        int sum = 0;
        int originalNumber = number;
        int numberOfDigits = String.valueOf(number).length();

        while (number != 0) {
            int remainder = number % 10;
            sum += Math.pow(remainder, numberOfDigits);
            number /= 10;
        }

        if (sum == originalNumber) {
            return true;
        } else {
            return false;
        }
    }
}
