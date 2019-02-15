import java.util.Scanner;
public class Guessing {
    Scanner reader = new Scanner(System.in);
    static double rand = 0;
    static int numDrawn = 0;
    public static void main(String[] args){
        drawNumber(100,0);
        new Guessing().guessNumber();
    }
    public static void drawNumber(int max, int min){
        rand = (Math.random() * ((max - min) + 1)) + min;
        numDrawn = (int) rand;
        System.out.println(numDrawn);
    }
    public void guessNumber(){
        int count = 0;
        while(true){
        System.out.println("Guess a number: ");
        int num = Integer.parseInt(reader.nextLine());

        if(num >= 0 && num <= 100) {
            count++;
            if (num == numDrawn) {
                System.out.println("Congratulations, your guess is correct!"); break;
            } else if (num < numDrawn) {
                System.out.println("The number is lesser, guesses made: " + count);
            } else if (num > numDrawn) {
                System.out.println("The number is greater, guesses made: " + count);
            }
        } else {
            System.out.println("Please enter a number from 0 to 100.");
        }
        }
    }
}
