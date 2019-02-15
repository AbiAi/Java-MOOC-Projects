import java.util.ArrayList;
import java.util.Collections;

public class Anagram {
    public static void main(String[] args){
        System.out.println("Do these two make an anagram?" + isAnagram("cheat","teach"));
    }
    public static boolean isAnagram(String str1, String str2){
        boolean isAnagram = true;
        String str3 = "";
        String str4 = "";
        ArrayList<String> letters1 = new ArrayList<>();
        ArrayList<String> letters2 = new ArrayList<>();

        char[] c = str1.toCharArray();
        System.out.println(c);
        System.out.println("\n\n");
        for(int i = 0; i < str1.length(); i++){
            letters1.add(String.valueOf(str1.charAt(i)));
        }
        for(int j = 0; j < str2.length(); j++){
            letters2.add(String.valueOf(str1.charAt(j)));
        }

        Collections.sort(letters1); Collections.sort(letters2);

        for (String string : letters1) {
            str3 = str3 + string;
        } System.out.println(str3);

        for (String string : letters2) {
            str4 = str4 + string;
        } System.out.println(str4);

        if(str3.equals(str4)){
            isAnagram = true;
        } else {
            isAnagram = false;
        }
        return isAnagram;
    }
}
