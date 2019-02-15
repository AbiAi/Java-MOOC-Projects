import java.util.ArrayList;
import java.util.Scanner;
import java.util.Scanner.*;
public class Playlist {
    static Scanner reader = new Scanner(System.in);
    static ArrayList<String> trackInputQuestions = new ArrayList<>(); //Array of questions to ask user for use input.
    static ArrayList<String> trackNames = new ArrayList<>();
    static ArrayList<String> trackArtists = new ArrayList<>();
    static ArrayList<String> trackAlbums = new ArrayList<>();
    static String name;
    static String artist;
    static String album;
    public static void main(String[] args){
        trackInputQuestions.add(0,"Track Name: ");
        trackInputQuestions.add(1,"Track Artist: ");
        trackInputQuestions.add(2,"Track Album: ");
        System.out.println("Enter track details: \n");
        enterDetails(trackInputQuestions);
        System.out.println("Track deets: " + trackDetails(trackNames,trackArtists,trackAlbums,0));

    }
    public static void enterDetails(ArrayList<String> list){
        String entry = "";
        while(true) {
            for (String str : list) {
                System.out.println(str);
                entry = reader.nextLine();

                folder(entry);

            } break;
        }
    }
    public static void folder(String trackAttribute){
        trackAttribute = trackAttribute.toLowerCase();

        if(trackAttribute.contains("name")){
            trackNames.add(trackAttribute);
        }   else if (trackAttribute.contains("artist")){
            trackArtists.add(trackAttribute);
        }   else if (trackAttribute.contains("album")){
            trackAlbums.add(trackAttribute);
        }
    }
    public static String trackDetails(ArrayList<String> names, ArrayList<String> artists, ArrayList<String> albums, int trackNo){
        String trackDetails = names.get(0) +" "+ artists.get(0) +" "+ albums.get(0);
        return trackDetails;
    }
}
