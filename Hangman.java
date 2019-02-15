import java.util.Scanner;

public class Hangman {
    private static int count = 0; //Number of guesses
    private static String word = "vara"; //Word to guess
    private static String letters = "abcdefghijklmnopqrstuvwxyz"; //Letters acceptable for the game combined into a single string.
    private static String currentGuessedInWord = ""; //A "greyed" out copy of the word to guess. When user guesses letter that exists in word to guess, greyed letter at index is replaced with correct guess.

    public static void main(String[] args) {
        currentlyGuessed("");
        Scanner reader = new Scanner(System.in);
        Hangman hangman = new Hangman();

        System.out.println("***********");
        System.out.println("* HANGMAN  *");
        System.out.println("***********");
        System.out.println();
        printMenu();
        System.out.println();


        while (gameOn()) {
            System.out.println("Type a command: ");
            String command = reader.nextLine();
            command = command.replaceAll("\\s", "");
            if (command.equals("quit")) {
                break;
            }
            if (command.equals("status")) {
                printStatus();
            }

            if (command.length() == 1) {
                guess(command);
            }

            if (command.isEmpty()) {
                printMenu();
            }

            if (currentGuessedInWord.equals(word)) {
                System.out.println("You win!");
                break;
            }

            printMan();
            printWord();
        }

        System.out.println("Thank you for playing!");
    }

    public static boolean gameOn() {
        boolean isOn = true;

        /**if(count == 0){
         isOn = false;
         } else {
         isOn = true;
         }*/
        return isOn;
    }

    public static void printMenu() {
        System.out.println(" * menu *");
        System.out.println("quit   - quits the game");
        System.out.println("status  - prints the game status");
        System.out.println("a single letter uses the letter as a guess");
        System.out.println("an empty line prints this menu");
    }

    public static void currentlyGuessed(String guessed) {
        if (count == 0) {
            guessed = word;
            for (int i = 0; i < guessed.length(); i++) {
                char c = guessed.charAt(i); //get value at index
                String s = String.valueOf(c); //convert char into string
                guessed = guessed.replace(s, "?");
            }
            currentGuessedInWord = guessed;
        } else if (count != 0) {
            String tempWord = word;
            StringBuilder str = new StringBuilder(currentGuessedInWord);
            for (int i = 0; i < tempWord.length(); i++) {//Get index at which correct guess exists in tempWord (the word to be guessed).
                if ((String.valueOf(tempWord.charAt(i))).equals(guessed)) {
                    char c = guessed.charAt(0);
                    int index = i;
                    str.setCharAt(index, c); //replace the char at the matching index in the currentGuessedInWord with the guessed letter.
                    currentGuessedInWord = str.toString();
                }
            }
            System.out.println("Word to be guessed: " + currentGuessedInWord);
        }
    }

    public static void printStatus() {
        if (count == 0) {
            System.out.println("You have not made any guesses yet.");
        } else {
            System.out.println("You have made " + count + " guesses so far.");
        }

        System.out.println("You have not yet used the following letters: " + letters);

    }

    public static String printWord() {
        System.out.println();
        return currentGuessedInWord;
    }

    public static void printMan() {
        System.out.println(" ____\n" +
                " |\n" +
                " |\n" +
                " |\n" +
                " |\n" +
                "/|\\");
        printWord();
    }

    public static void guess(String str) {
        String lettersOriginal = "abcdefghijklmnopqrstuvwxyz";
        if (lettersOriginal.contains(str)) {
            count++;
            if (letters.contains(str)) { //the user is guessing this letter for the first time.
                letters = letters.replaceAll(str, "");
                if (word.contains(str)) {
                    System.out.println("The letter " + str + " was found in the word!");
                    currentlyGuessed(str);
                } else if (!word.contains(str)) {
                    System.out.println("The letter " + str + " was not found in the word!");
                }
            } else if (!letters.contains(str)) {
                System.out.println("You have already guessed the letter " + str + ". Please try another letter.");
                System.out.println("Unused letters: " + letters + "\n");
            }
        } else if (!lettersOriginal.contains(str)) {
            System.out.println("Please enter a letter in the alphabet.");
        }


    }
}
