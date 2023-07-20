// // BASIC STRUCTURE OF JAVA CODE


// import java.util.Scanner;

// public class java_practice {






//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         System.out.println("Name: ");
//         String name = input.nextLine();

//         System.out.println("Address Number: ");
//         int address_number = input.nextInt();

//         System.out.println("Address Letter: ");
//         char letter = input.next().charAt(0);
//         System.out.println("Hello " + name + " who lives at " + address_number + " letter: " + letter);





//         String [] string_array = new String[5]; // Actually 4 because NULL included
//         System.out.println("String Array: ");
        
//         for(int i = 0; i < 5; i++) {
//             string_array[i] = input.nextLine();
//         }

//         for(int i = 0; i < string_array.length; i++) {
//             System.out.println(string_array[i] + " string entered");
//         }



//         int [] int_array = new int[5]; // Actually 5
//         System.out.println("Integer Array: ");
        
//         for(int i = 0; i < 5; i++) {
//             int_array[i] = input.nextInt();
//         }

//         for(int i = 0; i < int_array.length; i++) {
//             System.out.println(int_array[i] + " Integer entered");
//         }




//         char [] char_array = new char[5]; // Actually 4 because NULL included
//         System.out.println("Char Array: ");
        
//         for(int i = 0; i < 5; i++) {
//             char_array[i] = input.next().charAt(0);
//         }

//         for(int i = 0; i < char_array.length; i++) {
//             System.out.println(char_array[i] + " Char entered");
//         }




//         int vowels = 0;
//         // SWITCH  for loop says for(char in (iterable list) : iterable list)
//         for(char switch_char : name.toLowerCase().toCharArray()) {
//           switch(switch_char) {
//             case 'a':
//             case 'e':
//             case 'i':
//             case 'o':
//             case 'u':
//             vowels = vowels + 1;
//             break;
//           }
//         }
//         System.out.println("Number of vowels " + vowels);
  
    
//     }
// }



import java.util.Random;


public class Pokemon {
    static String region = "Kanto";
    String type = "Unknown";
    String name = "Unknown";
    int health_max = 100;
    int damage = 1;
    static int damage_base = 15;

    Move[] moves;

    /////// CONSTRUCTORS - * Have to be the same name as the class
    Pokemon() {
        // BASE CASE (DEFAULT)
    }

    Pokemon(String type) {
        this.type = type;
    }

    Pokemon(String name, String type) {
        this.name = name;
        this.type = type;
    }

    Pokemon(String name, String type, double damage_multiplier) {
        this.name = name;
        this.type = type;
        this.damage = (int) (Pokemon.damage_base * damage_multiplier);
    }

    Pokemon(String name, String type, double damage_multiplier, Move[] moves) {
        this.name = name;
        this.type = type;
        this.damage = (int) (Pokemon.damage_base * damage_multiplier);
        this.moves = moves;
    }
    //////////////////////////////////////////////////


    // CLASS METHODS
    ///// STRING PRINT STATEMENT //////
    public String toString() {
        return "Name: " + this.name + "\n" + "Type: "+ this.type + "\n" + "Region: " + this.region + "\n" + "-----";
    }

    public String attack1() { // this carries above toString info down
        return "\n" + "\n" + this + " uses cut for " + this.damage + " damage";
    }

    public String attack() { // this carries above toString info down
        Random generator = new Random();
        Move move = this.moves[generator.nextInt(this.moves.length)];
        return "\n" + "\n" + this + " uses " + move + " for " + move.damage + " damage";
    }


    public static void main(String[] args) {
        
        // DEFAULT () CONSTRUCTOR
        System.out.println(Pokemon.region);


        // TYPE CONSTRUCTOR
        Pokemon Egg = new Pokemon();  // CREATES THE INSTANCEEEEEEE
        System.out.println(Egg.type);
        Pokemon Bulbasaur = new Pokemon("Grass");
        System.out.println(Bulbasaur.type);

        // REGION CONSTRUCTOR
        Pokemon Jade = new Pokemon();
        System.out.println(Jade.region);
        Pokemon John = new Pokemon();
        John.region = "Johto";
        System.out.println(John.region);

        // NAME AND TYPE CONSTRUCTOR
        Pokemon Holly = new Pokemon("Holly", "Grass");
        System.out.println(Holly);  // PRINTING THE ENITRE OBEJCT INVOKES STRING TOSTRING (SAME AS __STR__ IN PYTHON)
        Pokemon Jack = new Pokemon("Jack", "Fire");
        System.out.println(Jack);


        // NAME, TYPE, DAMAGE
        Pokemon Tego = new Pokemon("Tego", "Grass", 2.1);
        System.out.println(Tego.attack1());

        // MOVE 
        Move Growl = new Move("Growl", 5);
        Move Scratch = new Move("Scratch", 12);
        Move Ember = new Move("Ember", 20);
        Move Slash = new Move("Slash", 32);

        Pokemon move_pokemon = new Pokemon("move_pokemon", "Fire", 2.1, new Move[]{Growl, Scratch, Ember, Slash});
        System.out.println(move_pokemon.attack());
        System.out.println("\n" + "\n" + "-------------------");



        // MULTIPLE CLASSES ACTIVITY
        Jade jadaey1 = new Jade();
        System.out.println(jadaey1.sayHello("Jadeygyal"));
        System.out.println("\n" + "\n" + "-------------------");

        Jade jadey = new Jade();
        System.out.println(jadey);
        System.out.println(jadey.sayHello("jadeyyyy"));
    }
}




// MULTIPLE CLASSES
class Move {
    String name = "";
    int damage = 9;
    public String toString() {
        return this.name;
    }
    Move(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }
}



class Jade {
    static String name = "Holly";

    // CONSTRUCTOR //
    Jade() {

    }

    Jade(String name) {
        this.name = name;
    }

    // METHODS
    public String sayHello(String name) {
        this.name = name;
        return "Hello, " + name;
    }

    public String toString() {
        return "Name: " + this.name + "\n" + "-----";
    }
}


