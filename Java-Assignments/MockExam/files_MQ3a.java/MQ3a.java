import java.util.List;
import java.util.ArrayList; // Need both to make a list

class Student {
    private int marks;
    public int getMarks() { return this.marks; }
    public void setMarks(int marks) { this.marks = marks; }
}

class Classroom {
    List<Student> students = new ArrayList<Student>();

    void addStudent(Student student) {
        this.students.add(student);
    }

    // StringBuilder result = new StringBuilder();
    // result.append();
    List<Student> getGradedStudents(int marks) { // This function** returns a list of the graded students
        List<Student> gradedStudents = new ArrayList<>(this.students); // This initailised the list made to carry the graded student and initially adds a copy of the students list there to begin.
        for(Student student: gradedStudents) {
            if(student.getMarks() < 40) {
                gradedStudents.remove(student); // If they failed - removes them.
            }
        }
        return gradedStudents;
    }

    double getAverageMarks() {
        int total = 0;
        for(Student student: this.students) { 
            total += student.getMarks(); 
        }
        return total / this.students.size();
    }

    boolean hasStudent(Student student) {
        return this.students.contains(student);
    }
}



public class MQ3a {
    public static void main(String[] args) {
        // create student objects
        Student s1 = new Student();
        s1.setMarks(80);
        Student s2 = new Student();
        s2.setMarks(30);
        Student s3 = new Student();
        s3.setMarks(60);

        // create classroom object
        Classroom c = new Classroom();

        // add students to classroom
        c.addStudent(s1);
        c.addStudent(s2);
        c.addStudent(s3);

        // get graded students
        List<Student> gradedStudents = c.getGradedStudents(40);
        System.out.println("Graded students: " + gradedStudents);
        
        // get average marks
        double avgMarks = c.getAverageMarks();
        System.out.println("Average marks: " + avgMarks);

        // check if a student is present
        boolean hasStudent = c.hasStudent(s1);
        System.out.println("Student present: " + hasStudent);
    }
}
