package Day04_Variables;

public class School {
    public static void main(String[] args) {

        int totalNumberOfStudents;

        short numberOfStudentsIn1stGrade = 10;
        short numberOfStudentsIn2ndGrade = 20;
        short numberOfStudentsIn3rdGrade = 14;
        short numberOfStudentsIn4thGrade = 41;
        short numberOfStudentsIn5thGrade = 51;

        totalNumberOfStudents = numberOfStudentsIn1stGrade + numberOfStudentsIn2ndGrade + numberOfStudentsIn5thGrade + numberOfStudentsIn4thGrade + numberOfStudentsIn3rdGrade;

        System.out.println(" In total there is " + totalNumberOfStudents + " students total");

        double numberOfSchoolDays = 100.5;
        double avgDradeInShool = 81.6;

        System.out.println(avgDradeInShool + "%");

//        float avgSnowDayInYear = 30.4;
        float avgSnowDayInYear = 30.4F;

    }
}
