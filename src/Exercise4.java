import java.util.Random;
import java.util.Scanner;

public class Exercise4 {
    public static void fundRaisingDonations() {
        System.out.println("Starting exercise 4");

        Scanner scanner = new Scanner(System.in);
        Random randomDonation = new Random();

        System.out.println("Enter the donation target:");
        int targetDonation = scanner.nextInt();

        int totalDonation = 0;
        int donation;
        while (totalDonation < targetDonation) {
            donation = randomDonation.nextInt(101); // generate a random donation between 0 and 100
            totalDonation += donation;
            System.out.println("Received a donation of " + donation + " $. Total accumulated amount: " + totalDonation + " $.");
        }
        System.out.println("Desired donation target (" + targetDonation + " $) has been reached!");
    }
}
