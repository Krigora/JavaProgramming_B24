package day5_Variables;

import java.sql.SQLOutput;

public class Movie {
    /*
    - Each the datatype you feel is most appropriate for each variable.- Create the following variables:
    name, genre, duration, release date, rating(G, PG, R, etc..), is a sequels or not, rotten tomatoes rating (out of 100), is on dvd.
     */

    public static void main(String[] args) {

        String name = "SDET";
        String range = "Instructive";
        short duration = 28;
        short releaseMonth = 7;
        short releaseDay = 25;
        short releaseYear = 2021;
        char rating = 'R';
        boolean isASequelsOrNot = true;
        short rottenTomatoesRating = 50;
        boolean isOnDvd = false;

        //   int releaseData  = releasemonth + releaseDay + releaseYear ;

        System.out.println("This is a new " + range + " movie " + name);
        System.out.println("release data: " + releaseMonth + "/" + releaseDay + "/" + releaseYear );
        System.out.println("Duration: " + duration + " weeks," + " rating type: " + rating + "," + " rotten tomatoes rating: " + rottenTomatoesRating );
        System.out.println("Seque: " + isASequelsOrNot + "," + " Release on disks: " + isOnDvd );

        System.out.println();

        System.out.println("------ Welcome to the Cinema ------ ");
//        Tonight we are streaming "$movieName" which was released on $releaseDate
//        This $genre movie got a $rottenTomatoesRating rating on Rotten Tomatoes.
//        The rating is $rating and it runs for $duration hours.
//        This is a sequel $isSequel and is on dvd $isOnDvd.
        String info = " Tonight we are streaming " + name + (" which was released on "  +  releaseMonth + "/" +  + releaseDay + "/" +  releaseYear) + " . " + "\n" + " This " + range + " movie got a " + rottenTomatoesRating + " on " + rottenTomatoesRating + " . " + "\n" + " The rating is" + rating + " and it runs for " + duration + " weeks." + "\n" +  " This is a sequel " + isASequelsOrNot + " and is on dvd " + isASequelsOrNot + " . " ;
        System.out.println(info);









    }
}
