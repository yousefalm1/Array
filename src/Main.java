import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int [] temperatures = {12, 43, 23, 42, 12};

        temperatures[2] = 0;
//
//        for (int temp : temperatures) {
//            System.out.println(temp);
//
//        }




        ArrayList<String> songs = new ArrayList<>();

        songs.add("ABC");
        songs.add("I love you");
        songs.add("Happy Birthday");
        songs.add("Twinkle Twinkle");
        songs.add("Etse betse(spider)");


        songs.remove("Happy Birthday");

        for (String song : songs)  {
            System.out.println(song);
        }















    }
}
