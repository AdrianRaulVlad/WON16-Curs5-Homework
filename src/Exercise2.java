import java.util.Scanner;

public class Exercise2 {
    public static void returnHowManyNumbersAreOdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Starting exercise 2");
        System.out.println("Insert numbers separated by a space:");

        String inputNumber = scanner.nextLine();
        String[] stringNumbers = inputNumber.split(" ");

        int numberOfOddElements = 0;
        for (String number : stringNumbers) {
            int intNumber = Integer.parseInt(number);
            if (intNumber % 2 != 0) {
                numberOfOddElements++;
            }
        }
        System.out.println("The number of the odd elements is: " + numberOfOddElements);
    }
}
