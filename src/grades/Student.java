package grades;

import java.util.ArrayList;


//1. Create class named Student(class is a template/blueprint).
public class Student {

    //It should have private properties for student's name and grades.
    private String name;
    //The grades property should be an ArrayList of Integers.
    private ArrayList<Integer> grades;


    /* The student class should have a constructor that sets name property, and initializes
    grades property as an empty ArrayList.*/
    public Student(String name, ArrayList<Integer> grades) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName() {
        return name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }

    // returns the average of the students grades. Kudos to David, Evan, and Irvin for the loop.
    public double getGradeAverage() {
        int total = 0;

        for(int x = 0; x < grades.size(); x++){     //.size returns the number of elements in the array
            int grade = grades.get(x);              //.get return the element at the specified index
            total += grade;
        }
        return (total/grades.size());
    }

    /* Test your Student class by adding a main method and creating Student objects. Verify that you can
    add grades to each object, and that your getGradeAverage method correctly returns the average of the
    student's grades. */
    public static void main(String[] args) {
        Student student = new Student("Benjamin", new ArrayList<>());
        System.out.println(student.getName());

        student.addGrade(90);
        student.addGrade(80);
        student.addGrade(70);

        System.out.println(student.grades);
        System.out.println("Grade Average: " + student.getGradeAverage());
    }

}