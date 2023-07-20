import java.io.*;
import org.apache.commons.csv.*;
import com.google.gson.Gson;
import java.util.*;


/** 
* This is the StarWarsCharacter class. 
* It initialises each of the characteristics of the characters
* and initialises a list of where the characters will go
*/
class StarWarsCharacter {
    String name = "";
    String height = "";
    String mass = "";
    String hairColor = "";
    String skinColor = "";
    String eyeColor = "";
    String birthYear = "";
    String gender = "";
    String homeworld = "";
    String species = "";





    /**
    * Initialising list where characters will go
    */
    static List<StarWarsCharacter> charactersList = new ArrayList<StarWarsCharacter>();






    /**
    * CONSTRUCTORS **********
    * Intialises the class (default).
    */
    public StarWarsCharacter() {

    }








    /**
    * Reads in the characters.csv file and puts character 
    * info into the characteristic variables initialisd above
    * Also adds characters to charactersList.
    * @param takes in String named "charsfile" - charsfile being "characters.csv"
    */
    public static void readCVS(String charsfile) {
        try {
            Reader in = new FileReader(charsfile);
            // CSV Parser from Apache Commons CSV
            CSVFormat CSVparser = CSVFormat.Builder.create().setHeader().build();
            // Apache commons CSV creates an instance that holds all CSV rows
            Iterable<CSVRecord> records = CSVparser.parse(in);

            for (CSVRecord record : records) {
                StarWarsCharacter character = new StarWarsCharacter();

                System.out.println(record.get("name"));

                character.name = record.get("name");
                character.height = record.get("height");
                character.mass = record.get("mass");
                character.hairColor = record.get("hair_color");
                character.eyeColor = record.get("eye_color");
                character.skinColor = record.get("skin_color");
                character.birthYear = record.get("birth_year");
                character.gender = record.get("gender");
                character.homeworld = record.get("homeworld");
                character.species = record.get("species");

                charactersList.add(character);
            }
        } catch (IOException E) {
            System.out.println("IO Exception!");
        }

    }



    /**
    * @param Takes nothing in.
    * @return Uses GSON to convert character list to JSON data, else prints "IO Exception"
    */
    public static void toJSON() {
        try {
            Writer out = new FileWriter("characters.json");
            // For use of GSON refer to their user guide
            // Uses GSON to convert the characters list to JSON
            Gson gson = new Gson();
            gson.toJson(charactersList, out);
            out.close();
        } catch (IOException E) {
            System.out.println("IO Exception");
        } 
    }




    /**
    * @param Takes nothing in.
    * @return Prints out output string (output of class)
    */
    public String toString() {
        String output = "";
        return output;
    }

}



/**
* MAIN CLASS ****
* Uses StarWarsCharacter() class
*/
class JarJarBinks {
    public static void main(String[] args) 
    {
        StarWarsCharacter.readCVS("characters.csv");
        StarWarsCharacter.toJSON();
    }
}
