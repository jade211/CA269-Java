class Q1a {
    String title;
    int number;
    int marks;


    // CONSTRUCTORS //
    /**
     * @param class Q1a will take a String (title) and two ints (number and marks)
     * @return class returns nothing
     */
    Q1a(String title, int number, int marks) {
        this.title = title;        // title initialised
        this.number = number;      // number initialised
        this.marks = marks;        // marks initialised
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
public class MQ1a {
    public static void main(String[] args) {
        Q1a input1 = new Q1a("Strings Question", 1, 35);
        System.out.println(input1);
    }
}
