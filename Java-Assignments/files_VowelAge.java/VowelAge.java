import java.util.Scanner;

public class VowelAge {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        int age = input.nextInt();
        int vowel_counter = 0;
        String adult_minor = "a minor";

        char[] name_chars = name.toCharArray();
        for(int i = 0; i < name.length(); i++) {
            // char name_chars[i] = name.charAt(i);
            if(name_chars[i] == 'a' || name_chars[i] == 'e' || name_chars[i] == 'i' || name_chars[i] == 'o' || name_chars[i] == 'u' || name_chars[i] == 'A' || name_chars[i] == 'E' || name_chars[i] == 'I' || name_chars[i] == 'O' || name_chars[i] == 'U') {
                vowel_counter = vowel_counter + 1;
            }
        }

        if(age >= 18) {
            adult_minor = "an adult";
        }

        // System.out.println(vowel_counter);
        // System.out.println(name);
        // System.out.println(age);
        // System.out.println(adult_minor);
            
        System.out.println("Hello " + name + ", you have " + vowel_counter + " vowels, and you are " + adult_minor);

    }

}
