import java.util.Scanner;

public class Exercise3 {
    public static void returnNumbersGreaterThanNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Starting exercise 3");
        System.out.println("Insert numbers separated by a space:");
        String inputNumber = scanner.nextLine();

        System.out.println("Insert a number to compare:");
        int compareNumber = scanner.nextInt();

        String[] stringNumbers = inputNumber.split(" ");

        int[] numbers = new int[stringNumbers.length];
        for (int i = 0; i < stringNumbers.length; i++) {
            numbers[i] = Integer.parseInt(stringNumbers[i]);
        }

        int[] result = numbersGreaterThan(numbers, compareNumber);

        System.out.println("Numbers greater than " + compareNumber + ":");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] numbersGreaterThan(int[] numbers, int compareNumber) {
        int count = 0;
        for (int num : numbers) {
            if (num > compareNumber) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;
        for (int num : numbers) {
            if (num > compareNumber) {
                result[index++] = num;
            }
        }
        return result;
    }
}
