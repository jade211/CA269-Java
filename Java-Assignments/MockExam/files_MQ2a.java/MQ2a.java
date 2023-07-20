class Individual {
    public String name;

    // CONSTRUCTORS
    /**
     * @param takes in nothing (default constructor)
     * @return returns nothing - initialises name.
     */
    Individual(String name) {
        setName(name);
    }


    // GETTERS AND SETTERS
    public void setName(String name) { this.name = name; }
    public String getName() { return this.name; }



    /**
     * @param toString method takes in nothing
     * @return Returns output formatted as specified.
     */
    public String toString() {
        return name;
    }
}

class Person extends Individual {
    protected String nickname;

    // CONSTRUCTORS
    Person(String name, String nickname) {
        super(name); // Inherits name from extended class Individual
        setNickname(nickname);
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() { return this.nickname; }



    /**
     * @param toString method takes in nothing
     * @return Returns output formatted as specified.
     */
    public String toString() {
        return super.getName() + " (" + getNickname() + ")";
    }
}

// Contains sample input
public class MQ2a {
    public static void main(String[] args) {
        // Individual input1 = new Individual("Jade");
        Person input2 = new Person("Jade", "jadeygyal");
        System.out.println(input2); 
    }
}




// class Individual {
//     public String name;
//     Individual(String name) { this.name = name; }
//     public String toString() { return this.name; }
// }

// class Person extends Individual {
//     protected String nickname;
//     Person(String name, String nickname) {
//         super(name);
//         this.nickname = nickname;
//     }
//     public String toString() {
//         return super.toString() + " (" + this.nickname + ")";
//     }
// }

