// CLASSES AND INTERFACES /////
// TODO: interface SafetyRegulation (method getMaxItemsPermitted())
interface SafetyRegulation {
    int getMaxItemsPermitted();
}

// TODO: clasess for Items, Duck, Swan, etc.
abstract class Item implements SafetyRegulation {
    // constructor(s) //
    Item() {
    }
}

class Duck extends Item {
    private static final int max = 5;
    public int getMaxItemsPermitted() {
        return max;
    }
}

class Swan extends Item {
    private static final int max = 2;
    public int getMaxItemsPermitted() {
        return max;
    }
}

class Flamingo extends Item {
    private static final int max = 3;
    public int getMaxItemsPermitted() {
        return max;
    }
}

class Dog extends Item {
    private static final int max = 20;
    public int getMaxItemsPermitted() {
        return max;
    }
}

class Cat extends Item {
    private static final int max = 20;
    public int getMaxItemsPermitted() {
        return max;
    }
}



// MAIN CLASS *** ///
// TODO: class AnimalFactory implemented using Generics (<T extends Item> AND **safetyRegs ~~ use & ~~)
public class AnimalFactory<T extends Item & SafetyRegulation> {
    int unitsProduced = 0;

    // TODO: Constructor(s)
    AnimalFactory() {
        this.unitsProduced = unitsProduced;
    }


    //// Methods ////
    // TODO: continueProduction (takes in item, check units < max) ~~ increment unitsProduced
    public T continueProduction(T item) {
        if(this.unitsProduced < item.getMaxItemsPermitted()) {
            this.unitsProduced = this.unitsProduced + 1;
            return item;
        }
        else {
            return null;
        }
    }

    // TODO: getCount (return units)
    public int getCount() {
        return this.unitsProduced;
    }

    // Main /////
    // TODO: main (Input)
    public static void main(String[] args) {
        // main() for testing:
        AnimalFactory<Duck> AF_D = new AnimalFactory<>();
        while(AF_D.continueProduction(new Duck()) != null);
        System.out.println("Total Ducks produced: " + AF_D.getCount());

        AnimalFactory<Swan> AF_S = new AnimalFactory<>();
        while(AF_S.continueProduction(new Swan()) != null);
        System.out.println("Total Swans produced: " + AF_S.getCount());

        AnimalFactory<Flamingo> AF_F = new AnimalFactory<>();
        while(AF_F.continueProduction(new Flamingo()) != null);
        System.out.println("Total Flamingos produced: " + AF_F.getCount());

        AnimalFactory<Dog> AF_G = new AnimalFactory<>();
        while(AF_G.continueProduction(new Dog()) != null);
        System.out.println("Total Dogs produced: " + AF_G.getCount());

        AnimalFactory<Cat> AF_C = new AnimalFactory<>();
        while(AF_C.continueProduction(new Cat()) != null);
        System.out.println("Total Cats produced: " + AF_C.getCount());

        // which produces the output
        // Total Ducks produced: 5
        // Total Swans produced: 2
        // Total Flamingos produced: 3
        // Total Dogs produced: 20
        // Total Cats produced: 20
    }
}
