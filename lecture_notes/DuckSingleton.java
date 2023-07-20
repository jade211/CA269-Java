// CLASSES - (creats object) // ~~ Duck()

class Duck {  // COULD BE JUST THIS: class Duck { }
    public String name;

    // CONSTRUCTORS //
    Duck() {
    }

    Duck(String name) {
        this.name = name;
    }

    // METHODS (getters/setters/toString/etc)
    public String getName() {
        return this.name;
    }

}


public class DuckSingleton {
    private Duck duck;
    
    // CONSTRUCTOR//
    DuckSingleton(Duck duck) {
        this.duck = duck; // set the single duck at creation time
    }

    // METHOD //
    public Duck getItem() {
        return this.duck; // always return the SAME duck
    }

    public String toString() {
        return "Little duck is called: " + this.duck.name;
    }




    // MAIN //
    public static void main(String[] args) {
        DuckSingleton D = new DuckSingleton(new Duck("jade"));
        System.out.println(D);

        Duck d1 = D.getItem(); // SAME DUCK
        Duck d2 = D.getItem(); // SAME DUCK
        System.out.println(d1 == d2); // ---> should be true

        DuckSingleton D2 = new DuckSingleton(new Duck("holly"));
        System.out.println(D2);
        Duck a = D2.getItem(); // SAME DUCK
        Duck b = D2.getItem(); // SAME DUCK
        System.out.println(a == b); // ---> should be true

        System.out.println(d1 == a); // --> should be false
        System.out.println(d2 == a); // --> should be false
        System.out.println(d1 == b); // --> should be false

    }
}
