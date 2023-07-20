import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Collections;

class Student implements Comparable<Student> {
    private int marks;
    public int getMarks() { return this.marks; }
    public void setMarks(int marks) { this.marks = marks; }

    public int compareTo(Student student) {
        return Integer.compare(this.getMarks(), student.getMarks());
    }
}

class Classroom {
    List<Student> students = new ArrayList<Student>();

    void addStudent(Student student) {
        this.students.add(student);
    }

    Queue<Student> getGradedStudents(int marks) {  // This function** returns a queue of the graded students
        List<Student> gradedStudents = new ArrayList<>(this.students); // This initailised the list made to carry the graded student and initially adds a copy of the students list there to begin.
        // first remove the students with marks below 40
        for(Student student: gradedStudents) { // Iterates over the gradedStudents list
            if(student.getMarks() < 40) {
                gradedStudents.remove(student);
            }
        }
        // next sort the list
        Collections.sort(gradedStudents); // Sorts list using the natural order defined in the compareTo() method
        
        // finally put the elements in to a Queue
        Queue<Student> orderedGradedStudents = new LinkedList<Student>(); // Creating a new LinkedList orderedGradedStudents that will hold the sorted gradedStudents list as a Queue
        for(Student student: gradedStudents) {
            orderedGradedStudents.add(student);
        }
        return orderedGradedStudents;
    }

    double getAverageMarks() {
        int total = 0;
        for(Student student: this.students) { total += student.getMarks(); }
        return total / this.students.size();
    }

    boolean hasStudent(Student student) {
        return this.students.contains(student);
    }
}


public class MQ3b {
// The following tests are associated with this question:

// Check comparable method definition (+1 marks)

// Check comparable implementation is correct (+3 marks)

// Check graduating students definition (+2 marks)

// Check graduating students is correct (+2 marks)

// Check graduating students uses list sorting (+2 marks)
    

    
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setMarks(80);
        Student s2 = new Student();
        s2.setMarks(30);
        Student s3 = new Student();
        s3.setMarks(60);

        Classroom c = new Classroom();
        c.addStudent(s1);
        c.addStudent(s2);
        c.addStudent(s3);
        Queue<Student> gradedStudents = c.getGradedStudents(70);
        System.out.println("Graded students: " + gradedStudents);

        double avgMarks = c.getAverageMarks();
        System.out.println("Average marks: " + avgMarks);

        boolean hasStudent = c.hasStudent(s1);
        System.out.println("Student present: " + hasStudent);

        int Result = s1.compareTo(s2);
        if(Result == 1) {
            System.out.println("Student 1 scored higher than Student 2");
        } else {
            System.out.println("Student 2 scored higher than Student 1");
        }
    
    
    }
}

