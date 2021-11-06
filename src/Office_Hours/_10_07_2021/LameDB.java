package Office_Hours._10_07_2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LameDB {

    /*
    A database (DB) is an organized collection of data. In other words, a database is used by an organization as a method of storing, managing and retrieving information.

Implement the lameDb() method

This method has 4 String parameters and returns a String

db: information in database. Each item is separated by a #. Each element will also have a number in the beginning about which element it is.
op: action that will be taken on database (add, edit, or remove)
id: The id number that will be manipulated
data: extra data that will be used alongside operation
The method returns the modifed database

     */


    public static String lameDb(String db, String op, String id, String data) {
/*
          m.lameDb("1etsy#2wooden#3spoon","add","4","aaa")
               returns:  1etsy#2wooden#3spoon#4aaa

               m.lameDb("1etsy#2wooden#3spoon","add","1","bbb")

               returns:  1bbb#2etsy#3wooden#4spoon
 */

        ArrayList<String> list = new ArrayList<>(Arrays.asList(db.split("#")));

        // take the db String and convert it to a String array that is used in the Array.asList method to give us ArrayList

        // "1etsy#2wooden#3spoon" -> [1etsy, 2wooden, 3spoon]
        int idNum = Integer.parseInt(id); // convert the id String to a int type

        switch (op) {

            case "add":

                if (idNum > list.size()){
                    list.add(id + data);
                } else {
                    list.add(idNum - 1, id + data);
                    for (int i = 0; i < list.size(); i++){
                        String each = (i + 1) + list.get(i).substring(1);
                        list.set(i, each);


                    }
                }


                break;
            case "edit":
                list.set(idNum - 1, id + data);
                break;
            case "delete":
                list.remove(idNum - 1);
        }
// the idNum - 1 is how we convert the id number from the method parms, to the index number we can use with ArrayList

/*

 */
String result = list.toString();
return result.substring(1, result.length()-1).replace(", ", "#");


    }//end lameDb

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //System.out.println(lameDb(in.next(), in.next(), in.next(), in.next()));
        System.out.println(lameDb("1tst#2bla#3foo", "delete", "1", ""));
        System.out.println(lameDb("1tst#2bla#3foo", "delete", "2", ""));
        System.out.println(lameDb("1tst#2bla#3foo", "delete", "3", ""));


        System.out.println(lameDb("1test#2bla#3foo","edit","2","bbb"));
        System.out.println(lameDb("1test#2bla#3foo","edit","1","case"));

        System.out.println(lameDb("1etsy#2wooden#3spoon","add","4","aaa"));


    }
}