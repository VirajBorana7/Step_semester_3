package string.assigment_problems;

import java.util.Scanner;

public class WordReversalEncoder {

    static String reverseWords(String sentence) {
        String[] words = sentence.split("\\s+");
        String result = "";

        for (int i = words.length - 1; i >= 0; i--) {
            result = result + words[i];

            if (i != 0) {
                result = result + " ";
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        System.out.println("Encoded sentence: " + reverseWords(sentence));

        sc.close();
    }
}