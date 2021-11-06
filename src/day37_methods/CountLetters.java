package day37_methods;

public class CountLetters {
    /*
    String, letter
    how many times is the letter in the String
    example:
    apple. p
    -> 2
    return type: int
    method name: FrequencyOfLetter
    parameters: String, char
     */
    public static void main(String[] args) {
        System.out.println(frequencyOfLetter("apple", 'p'));
        System.out.println(frequencyOfLetter("anagram", 'a'));

    }


    public static int frequencyOfLetter(String word, char letter) {
        int counter = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                counter++;
            }

        }
        return counter;
    }



    public static String getDuplicateCharacters(String str){ // java

        String allDuplicats = "";

        for (int i = 0; i < str.length(); i++){

            int count = frequencyOfLetter(str,str.charAt(i));
            if (count > 1){
                allDuplicats += str.charAt(i);

            }

        }
        return allDuplicats;
    }
}