import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter amount of students");
        int amountOfStudents = Integer.parseInt(input);
        //array reference
        // create an object array, apply size of array into new array
        Student[] n = new Student[amountOfStudents];

        for (int i = 0;i <  n.length; i++){
            input=JOptionPane.showInputDialog("Enter student data separated by commas.");

        }



    }
}