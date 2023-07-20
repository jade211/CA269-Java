interface FamilyMember extends PersonalDetails {
    String getNickname();
    void setNickname(String name);
}

interface PersonalDetails {
    String getName();
    int getAge();
}


class Person {
    private String name;
}
class Employee extends Person {
    private String empoyeeID;
}
interface VIP {
    String VIPStatus();
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



class CompanyGathering {
    public Boolean admitPerson(Person person) {
        boolean admitted_denied = ((person instanceof VIP) || (person instanceof Employee));
        return admitted_denied;
    }
}



// Contains sample input
public class MQ2c {
    public static void main(String[] args) {
        Individual input1 = new Individual("Jade");
    }
}


















// interface FamilyMember extends PersonalDetails {
//     String getNickname();
//     void setNickname(String name);
// }

// interface PersonalDetails {
//     String getName();
//     int getAge();
// }


// class Employee extends Person {
//     private String empoyeeID;

//     // CONSTRUCTORS
//     Employee() {
//         super();
//     }

//     Employee(String name, String nickname) {
//         super(name, nickname);
//     }
// }
// interface VIP {
//     String VIPStatus();
// }


// class Individual {
//     public String name;

//     // CONSTRUCTORS
//     /**
//      * @param String name
//      * @return returns nothing - initialises name.
//      */
//     Individual(String name) {
//         setName(name);
//     }


//     // GETTERS AND SETTERS
//     public void setName(String name) { this.name = name; }
//     public String getName() { return this.name; }



//     /**
//      * @param toString method takes in nothing
//      * @return Returns output formatted as specified.
//      */
//     public String toString() {
//         return name;
//     }
// }




// class Person extends Individual implements FamilyMember{
//     protected String nickname;
//     private int age;

//     // CONSTRUCTORS
//     // No-argument constructor
//     Person() {
//         super("");
//     }
//     /**
//      * @param String name, String nickname.
//      * @return returns nothing - initialises name, nickname.
//      */
//     Person(String name, String nickname) {
//         super(name); // Inherits name from extended class Individual
//         setNickname(nickname);
//     }


//     // Constructor for sample input with age.
//     /**
//      * @param String name, String nickname, int age
//      * @return returns nothing - initialises name, nickname, age.
//      */
//     Person(String name, String nickname, int age) {
//         super(name); // Inherits name from extended class Individual
//         setNickname(nickname);
//         setAge(age);
//     }


//     // GETTERS AND SETTERS
//     /**
//      * @param String
//      * @return Returns nothing
//      */
//     public void setNickname(String nickname) {this.nickname = nickname;}

//     /**
//      * @param int
//      * @return Returns nothing
//      */
//     public void setAge(int age) {this.age = age;}

//     /**
//      * @param Nothing
//      * @return Returns String name
//      */
//     public String getNickname() { return this.nickname; }
    
//     /**
//      * @param Nothing
//      * @return Returns int age
//      */
//     public int getAge() {return this.age;}


//     /**
//      * @param toString method takes in nothing
//      * @return Returns output formatted as specified.
//      */
//     public String toString() {
//         return super.getName() + " (" + getNickname() + ")";
//     }
// }


// class CompanyGathering {
//     public Boolean admitPerson(Object person) {
//         boolean admitted_denied = ((person instanceof VIP) || (person instanceof Employee));
//         return admitted_denied;
//     }
// }




// // Contains sample input
// public class MQ2c {
//     public static void main(String[] args) {
//         Individual individual1 = new Individual("John Smith");
// Person person1 = new Person("Alice Johnson", "AJ");
// Person person2 = new Person("Bob Brown", "BB", 35);
// Employee employee1 = new Employee();
// VIP vip1 = new VIP() {
//     public String VIPStatus() {
//         return "Gold";
//     }
// };

// CompanyGathering gathering = new CompanyGathering();
// System.out.println(gathering.admitPerson(individual1)); // false
// System.out.println(gathering.admitPerson(person1)); // false
// System.out.println(gathering.admitPerson(person2)); // false
// System.out.println(gathering.admitPerson(employee1)); // true
// System.out.println(gathering.admitPerson(vip1)); // true

//     }
// }
