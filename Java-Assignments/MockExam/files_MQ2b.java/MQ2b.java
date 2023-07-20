interface FamilyMember extends PersonalDetails {
    String getNickname();
    void setNickname(String name);
}

interface PersonalDetails {
    String getName();
    int getAge();
}


class Individual {
    public String name;

    // CONSTRUCTORS
    /**
     * @param String name
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




class Person extends Individual implements FamilyMember{
    protected String nickname;
    private int age;

    // CONSTRUCTORS
    /**
     * @param String name, String nickname.
     * @return returns nothing - initialises name, nickname.
     */
    Person(String name, String nickname) {
        super(name); // Inherits name from extended class Individual
        setNickname(nickname);
    }


    // Constructor for sample input with age.
    /**
     * @param String name, String nickname, int age
     * @return returns nothing - initialises name, nickname, age.
     */
    Person(String name, String nickname, int age) {
        super(name); // Inherits name from extended class Individual
        setNickname(nickname);
        setAge(age);
    }



    // GETTERS AND SETTERS
    /**
     * @param String
     * @return Returns nothing
     */
    public void setNickname(String nickname) {this.nickname = nickname;}

    /**
     * @param int
     * @return Returns nothing
     */
    public void setAge(int age) {this.age = age;}

    /**
     * @param Nothing
     * @return Returns String name
     */
    public String getNickname() { return this.nickname; }
    
    /**
     * @param Nothing
     * @return Returns int age
     */
    public int getAge() {return this.age;}

    





    /**
     * @param toString method takes in nothing
     * @return Returns output formatted as specified.
     */
    public String toString() {
        return super.getName() + " (" + getNickname() + ")";
    }
}

// Contains sample input
public class MQ2b {
    public static void main(String[] args) {
        // Individual input1 = new Individual("Jade");
        // Person input2 = new Person("Jade", "jadeygyal", 21);
        Person input2 = new Person("Jade", "jadeygyal");
        System.out.println(input2); 
    }
}
