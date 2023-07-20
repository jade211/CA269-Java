// abstract class Ducks {
//     String shape = "duck-like";
//     String getEtymology() {
//         return "snvifuvbueb";
//     }
// }

// interface Fly {
//     void fly();
// }

// interface Swim {
//     void swim()
// }

// interface Quack {
//     String quack();
// }

// class WoodenDuck extends Ducks {}
// class RealDuck extends Ducks implements Fly, Swin, Quack {}
// class RubberDuck extends Ducks implements Swin {}












// class Ducks{
//     String colour;
//     String id;

//     // CONSTRUCTORS ////////
//     Ducks() {
//     }

//     Ducks(String colour, String id) {
//         this.colour = colour;
//         this.id = id;
//     }
//     ///////////////////////////////////
//     String toString() {
//         return "Duck #" + id;
//     }
// }

// public class DuckFactory {
//     private int counter = 0;
//     public final int MAX_DUCKS;
//     public final String colour;

//     //// CONSTRUCTORS /////////////////////////
//     DuckFactory() {
//     }

//     DuckFactory(int max_ducks, String colour) {
//         this.MAX_DUCKS = max_ducks;
//         this.colour = colour;
//     }
//     //////////////////////////////////////////

//     public Ducks getNewDuck() {
//         counter += 1;
//         if (counter < MAX_DUCKS) {
//             return new Ducks(colour, colour + "#" + id);
//         }
//         return null;
//         }






//     // MAIN
//     public static void main(String[] argc) {
//         DuckFactory dfRed = new DuckFactory(100, "Red");
//         Ducks d1 = dfRed.getNewDuck();
//         System.out.println(d1);
//         for(int i = 1; i < 100; i++) {
//             dfRed.getNewDuck();
//         }
//         d1 = dfRed.getNewDuck();
//         System.out.println(d1);

//         // DuckFactory dfGreen = new DuckFactory(0, "Green");
//         // d1 = dfGreen.getNewDuck();
//         // System.out.println(d1.colour);
//     }
// }





//     public static Ducks getNewDuck() {
//         counter += 1;
//         if (counter < MAX_DUCKS) {
//             return new Ducks();
//         }
//         return null;
//     }
// }










































// public class Ducks {
//     fly() {

//     }
// }

// ////////////CONSTRUCTORS////////////
//     Ducks() {

//     }

//     Ducks(String name, ) {
//         self.name = name
//     }
// ///////////////////////////////


//     public static void main(String args[]) {
        
//     }
    
    
    
    
    
//     class WoodenDuck extends Ducks {
//         WoodenDuck(String name) {
//             super(name);  // calls parent class (TASK)
//         }
// }
























// class Duck {
//     String colour;
//     String id;
//     Duck(String colour, String id) {
//         this.colour = colour;
//         this.id = id;
//     }
//     // String toString() {
//     //     return "Duck #" + id;
//     // }
// }

// public class DuckFactory {
//     private int counter = 0;
//     public final int MAX_DUCKS;
//     public final String colour;

//     DuckFactory(int max_ducks, String colour) {
//         this.MAX_DUCKS = max_ducks;
//         this.colour = colour;
//     }
//     public Duck getNewDuck() {
//         counter += 1;
//         if (counter < MAX_DUCKS) {
//             return new Duck(colour, colour + "#");
//         }
//         return null ;
//     }

//     public static void main(String[] args) {
//         DuckFactory dfRed = new DuckFactory(100, "Red");
//         Duck d1 = dfRed.getNewDuck();
//         System.out.println(d1); // Red#1
//         for(int i=1; i<100; i++) { dfRed.getNewDuck(); } // skip to duck #50
//         d1 = dfRed.getNewDuck();
//         System.out.println(d1); // Red#51

//         DuckFactory dfGreen = new DuckFactory(0, "Green");
//         d1 = dfGreen.getNewDuck();
//         System.out.println(d1.colour); // error: d1 is null!
//     }
// }



// CLASSES //
class Duck {
    private String colour;
    // private Size size;
    private double cost;
    private String manufacturer_sign;
    private int counter = 0;

    Duck() {

    }

    Duck(String colour, double cost, String manufacturer_sign, int counter) {
        this.colour = colour;
        // this.size = size;
        this.cost = cost;
        this.manufacturer_sign = manufacturer_sign;
        this.counter = counter;
    }

    public String getColour() {
        return colour;
    }
    // public Size getSize() {
    //     return size;
    // }
    public double getCost() {
        return cost;
    }
    public String getManufacturer_sign() {
        return manufacturer_sign;
    }

    public String toString() {
        return this.colour + " (" + this.cost + ", " + this.manufacturer_sign + ", " + this.counter + ")";
    }
}



public class DuckFactory {
    private int counter = 0;
    public final int MAX_DUCKS;
    public final String colour;
    public final double cost;
    public final String manufacturer_sign;

    DuckFactory(int max_ducks, String colour, double cost, String manufacturer_sign, int counter) {
        this.MAX_DUCKS = max_ducks;
        this.colour = colour;
        this.cost = cost;
        this.manufacturer_sign = manufacturer_sign;
        this.counter = counter;
    }
    public Duck getNewDuck() {
        counter += 1;
        if (counter < MAX_DUCKS) {
            return new Duck(colour, cost, manufacturer_sign, counter);
        }
        return null ;
    }



    public static void main(String[] args) {
        DuckFactory dfRed = new DuckFactory(100, "Red", 10.00, "jade", 0);
        Duck d1 = dfRed.getNewDuck();
        System.out.println(d1); // Red (10.0, jade)
        
        // Gets/Stops at 51st Duck??
        for(int i=1; i<50; i++) { dfRed.getNewDuck(); }
        d1 = dfRed.getNewDuck();
        System.out.println(d1);


        DuckFactory dfGreen = new DuckFactory(10, "Green", 20.00, "Holly", 0);
        Duck d2 = dfGreen.getNewDuck();
        System.out.println(d2);
        // System.out.println(d1.colour); // error: colour is private
    }
}





