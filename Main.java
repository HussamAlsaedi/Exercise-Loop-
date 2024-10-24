import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

/*
1.Write a program that prints the numbers from 1 to 100 such that:
If the number is a multiple of 3, you need to print "Fizz" instead of that number.
*/
         for (int i = 1; i <= 100; i++) {
            if ( i % 3 == 0 && i % 5 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0 ) {
                System.out.println("Buzz");
            } else if ( i % 3 == 0)
            {
                System.out.println("FizzBuzz");
            }
            System.out.println(i);
        }

 /* 2.Write a Java program to reverse a string.
Test Data: Input a string: The quick brown fox Expected Output: Reverse string: xof nworb kciuq ehT  */

        System.out.println("input a string: ");
        String input = scanner.nextLine();
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Reversed string: " + reversed);


/* 3. Write a program to find the factorial value of any number entered through the keyboard. */

        System.out.println("Enter a number: ");
        double integers = scanner.nextDouble();
        double factorial = 1;
        for (int i = 1; i <= integers; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + integers + " is: " + factorial);

/* 4.Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another. (Do not use Java built-in method)
*/
        System.out.println("ادخل الرقم الأساسي: ");
        int base = scanner.nextInt();
        System.out.println("ادخل الأس: ");
        int exponent = scanner.nextInt();
        int result = 1;

        int i = 1;
        while (i <= exponent) {
            result = result * base;
            i = i + 1;
        }

        System.out.println("النتيجة: " + result);


/* 5.Write a program that reads a set of integers, and then prints the sum of the even and odd integers. */

        System.out.println("Enter integers enter 0 to stop: ");
        int integer;
        int sumEven = 0;
        int sumOdd = 0;

        while ((integer = scanner.nextInt()) != 0) {
            if (integers % 2 == 0) {
                sumEven += integer;
            } else {
                sumOdd += integer;
            }
        }

        System.out.println("Sum even numbers: " + sumEven);
        System.out.println("Sum odd numbers: " + sumOdd);

/*
    6.Write a program that prompts the user to input a positive integer. It should then output a message indicating whether the number is a prime number.
*/
        System.out.println("Enter a positive integer: ");
        int num = scanner.nextInt();
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
/*


        7.Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use another for loop to print the days (Days 1 -7) for each week.
*/

        for (int week = 1; week <= 4; week++) {
            System.out.println("Week " + week);
            for (int day = 1; day <= 7; day++) {
                System.out.println("Day" + day);
            }
        }


/*
8.Write a program thats check if the word is a palindrome or not. hint: A string is said to be a palindrome if it is the same if we start reading it from left to right or right to left.

*/

        System.out.println("Enter a word: ");
        String word = scanner.nextLine();
        String reversed_ = new StringBuilder(word).reverse().toString();

        if (word.equals(reversed_)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }

}}