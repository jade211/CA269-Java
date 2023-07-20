import java.util.List;
import java.util.ArrayList;

// class GenericList {
//     public static void main(String[] args) {
//         List<Integer> list = new ArrayList<Integer>();
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);
//         list.add(10);
//         System.out.println(list); // prints [1]
//     }
// }

/////////////////////////////////////////
/////////////////////////////////////////

interface MyList<E> {
    void add(E e);
    void add(E e, int pos);
    E remove();
    E remove(int pos);
    void clear();
    int size();
    int contains(E e);
}

class GenericList<E> implements MyList<E> {
    private E[] array = (E[])new Object[100]; // DANGEROUS!
    private int size = 0;

    public void add(E e) {
        this.array[size] = e;
        size += 1;
    }

    public String toString() {
        String output = "[";
        for(int i=0; i<size; i++) {
            output += array[i] + ",";
        }
        return output + "]";
    }

    // TODO: add
    // TODO: remove from end
    // TODO: remove at position
    // TODO: clear
    // TODO: size
    // TODO: contains





    // FIXME:
    public static void main(String[] args) {
        GenericList<Integer> numList = new GenericList<>();
        for(int i=0; i<10; i++)
        { 
            numList.add(i); 
        }
        // output: [0,1,2,3,4,5,6,7,8,9,]   
        
        GenericList<Integer> numList = new GenericList<>();
        for(int i=0; i<=9; i++)
        { 
            numList.add(i);
        }
        System.out.println(numList);
        // output: [0,1,2,3,4,5,6,7,8,9,]
        numList.add(0, 5); // add 0 at position 5
        System.out.println(numList);
        // output: [0,1,2,3,4,5,5,6,7,8,9,]
        
        GenericList<Integer> numList = new GenericList<>();
        for(int i=0; i<=9; i++)
        {
            numList.add(i);
        }
        System.out.println(numList);
        // output: [0,1,2,3,4,5,6,7,8,9,]
        numList.remove();
        System.out.println(numList);
        // output: [0,1,2,3,4,5,6,7,8,]
        
        
        
        GenericList<Integer> numList = new GenericList<>();
        for(int i=0; i<=9; i++)
        {
            numList.add(i);
        }
        System.out.println(numList);
        // output: [0,1,2,3,4,5,6,7,8,9,]
        numList.remove(5);
        System.out.println(numList);
        // output: [0,1,2,3,4,6,7,8,9,]
        
        
        GenericList<Integer> numList = new GenericList<>();
        for(int i=0; i<=9; i++) { numList.add(i); }
        System.out.println(numList);
        // output: [0,1,2,3,4,5,6,7,8,9,]
        numList.clear();
        System.out.println(numList);
        // output: []
        
        
        
        
        GenericList<Integer> numList = new GenericList<>();
        for(int i=0; i<=9; i++) { numList.add(i); }
        System.out.println(numList);
        // output: [0,1,2,3,4,5,6,7,8,9,]
        System.out.println(numList.size());
        // output: 10
        
        
        
        
        GenericList<Integer> numList = new GenericList<>();
        for(int i=0; i<=9; i++) { numList.add(i); }
        System.out.println(numList);
        // output: [0,1,2,3,4,5,6,7,8,9,]
        System.out.println(numList.contains(5));
        // output: 5
        System.out.println(numList.contains(10));
        // output: -1




    }
}








// USEFUL CODE SNIPPETS




// LIST
// import java.util.List;

// List<String> list = new ArrayList<String>();
// // add 1 to 10 in a list
// for(int i=1; i<=10; i++) { list.add("n" + i); }

// list.remove(0); // will remove first element
// // -1 to access last element works in Python, but not Java
// list.remove(-1); // ERROR!
// DO THIS INSTEAD **
// int index = list.size() - 1;
// list.remove(index);

// // remove odd numbers from list - think about why this works
// for(int i=0; i<5; i++) { list.remove(i); }

// // get last element
// list.get(list.size() - 1);



// STACK
// import java.util.List;
// import java.util.Stack;

// List<Integer> list = new Stack<Integer>();
// // add 1 to 10 in a stack
// // note use of push rather than add
// for(int i=1; i<=10; i++) { list.push(i); }

// // taking items out uses LIFO
// for(int i=0; i<list.size(); i++) { list.pop(i); }

// // if we don't know the size, we can also use a while loop
// while(!list.empty()) { // isEmpty also works!
//     list.pop()
// }




// SET
// import java.util.Set;

// Set<String> set = new HashSet<String>();
// set.add("one");
// set.add("one"); // duplicate is not added
// set.remove("one"); // removes one, set is now empty
// set.remove("two"); // item not found, so nothing happens, this is not an error
// set.isEmpty(); // returns true or false - note isEmpty() vs list's empty()








// QUEUE
// import java.util.Queue;

// Queue<String> queue = new LinkedList<String>();
// queue.add("one");
// queue.add("two"); // two is added to tail
// queue.remove(); // "one" is removed from head
// queue.remove(); // two is removed from head, queue is now empty
// queue.remove(); // error - queue is empty
// queue.poll(); // no error, returns null if queue is empty, otherwise head
// queue.peek(); // retrieves head but doesn't remove it, null if queue is empty
// queue.element(); // retrieves head but doesn't remove it, error if queue is empty
// queue.isEmpty(); // returns true/false is queue is empty









// MAPS
// import java.util.Map;

// Map<String,Integer> map = new HashMap<String,Integer>();
// map.put("one",1); // {"one": 1}
// map.put("two",2); // {"one": 1, "two": 2}

// Set<String> keys = map.keySet(); // returns a set of keys
// for(String key: map.keySet()) { } // so keys can be iterated in loops
// // similarly map.values() returns a Collection of values

// map.putIfAbsent("one", 100); // fails because 1 is present
// map.put("zero", null);
// map.putIfAbsent("zero", 0); // works - null isn't considered a value

// map.remove("zero"); // removes {"zero", 0}
// map.remove("one", 100) // doesn't remove anything because one isn't mapped to 100
// // similarly replace(key, value) replaces the value
// // similarly replace(key, old value, new value) replaces the value
// // only if the key contains the old value






// REVERSING STRING USING STACK

// import java.util.Stack;

// Stack<Character> stack = new Stack<>();
// String source = "12345";
// String target = "";
// for(Character c: source.toCharArray()) { stack.push(c); }
// while(!stack.empty()) { target += stack.pop(); }








// MAKE A MAP (MAP STRINGS TO INT)
// import java.util.Map;
// import java.util.HashMap;
// import java.util.Scanner;

// class MakeMap {
//     static Map<String,Integer> makeMap(Scanner scan) {
//         Map<String,Integer> map = new HashMap<>();
//         while(scan.hasNext()) {
//             map.put(scan.next(), scan.nextInt());
//         }
//         return map;
//     }
// }



















// USE MAP TO COUNT OCCURANCE OF WORD IN INPUT
// Map<String,Integer> map = new HashMap<>();
// while(scan.hasNext()) {
//     String key = scan.next();
//     if(map.containsKey(key)) {
//         map.put(key, map.get(key) + 1);
//     } else {
//         map.put(key, 1);
//     }
// }
