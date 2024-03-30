import java.util.Scanner;

public class Exercise1 {
    public static void calculateTheSumOfInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Starting exercise 1");
        System.out.println("Insert numbers separated by a space to calculate the sum:");

        String inputNumber = scanner.nextLine();
        String[] stringNumbers = inputNumber.split(" ");

        int sum = 0;
        for (String number : stringNumbers) {
            int intNumber = Integer.parseInt(number);
            sum += intNumber;
        }

        System.out.println("The sum of the inserted numbers is: " + sum);
    }
}
