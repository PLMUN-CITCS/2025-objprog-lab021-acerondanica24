import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        // Get sentence input from user
        String sentence = getSentenceInput();
        
        // Count words and display result
        int wordCount = countWords(sentence);
        System.out.println("The sentence has " + wordCount + " words.");
    }

    // Method to get sentence input from user
    public static String getSentenceInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        scanner.close();
        return sentence;
    }

    // Method to count words in a sentence
    public static int countWords(String sentence) {
        if (sentence.trim().isEmpty()) {
            return 0;  // Return 0 for empty input
        }
        String[] words = sentence.trim().split("\\s+");  // Splits on one or more spaces
        return words.length;
    }
}
