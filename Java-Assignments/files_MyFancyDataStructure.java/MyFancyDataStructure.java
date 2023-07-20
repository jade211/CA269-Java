import java.util.List;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;


class Value implements Comparable<Value>{
    final int value;
    private static boolean SORT_LOWER; // static : retains value across all instances**
    
    public Value(int value) {
        this.value = value;
    }
    
    /* SETTERS & GETTERS */
    public int getValue() { return this.value; }

    public static void setSortLower() { Value.SORT_LOWER = true; }
    public static boolean isSortLower() { 
        if (Value.SORT_LOWER == true) {
            return Value.SORT_LOWER; 
        }
        else {
            return false;
        }
    }

    public static void setSortHigher() { Value.SORT_LOWER = false; }
    public static boolean isSortHigher() { 
        if (Value.SORT_LOWER == false) {
            return Value.SORT_LOWER; 
        }
        else {
            return false;
        }
    }
    
    ////// PRINT STATEMENT
    public String toString() {
        return String.valueOf(this.value);
    }
    
    public int compareTo(Value value) {
        if (Value.isSortLower()) {
            return Integer.compare(this.value, value.value);
        }
        return Integer.compare(value.value, this.value);

    }
}


class PreferLowerValues implements Comparator<Value> {
    public int compare(Value value, Value value_next) {
        return value_next.compareTo(value);
    }
}




class PreferHigherValues implements Comparator<Value> {
    public int compare(Value value, Value value_next) {
        return value.compareTo(value_next);
    }
}







// MAIN
public class MyFancyDataStructure {
    public static void main(String[] args) {
    List<Value> list = Arrays.asList(
        new Value(2), new Value(3), new Value(1)
    );

    Value.setSortLower(); // <Lower/Higher>(); set sorting to prefer lower or higher values
    Collections.sort(list); // to test Comparable
    list.sort(new PreferLowerValues()); // to test Comparator
    list.sort(new PreferHigherValues()); // test Comparator
    System.out.println(list); // to check output

    Value.setSortHigher(); // <Lower/Higher>(); set sorting to prefer lower or higher values
    Collections.sort(list); // to test Comparable
    System.out.println(list); // to check output

    List<Value> list2 = Arrays.asList(
        new Value(2), new Value(3), new Value(1));
        list2.sort(new PreferLowerValues());
        System.out.println(list2);
        // OUTPUT: [1, 2, 3]

        list2.sort(new PreferHigherValues());
        System.out.println(list2);
        // OUTPUT: [3, 2, 1]
    
    }
}
