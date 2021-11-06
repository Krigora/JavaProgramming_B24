package day30_array;

public class GradeBook {

    public static void main(String[] args) {

        /*
        student array -> names of students
        grades value (doble) -> grades of students

        [ james bond,]
        [ 80,
         */
        String [] studentNames = {"James Bond", " Jamie Fox", "Luka Smith"};
        double [] studentGrades = {90, 80.5, 100};

        for (int i = 0; i < studentGrades.length; i++){
            System.out.println(studentNames[i] + " -> " + studentGrades[i]);
        }

    }

}
