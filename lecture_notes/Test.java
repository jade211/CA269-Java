// // class Template<T, extends Item & SecureItem> { // <> means generic, T as parameter
// //     // public template(T t, SecureItem) OR k[] = keys, v=[] values ~~~ public Template(K, key, V, value)
// //     public void run(T t) { // Publuc run
// //         System.out.println(t);
// //         // do database to store p
// //     }
// //     void print(Object, obj) {
// //         if (obj instanceof SecureItem) {
// //             SecureItem item = (SecureItem) obj;
// //         }
// //         Sysetm.out.println(obj);
// //     }
// // }



// // class Template<Integer> { // <> means generic, T as parameter
// //     public void run(Integer t) {
// //         System.out.println(t);
// //         // do something with integer (or string)
// //     }
// // }


// // main() {
// //     Template<String> t = new Template<String>();
// //     Template<Integer> t = new Template<Integer>();
// //     Template<A> t = new Template<A>;
// //     String x = "xcxc"
// //     A a = new A();
// // }



// // Interface Parent <T> { // <> means generic, T as parameter
// //     void run();
// //     }

// class Template<T> {
//     public Template(T t) {
//         System.out.println(t);
//     }
// }



// class A {// <> means generic, T as parameter
//     public String toString() {
//         return "A";
//     }
// }

// class B {// <> means generic, T as parameter
//     public String toString() {
//         return "B";
//     }
// }

// class C {// <> means generic, T as parameter
//     public String toString() {
//         return "C";
//     }
// }

// // class Test {} {// <> means generic, T as parameter
// //     public static void main(String[] args) {
// //         Template<Integer> a = new Template<Integer>(42);
// //     }
// // }

// class Test {// <> means generic, T as parameter
//     public static void main(String[] args) {
//         Template<Integer> a = new Template<Integer>(42);
//         Template<String> s = new Template<String>("Hello World");
//         // Template<A> c = new Template<A>(new A);
//     }
// }






interface IterItem {
    double getValue();
}

class Template<T extends IterItem> {

    double total(T[] item) {
        for (T t: items) {
            total += t.getValue();
        }
        // calc total
    }
}

// Shop 1
class ItemA implements IterItem {
    Template<ItemA> s1 = new Template<ItemA>();
}


// SHOP 2
class ItemB implements IterItem {
    Template<ItemB> s1 = new Template<ItemB>();

    for 
}

// SHOP 3
class ItemC implements IterItem {
    Template<ItemC> s1 = new Template<ItemC>();
}





interface Duck { }

class Factory{
    static int duckCreated = 0;
    private class MyDuck implements Duck { }
    static Duck getDuck() {
        ducksCreated += 1;
        if (ducksCreated)
    }
        ducksCreated += 1;

    // Duck getDuck() {
        // return new MyDuck();
    }
}

Duck duck = Factory.getDuck();