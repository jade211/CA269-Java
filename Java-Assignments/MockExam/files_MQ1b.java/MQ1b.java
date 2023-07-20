class Q1b {
    private String title;
    int number;
    private int marks;

    // CONSTRUCTORS //
    /**
     * @param takes in nothing (default constructor)
     * @return returns nothin - initialises title to "untitled" and marks and number to 0
     */

     Q1b() {
        this.title = "untitled";
        this.number = 0;
        this.marks = 0;
     }


    /**
     * @param class Q1b will take a String (title) and two ints (number and marks)
     * @return class returns nothing
    */
    Q1b(String title, int number, int marks) {
        setTitle(title);        // title initialised
        setNumber(number);      // numeber initialised
        setMarks(marks);        // marks initialised
    }


    // GETTERS AND SETTERS

    public void setTitle(String title) {
        this.title = title;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setMarks(int marks) {
        if(marks >= 0) {
            this.marks = marks;
        } else {
            this.marks = 0;
        }
    }

    public String getTitle() {
        return this.title;
    }

    public int getNumber() {
        return this.number;
    }

    public int getMarks() {
        return this.marks;
    }








    /**
     * @param toString method takes in nothing
     * @return Returns output formatted as specified.
     */
    public String toString() {
        return number + " " + title + " " + "(" + marks + " " + "marks" + ")";
    }
}







// Contains sample input
public class MQ1b {
    public static void main(String[] args) {
        Q1b input1 = new Q1b("Question 1 - Strings", 1, 35);
        System.out.println(input1); 
        Q1b input2 = new Q1b("Question 2 - Strings2", 2, -100);
        System.out.println(input2); 
    }
}
