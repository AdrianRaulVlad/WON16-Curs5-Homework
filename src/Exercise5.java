import java.util.Random;
import java.util.Scanner;

public class Exercise5 {
    public static void fundRaisingDonationsImproved() {
        System.out.println("Starting exercise 5");

        Scanner scanner = new Scanner(System.in);
        Random randomDonation = new Random();

        System.out.println("Enter the donation target:");
        int targetDonation = scanner.nextInt();

        System.out.println("Enter the maximum number of donations:");
        int maxDonations = scanner.nextInt();

        int totalDonation = 0;
        int donationCount = 0;
        while (totalDonation < targetDonation && donationCount < maxDonations) {
            int donation = randomDonation.nextInt(101); // generate a random donation between 0 and 100
            totalDonation += donation;
            donationCount++;
            System.out.println("Received a donation of " + donation + " $. Total accumulated amount: " + totalDonation + " $.");

            if (totalDonation >= targetDonation) {
                System.out.println("Desired donation target (" + targetDonation + " $) has been reached!");
                break;
            } else if (donationCount >= maxDonations) {
                System.out.println("Maximum number of donations (" + maxDonations + ") has been reached. Campaign ended.");
                break;
            }
        }
    }
}
