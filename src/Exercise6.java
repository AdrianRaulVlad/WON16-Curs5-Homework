import java.util.Scanner;

public class Exercise6 {
    public static void printSentencesFromParagraph() {
        System.out.println("Starting exercise 6");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter multiple sentences separated by period:");
        String inputParagraph = scanner.nextLine();

        // Split the input string into sentences using period as separator
        String[] sentences = inputParagraph.split("\\.");

        // Print each sentence
        for (String sentence : sentences) {
            sentence = sentence.trim(); // Remove extra spaces
            if (!sentence.isEmpty()) { // Check if the sentence is not empty
                System.out.println(sentence);
            }
        }
    }
}
