package day40_arraylist;

import java.util.ArrayList;

public class Classroom {
    public static void main(String[] args) {
        ArrayList<String> groupOne = new ArrayList<>();
        System.out.println(groupOne);
        System.out.println(groupOne.size()); // How many elements is there

        groupOne.add("Vinder");
        groupOne.add("james Bond");
        groupOne.add("Tacb");
        groupOne.add("Ihor");
        System.out.println(groupOne);

        System.out.println("first elements: " + groupOne.get(0));
        System.out.println("Second elements: " + groupOne.get(1));
        System.out.println("Third elements: " + groupOne.get(2));
        System.out.println("Fourth elements: " + groupOne.get(3));
        System.out.println("first elements: " + groupOne.size());

        System.out.println("first elements, first char: " + groupOne.get(0).charAt(0));

        System.out.println();

// capacity example
        ArrayList<String> groupTwo = new ArrayList<>(20);
        System.out.println(groupTwo.size());

        System.out.println();

ArrayList<String> groupThree = new ArrayList<>();
groupThree.add("Nisso");
groupThree.add( "Omer");
groupThree.add(2, "Kamila");
groupThree.add(1, "Bogdan");
groupThree.add(2, "Olena");


        System.out.println(groupThree);



    }
}
