package day30_array;

public class GradeBookMy {
    public static void main(String[] args) {
        /*
        Example:
        Names = [“Mike”, “Joe”, “Ana”, “Ali”, “Joanna”]
        Scores = [80, 54, 100, 66, 94]
        Grades= [‘B’, ‘D’, ‘A’, ‘C’, ‘A’] -> Need to find and store these based on score
        Output:
        Mike | 80 | B
        Joe | 54 | D
        Ana | 100 | A
        Ali | 66 | C
        Joanna | 94 | A
         */

        String [] names = {"MiKe", " Joe", "Anna", "Ali", "Joanna"};
        int [] scores = {80, 54, 100, 66, 94};
        char [] grades = {'B', 'D', 'A', 'C', 'A'} ;


        for (int i = 0; i < names.length; i++){
            System.out.println(names[i] + " | " + scores[i] + " | " + grades[i]);
        }





    }
}
