import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];
2
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = input.nextInt();
        }

        int largest = findLargest(numbers);

        System.out.println("Largest number: " + largest);

        String largestOddEven = isEven(largest) ? "even" : "odd";

        System.out.println("Largest number is " + largestOddEven);

        int sum = calculateSum(numbers);
        System.out.println("Sum: " + sum);

        if (largest < 0) {
            System.out.println("The number is negative");
        } else if (largest >= 0 && largest < 10) {
            System.out.println("The number is between 0 and 10");
        } else if (largest >= 10 && largest < 20) {
            System.out.println("The number is between 10 and 20");
        } else if (largest >= 20 && largest < 50) {
            System.out.println("The number is between 20 and 50");
        } else if (largest >= 50 && largest < 100) {
            System.out.println("The number is between 50 and 100");
        } else {
            System.out.println("The number is greater than or equal to 100");
        }
    }

    public static int findLargest(int[] numbers) {
        int largest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int calculateSum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}

