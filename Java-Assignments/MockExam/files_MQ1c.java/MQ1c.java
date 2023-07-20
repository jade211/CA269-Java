class Q1c {
    private String title;
    int number;
    private int marks;
    private static int MQUESTION_COUNT = 0; // static - Belongs to class. Does not get changed by instances, shared by all instances.

    // CONSTRUCTORS //
    /**
     * @param takes in nothing (default constructor)
     * @return returns nothin - initialises title to "untitled" and marks and number to 0
     */

    Q1c() {
        this.title = "untitled";
        this.number = 0;
        this.marks = 0;
        // this.MQUESTION_COUNT = this.MQUESTION_COUNT + 1;
        Q1c.MQUESTION_COUNT +=1;
     }

    /**
     * @param takes in the title and the marks
     * @return returns nothing - initialises title and marks.
     */

    Q1c(String title, int marks) {
        // this(); - Runs empty constructor to increment it 
        this.title = title;
        this.MQUESTION_COUNT = this.MQUESTION_COUNT + 1;
        this.number = this.MQUESTION_COUNT;
        this.marks = marks;
     }





    /**
     * @param class Q1c will take a String (title) and two ints (number and marks)
     * @return class returns nothing
    */
    Q1c(String title, int number, int marks) {
        setTitle(title);        // title initialised
        setNumber(number);      // numeber initialised
        setMarks(marks);        // marks initialised
        this.MQUESTION_COUNT = this.MQUESTION_COUNT + 1;
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
        return getNumber() + " " + getTitle() + " " + "(" + marks + " " + "marks" + ")"; // + " " + "question counter" + ": " + MQUESTION_COUNT;
    }
}







// Contains sample input
public class MQ1c {
    public static void main(String[] args) {
        Q1c input1 = new Q1c("Question 1 - Strings", 1, 35);
        System.out.println(input1); 
        Q1c input2 = new Q1c();
        System.out.println(input2); 
        Q1c input3 = new Q1c("Question 6 - Strings", 6, -100);
        System.out.println(input3); 
        Q1c input4 = new Q1c("Question 28 - Strings", 28, 35);
        System.out.println(input4);

        // One where question number isnt supplied (automatically assigns it - in this case 4 have been
        // asked already so this will be the 5th question)
        Q1c input5 = new Q1c("Question 5 - Strings", 56);
        System.out.println(input5); 
    }
}
