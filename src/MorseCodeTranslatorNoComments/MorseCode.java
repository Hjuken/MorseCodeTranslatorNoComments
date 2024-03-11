package MorseCodeTranslatorNoComments;

import java.util.Scanner;

public class MorseCode {
    public static void main(String[] args) {
        System.out.println("Welcome to the morse code translator. You can write your message in english or in morse code.");
        System.out.println("If you write in morse, put space between letters and / between words!");
        System.out.println("To finish message write: Stop");

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter message:");
            String input = scanner.nextLine().toUpperCase();

            if (isMorseCode(input)) {
                Morse morse = new Morse();
                String englishLetters = morse.getLettersFromMorse(input);
                System.out.println("In english: " + englishLetters);

            } else {
                Letters letters = new Letters();
                String morseCodeOutput = letters.getMorseCodeWord(input);
                System.out.println("Morse Code: " + morseCodeOutput);
            }
            if (input.equals("STOP")) {
                break;
            }
        }
    }

    private static boolean isMorseCode(String input) {
        return input.matches("^[\\s*/-]*$");
    }
}

