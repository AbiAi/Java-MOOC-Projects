import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Scanner.*;
import java.util.Collections;
public class Week3 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Type a word: ");
        String text = reader.nextLine();

        if (palindrome(text) == true){
            System.out.println(text + " is a palindrome");
        }   else {
            System.out.println(text + " is not a palindrome");
        }

    }
    public static int alwaysReturn10(){
        return 10;
    }
    public static String returnString(String a, String b){
        return a + b;
    }
    public static int sum(int a, int b){
        return a + b;
    }
    public static void Total(){
        System.out.println("Type the first number: ");
        int first = Integer.parseInt(reader.nextLine());
        System.out.println("Type the second number: ");
        int second = Integer.parseInt(reader.nextLine());
        System.out.println("Type the third number: ");
        int third = Integer.parseInt(reader.nextLine());
        System.out.println("Type the fourth number: ");
        int fourth = Integer.parseInt(reader.nextLine());
        System.out.println("Total: " + sum(sum(first,second),sum(third,fourth)));
    }
    public static int sum2(int number1, int number2, int number3, int number4){
        return number1 + number2 + number3 + number4;
    }
    public static int least(int number1, int number2){
        int least = 0;
        if (number1 < number2){
            least = number1;
        } else if (number1 > number2){
            least = number2;
        }
        return least;
    }
    public static int greatest(int num1, int num2, int num3){
        int greatest = 0;

        if (num1 > num2 && num1 > num3){
            greatest = num1;
        }   else if (num2 > num1 && num2 > num3){
            greatest = num2;
        }   else if (num3 > num1 && num3 > num2){
            greatest = num3;
        }
        return greatest;
    }
    public static double average(int num1, int num2, int num3, int num4){
        double int1 = (double) num1;
        double int2 = (double) num2;
        double int3 = (double) num3;
        double int4 = (double) num4;

        return (int1 + int2 + int3 + int4)/4;
    }
    public static int lengthOfName(){
        int length = 0;

        System.out.println("Type your name: ");
        String name = reader.nextLine();

        length = name.length();
        return length;
    }
    public static String firstChar(){
        String first = "";

        System.out.println("Type your name: ");
        String name = reader.nextLine();

        first = String.valueOf(name.charAt(0));
        return first;
    }
    public static char lastChar(String text){
        System.out.println("Type your name: ");

        char lastChar = text.charAt(text.length()-1);

        return lastChar;
    }
    public static void separateChars(){
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        int j = 1;
        char c = '\0';
        if (name.length() > 2){
            for (int i = 0; i < name.length(); i++){
                System.out.println(j + ". character: " + name.charAt(i));
                j++;
            }
        }
    }
    public static void reverseName(){
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        int j = 0;
        String s = "";
        for(int i = name.length(); i > 0; i--){
            String str = String.valueOf(name.charAt(i-1));
             s = s + str;
        }
        System.out.println(s);
    }
    public static void printWords(){
        ArrayList<String> words = new ArrayList<>();
        while(true) {
            System.out.println("Type a word: ");
            String word = reader.nextLine();

            words.add(word);

            boolean empty = word.isEmpty();
            if(empty){
                System.out.println("You typed the following words: ");
                for (String str : words){
                    System.out.println(str);
                }  break;
            }
        }
    }
    public static void recurring(){
        ArrayList<String> words = new ArrayList<>();
        while(true){
            System.out.println("Type a word: ");
            String word = reader.nextLine();

            int i = 0;
            for (String str : words) {
                if (words.contains(word)){
                    i++;
                }
            }

            if (!words.contains(word)){
                words.add(word);
            }

            if (i == 2){
                System.out.println("You gave the word " + word + " twice"); break;
            }


        }
    }
    public static void reverse(){
        ArrayList<String> words = new ArrayList<>();
        while(true) {
            System.out.println("Type a word: ");
            String word = reader.nextLine();

            words.add(word);


            if(word.isEmpty()){
                Collections.reverse(words);
                for (String str : words) {
                    System.out.println(str);
                }
            }
        }
    }
    public static void order(){
        ArrayList<String> words = new ArrayList<>();
        while(true) {
            System.out.println("Type a word: ");
            String word = reader.nextLine();

            words.add(word);

            if(word.isEmpty()){
                Collections.sort(words);
                for (String str : words) {
                    System.out.println(str);
                }
            }
        }
    }
    public static void firstPart(){
        String result = "";
        System.out.println("Type a word: ");
        String word = reader.nextLine();
        System.out.println("Length of the first part: ");
        int length = Integer.parseInt(reader.nextLine());

        result = word.substring(0,length);

        System.out.println("Result: " +result);
    }
    public static void endPart(){
        String result = "";
        System.out.println("Type a word: ");
        String word = reader.nextLine();
        System.out.println("Length of the end part: ");
        int length = Integer.parseInt(reader.nextLine());

        result = word.substring(length - 1);

        System.out.println("Result: " +result);

    }
    public static void wordInside(){
        System.out.println("Type the first word: ");
        String word1 = reader.nextLine();
        System.out.println("Type the second word: ");
        String word2 = reader.nextLine();

        boolean isInside = word1.contains(word2);

        if(isInside){
            System.out.println("The word '" + word2 + "' is found in the word '" + word1 + "'");
        }   else if(!isInside){
            System.out.println("The word '" + word2 + "' is not found in the word '" + word1 + "'");
        }
    }
    public static String reversingText(String text){
        ArrayList<String> letters = new ArrayList<>();
        
        for (int i = text.length(); i > 0; i--){
            letters.add(String.valueOf(text.charAt(i-1)));
        }

        text = "";

        for (int i = 0; i < letters.size(); i++) {
            String s = letters.get(i);

            text = text + s;
        }

        return text;
    }
    public static int amount(ArrayList<String> list){
        int count = list.size();

        return count;
    }
    public static void removeLast(ArrayList<String> brothers){
        brothers.remove(brothers.size()-1);
    }
    public static int sum(ArrayList<Integer> list){
        int sum = 0;

        for (Integer num : list) {
            sum = sum + num;
        }

        return sum;
    }
    public static double avg(ArrayList<Double> list){
        double sum = 0;
        double avg = 0;

        for (Double num : list) {
            sum = sum + num;
        }   avg = sum/list.size();

        return avg;
    }
    /**public static ArrayList<Integer> list(int int1, int int2, int int3){
        ArrayList<Integer> listArray = new ArrayList<Integer>();

        listArray.add(int1);
        listArray.add(int2);
        listArray.add(int3);

        return listArray;
    }*/
    public static ArrayList<Integer> lengths(ArrayList<String> list){
        ArrayList<Integer> lengths = new ArrayList<Integer>();

        for (int i = 0; i < list.size(); i++){
            lengths.add(list.get(i).length());
        }
        return lengths;
    }
    public static int theGreatest(ArrayList<Integer> numbers){
        Collections.sort(numbers);

        int greatest = numbers.get(numbers.size()-1);


        return greatest;
    }
    public static double variance(ArrayList<Integer> list){
        double sum = 0;
        double mean = 0;
        double sqrdDifference = 0;
        double variance = 0;

        for (Integer num : list) {
            double d = (double) num;

            sum = sum + d; //sum of all elements
        }

        for (Integer num : list){//step 2: for each number, subtract mean + square result
            sqrdDifference = (num - mean) * (num - mean);
            variance = variance + sqrdDifference;
            System.out.println("test " + variance);
        }
        variance = variance/(list.size()-1);//step 3: avg result.

        return variance;
    }
    public static boolean moreThanOnce(ArrayList<Integer> list, int number){
        boolean occursMultiple = true;
        int count = 0;

        for (Integer num : list) {
            if (num == number){
                 count++;
            }
        }
        if (count >= 2){
            occursMultiple = true;
        }   else {
            occursMultiple = false;
        }

        return occursMultiple;
    }
    public static boolean palindrome(String text){
        boolean isPalindrome;

        if(text.equals(reversingText(text))){
        isPalindrome = true;
        } else {
            isPalindrome = false;
        }

        return isPalindrome;
    }

}

