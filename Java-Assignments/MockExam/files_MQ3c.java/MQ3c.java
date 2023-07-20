import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

enum Grade { GradeFail, GradePass, GradeDistinction; }

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

    Map<Grade,Integer> gradedStudents;
    void calculateGradedStatistics() {
        // create counters for categories
        int countGradeFail = 0;
        int countGradePass = 0;
        int countGradeDistinction = 0;
        // iterate through students, and increment the counts
        for(Student student: this.students) {
            if (student.getMarks() < 40) { countGradeFail += 1; }
            else if (student.getMarks() < 75) { countGradePass += 1; }
            else { countGradeDistinction += 1; }
        }
        // ensure map is not null and is empty
        if (gradedStudents == null) {
            gradedStudents = new HashMap<Grade,Integer>();
        } else {
            gradedStudents.clear();
        }
        // populate the map with counters
        gradedStudents.put(Grade.GradeFail, countGradeFail);
        gradedStudents.put(Grade.GradePass, countGradePass);
        gradedStudents.put(Grade.GradeDistinction, countGradeDistinction);
    }

    void addStudent(Student student) {
        this.students.add(student);
    }

    Queue<Student> getGradedStudents(int marks) {
        List<Student> gradedStudents = new ArrayList<>(this.students);
        // first remove the students with marks below 40
        for(Student student: gradedStudents) {
            if(student.getMarks() < 40) {
                gradedStudents.remove(student);
            }
        }
        // next sort the list
        Collections.sort(gradedStudents);
        // finally put the elements in to a Queue
        Queue<Student> orderedGradedStudents = new LinkedList<Student>();
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







public class MQ3c {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setMarks(80);
        Student s2 = new Student();
        s2.setMarks(30);
        Student s3 = new Student();
        s3.setMarks(60);
        Student s4 = new Student();
        s4.setMarks(30);
        // Student s5 = new Student();
        // s5.setMarks(60);
    
        Classroom c = new Classroom();
        c.addStudent(s1);
        c.addStudent(s2);
        c.addStudent(s3);
        // c.addStudent(s4);
        // c.addStudent(s5);
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



        c.calculateGradedStatistics();
        for (Map.Entry<Grade,Integer> entry : c.gradedStudents.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        
    }
}
    