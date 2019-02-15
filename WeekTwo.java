import java.util.Scanner;

public class WeekTwo {
    Scanner reader = new Scanner(System.in);
    public static void main(String[] args){
       new WeekTwo().printStars(4);
    }
    public void sumOfThree(){
        int sum = 0;
        int read;

        System.out.println("Enter your first number: ");
        sum = Integer.parseInt(reader.nextLine());
        System.out.println("Enter you second number: ");
        sum = sum + Integer.parseInt(reader.nextLine());
        System.out.println("Enter your third number");
        sum = sum + Integer.parseInt(reader.nextLine());

        System.out.println("Sum: " + sum);
    }
    public void sumOfMany(){
        int sum = 0;
        while (true){
            int read = Integer.parseInt(reader.nextLine());
            if(read == 0){
                break;
            }

            sum = read + sum;

            System.out.println("Sum now: " + sum);
        }
        System.out.println("Sum in the end: " + sum);
    }
    public void iterate(){
        int number = 1;
        while (number < 11){
            System.out.println(number);
            number++;
        }
        System.out.println();
    }
    public void oneToAHundred(){
        int i = 1;
        while(i < 101){
            System.out.println(i);
            i++;
        }
    }
    public void AHundredToOne(){
        int i = 101;
        while(i > 1){
            System.out.println(i);
            i--;
        }
    }
    public void evenNumbers(){
        int i = 2;
        while(i < 101){
            System.out.println(i);
            i+=2;
        }
    }
    public void upTo(){
        System.out.println("Up to what number? ");

        int number = Integer.parseInt(reader.nextLine());
        int i = 0;
        while(i <= number){
            System.out.println(i);
            i++;
        }
    }
    public void limits() {
        System.out.println("First: ");
        int first = Integer.parseInt(reader.nextLine());
        System.out.println("Last: ");
        int second = Integer.parseInt(reader.nextLine());

        if(first < second) {
            while(first < second) {
                System.out.println(first);
                first++;
            }
        }   else if(first > second){
            while(first > second) {
                System.out.println(first);
                first--;
            }
        }
        System.out.println(first);
    }
    public void sumOfSet(){
        int sum = 0;
        System.out.println("Until what? ");
        int number = Integer.parseInt(reader.nextLine());

        int i = 0;
        while(i <= number){
            sum = sum + i;
            i ++;
        }
        System.out.println("Sum is " + sum);
    }
    public void sumBetweenTwo(){
        System.out.println("First: ");
        int first = Integer.parseInt(reader.nextLine());
        System.out.println("Last: ");
        int last = Integer.parseInt(reader.nextLine());

        int i = first;
        int sum = 0;
        while(i <= last){
            sum += i;
            i++;
            System.out.println("\n\nSum is currently" +sum);
        }
        System.out.println("The sum is " + sum);
    }
    public void factorial(){
        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        int i = 1;
        int factorial = i;
        while(i <= number){
            factorial *= i;
            i++;
        }
        System.out.println("Factorial is " + factorial);
    }
    public void sumOfPowers(){
        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        System.out.println("How much would like to power it by? ");
        int power = Integer.parseInt(reader.nextLine());
        int i = 0;
        double sop = 0;
        double sopMachine = 0;

        while (i <= power){
            sop = sop + Math.pow(number, i);
            i++;
        }
        System.out.println("The result is: " + sop);
        sopMachine =  Math.pow(number,power);
        System.out.println("\nThe result from the machine is: " + sopMachine);
    }
    public void readingNumbers(){
        int number = 0;

        while(number != -1){
            System.out.println("Type numbers: ");
            number = Integer.parseInt(reader.nextLine());
            System.out.println(number);
            if(number == -1){
                System.out.println("Thank you and see you later!");
            }
        }
    }
    public void sumOfNumbers(){
        int number = 0;
        int sum = 0;
        while(number != -1){
            System.out.println("Type numbers: ");
            number = Integer.parseInt(reader.nextLine());
            System.out.println(number);

            sum += number;

            if(number == -1){
                sum = sum + 1;
                System.out.println("Thank you and see you later!\nThe sum is " + sum);
            }
        }

    }
    public void sumAndCount(){
        int number = 0;
        int sum = 0;
        int numsEntered = 0;
        while(number != -1){
            System.out.println("Type number: ");
            number = Integer.parseInt(reader.nextLine());
            System.out.println(number);

            sum += number;
            numsEntered++;

            if(number == -1){
                sum = sum + 1;
                numsEntered = numsEntered -1;
                System.out.println("Thank you and see you later!\nThe sum is " + sum + "\nHow many numbers: " + numsEntered);
            }
        }
    }
    public void countTheAvg(){
        int number = 0;
        int sum = 0;
        int numsEntered = 0;
        double avg = 0;
        while(number != -1){
            System.out.println("Type number: ");
            number = Integer.parseInt(reader.nextLine());
            System.out.println(number);

            sum += number;
            numsEntered++;

            if(number == -1){
                double doubleSum = sum + 1;
                double doubleNumsEntered = numsEntered -1;
                avg = (doubleSum/doubleNumsEntered);
                System.out.println("\nThank you and see you later!\nThe sum is " + sum);
                System.out.println("How many numbers: " + numsEntered + "\nAverage: " + avg);
            }
        }
    }
    public void evenAndOdd(){
        int number = 0;
        int sum = 0;
        int numsEntered = 0;
        double avg = 0;
        double doubleNumber = 0;
        int even = 0;
        int odd = 0;
        while(number != -1){
            System.out.println("Type number: ");
            number = Integer.parseInt(reader.nextLine());
            System.out.println(number);

            sum += number;
            numsEntered++;

            if(number != -1) {
                if (number / 2 == 2) {
                        even++;
                } else if (Math.sqrt(Double.valueOf(number)) == 1){
                    even++;
                } else if (!(number / 2 == 2)) {
                    odd++;
                    System.out.println(Math.sqrt(4) + " g " + doubleNumber);
                }
            }
            if(number == -1){
                double doubleSum = sum + 1;
                double doubleNumsEntered = numsEntered -1;
                avg = (doubleSum/doubleNumsEntered);

                System.out.println("\nThank you and see you later!\nThe sum is " + sum);
                System.out.println("How many numbers: " + numsEntered + "\nAverage: " + avg);
                System.out.println("Even numbers: " + even);
                System.out.println("Odd numbers: " + odd);
            }
        }
    }
    public static void printStars(int amount){
        for (int i=0; i<amount; i++){

            System.out.print("*");
        }
        System.out.println("");
    }
    public static void printSquare(int sideSize){
        int i = 0;
        while(i <= sideSize) {
            for (int j = 0; j <= 4; j++) {
                System.out.print("*");
            }
            System.out.println("");
            i++;
        }
    }
    public static void printRectangle(int width, int height){
        int i = 0;
        int k = 0;
        while(i < height) {//The amount of times the line will be printed. The Height.
            for (int j = 0 ; j < width; j++) {

                System.out.print("*");
            }
            System.out.println("");
            i++;
            //k++;
        }
    }
    public static void printLeft(int size){
        int i = 0;
        String star = "*";
        int length = 1;
        while(i < size){
            for(int j = 0; j < length; j++) {
                System.out.print(star);
            }
            length ++;
            System.out.println(" ");
            i++;
        }
    }
    public static void printRight(int size){
        int i = 0;
        String star = "*";
        String s = " ";
        int length = 5;
        while(i < size){
            for(int j = 0; j < length; j++) {
                System.out.print(" ");
            }
            s = s + star;
            System.out.println(s);
            length --;
            i++;
        }
    }
    public static void printChristmasTree(int size){
        int i = 0;
        String star = "*";
        String s = " ";
        int length = 3;
        while(i < size){
            for(int j = 0; j < length; j++) {
                for(int l = 0; l < length; l++){
                System.out.print(" ");
            }}
            s = s + star;
            System.out.println(s);
            length --;
            i++;
        }
    }
}
