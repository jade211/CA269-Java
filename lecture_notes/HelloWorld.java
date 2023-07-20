// HelloWorld.java
// Make sure the name of the file is the SAME as the name of the public Class

// To compile, javac HelloWorld.java
// To execute, java HelloWorld
// Example operation:
// Name: Jane Doe
// Hello, World! Jane Doe is now a Java programmer!

// like Python and C, 'import' is used to invoke other code
// this can be present in existing libraries (typically prefixed as java.*)
// or can be another code written by you or shared from someone else
import java.util.Scanner;

// This is the 'object' you are creating, representing a HelloWorld task
public class HelloWorld {

    // this method is the 'main entry point' when HelloWorld is executed directly
    // public: this method is 'publicly visible' i.e. any other code can see and access it
    // static: this method is associated directly with the class HelloWorld
    //         and does not need instances of the class to be called
    // void: this method returns nothing, i.e. the return type if 'void'
    // String[]: Java is a typed language, i.e. each variable requires a type
    //           In this, we want arguments passed when calling main
    //           So we use `[]` which is the syntax to express an array
    // args: the conventional variable names for invoking commands where
    //       args means 'arguments'
    public static void main(String[] args) {

        // To take input, we use the imported tool called Scanner
        // Scanner provide a easy and convenient way to collect inputs
        // Create a new 'object' for where you want to take inputs from
        // For inputs from the command line, use System.in
        Scanner input = new Scanner(System.in);

        // To take inputs, call the scanner object with appropriate methods
        // These can be associated with inputs for integers, characters, lines
        // The variable storing the input needs to have the correct 'type'
        // A name is a 'String' type i.e. a fixed stream of characters

        // For visual cues, a message is printed to ask for input
        // To print something, Java I/O is provided through the 'System' library
        // System.out provides several output functions
        // print takes a string and prints it without a new line
        System.out.print("Name: ");
        String name = input.nextLine();  // ~~ OBJECT****
        // int name = input.nextInt();
        // long name = input.nextLong();
        // boolean name = input.nextBoolean();
        // char name = input.next().charAt(0);
        // GIVES CHAR IN STRING AT POSITION 0 ~~~ char name = input.next().chatAt(0);
        // double name = input.nextDouble();



        // NORMAL ARRAYS
        char [] char_array = new char[3];
        int [] scores1 = new int[7];
        int [] scores11 =  new int[7];
        int [] scores2 = {10, 34, 56 ,1, 23, 5};
        double [] scores3 = {2.4, 5.78, 2.444, 66.9, 1.00};
        String [] names = {"jade", "jane", "john"};


        // FILLLING UP A CHAR ARRAY
        Scanner char_in = new Scanner(System.in);
        System.out.println("Enter 3 characters: ");
        for(int i = 0; i < 3; i++) {
          char_array[i] = char_in.next().charAt(0);
        }

        for(int i = 0; i < char_array.length; i++) {
          System.out.println(char_array[i] + " Char entered");

        }




        // Scanner in = new Scanner(System.in);
        // System.out.println("Enter 7 numbers: ");
        // scores1[0] = in.nextInt();
        // scores1[1] = in.nextInt();
        // scores1[2] = in.nextInt();
        // scores1[3] = in.nextInt();
        // scores1[4] = in.nextInt();
        // scores1[5] = in.nextInt();
        // scores1[6] = in.nextInt();

        // // ORRRRR DO IN A LOOP **
        // Scanner input_in = new Scanner(System.in);
        // System.out.println("Enter 7 new numbers: ");
        // for(int i = 0; i < 7; i++) {
        //   scores11[i] = input_in.nextInt();
        // }





        // // MATRIX ARRAY
        // int array [] [] = new int[3][4];

        // Scanner array_in = new Scanner(System.in);
        // System.out.println("Enter 12 array numbers: ");
        
        // for(int row = 0; row < array.length; row++) {
        //   for(int column = 0; column < array[row].length; column++) {
        //     array[row][column] = array_in.nextInt();
        //   }
        // }

        // for(int row = 0; row < array.length; row++) {
        //   for(int column = 0; column < array[row].length; column++){
        //     System.out.println("Array number from row: " + row + " and column: " + column + " gives: " + array[row][column]);
        //   }
        // }




        System.out.print("Hello, World! ");

        // Mixing strings to print the name and message has several methods
        // String concatenation is the one used here
        // Also, println takes a string and prints it on a new line
        
        
        
        //  Example of printing out variables in an array
        // for(int i = 0; i < scores1.length; i++) {
        //   System.out.println(scores1[i] + " scores entered in");
        // }

        // for(int i = scores11.length - 1; i >= 0; i--) {
        //   System.out.println(scores11[i] + " in reverse order");
        // }
        
        for(int i = 0; i < scores2.length; i++) {
          System.out.println(scores2[i] + " is now a Java programmer!");
        }
        for(int i = 0; i < scores3.length; i++) {
          System.out.println(scores3[i] + " is now a Java programmer!");
        }
        for(int i = 0; i < names.length; i++) {
          System.out.println(names[i] + " is now a Java programmer!");
        }


        // If the return type of the method would not have been void,
        // but instead int, you would be returning a number here

        // WHILE LOOP EXAMPLE
        int i = 1;
        while(i <= 10) {
          System.out.println(i);
          i = i + 1;
        }



        int vowels = 0;
        // SWITCH  for loop says for(char in (iterable list) : iterable list)
        for(char s : name.toLowerCase().toCharArray()) {
          switch(s) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            vowels = vowels + 1;
            break;
          }
        }
        System.out.println("Number of vowels " + vowels);




        // IF ELSE





        // FOR LOOP EXAMPLE
        for(int j = 0; j <= 10; j++) {
          System.out.println(j);
        }



        // DO WHILE LOOPS (CONDITION CHECKED AFTER LOOP * NOT BEFORE*)
        int k = 1;
        do {
          System.out.println(k);
          k++;
        }while(k <= 10);




      // //toString() METHOD?? ***
      // public String toString() {
      //   // this = this instance
      //   // this.name = this instance's name field
      //   return "this is a custom string representation called " + this.name;
      // }
      
      // String[] mystr ={"a","b","c"};
      // System.out.println("Result: " + mystr.toString());


  }
}



