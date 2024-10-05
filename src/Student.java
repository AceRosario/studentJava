public class Student {
    private int ID;
    private String name;
    private double[] grades;

    public Student(int ID, String name, double[] grades) {
        this.ID = ID;
        this.name = name;
        this.grades = grades.clone();
    }

    public String findGrade() {
        String gradeString;
        double sum = 0;

        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }

        double average = sum / grades.length;

        if (average >= 90.0) {
            gradeString = "A";
        } else if (average >= 80.0) {
            gradeString = "B";
        } else if (average >= 70.0) {
            gradeString = "C";
        } else if (average >= 60.0) {
            gradeString = "D";
        } else {
            gradeString = "F";
        }

        return gradeString;
    }
}
