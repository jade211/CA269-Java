class Duck { 
    public String name;
    Duck(){ 
    }

    Duck(String name) {
        this.name = name;
    }
}

class Swan { 
    public String name;
    Swan(){
    }

    Swan(String name) {
        this.name = name;
    }
}

class Heron { 
    public String name;
    Heron(){
    }

    Heron(String name) {
        this.name = name;
    }
}


// MAIN CLASS //
public class GenericFactory<T> {
    private T singleton;
    
    // Constructor
    GenericFactory() {
    }

    GenericFactory(T singleton) {
        this.singleton = singleton;
    }

    // Method (returning T)
    public T getNewItem() {
        return singleton;
    }


    // MAIN //
    public static void main(String[] args) {
        // creating factories: note the specifying of Ducks and Swans
        GenericFactory<Duck> DuckFactory = new GenericFactory<Duck>(new Duck());
        GenericFactory<Swan> SwanFactory = new GenericFactory<Swan>(new Swan("Jade"));
        GenericFactory<Heron> HeronFactory = new GenericFactory<Heron>(new Heron());
        
        
        
        // using factories
        System.out.println(DuckFactory.getNewItem());
        System.out.println(SwanFactory.getNewItem());
        System.out.println(HeronFactory.getNewItem());
    }
}