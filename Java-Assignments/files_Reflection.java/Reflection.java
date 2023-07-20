import java.lang.reflect.*;
import java.lang.NoSuchFieldException;
import java.lang.NoSuchMethodException;

// -------------------------------------------
// TESTING CONDITIONS
class A {
    public String f_A;
}

class B extends A { }

interface X {
    void m_X();
}

class C extends B implements X {
    private String f_C;
    public void m_X() { }
}
// -------------------------------------------


class Reflection {

    // // CONSTRUCTORS //
    // Reflection() {
    //     
    // }


    // METHODS //
    public static boolean checkField(Class cls, String value) {
        while (cls != null) {
            try {
                cls.getDeclaredField(value);
                return true;
            } catch (NoSuchFieldException E) {
            }
            cls = cls.getSuperclass();
        }
        return false;
    }

    @SuppressWarnings("unchecked")
    public static boolean checkMethod(Class cls, String value) {
        try {
            cls.getDeclaredMethod(value);
            return true;
        } catch (NoSuchMethodException E) {
            return false;
        }
    }

    public static boolean isClass(Class cls) { 
        return !cls.isInterface();
    }

    public static boolean isInterface(Class cls) {
        return cls.isInterface();
    }


    static boolean hasAncestor(Class cls, String ancs) {
        while (cls != null) {
            Class parent = cls.getSuperclass();
            while (parent != null) {
                while (!parent.equals(Object.class)) {
                    if (parent.getName().equals(ancs)) {
                        return true;
                    }
                    else {
                        parent = parent.getSuperclass();
                    }
                }
                for (int i = 0; i < ((cls.getInterfaces()).length); i++) {
                    if (cls.getInterfaces()[i].getName().equals(ancs)) {
                        return true;
                    }
                    else {
                        return false;
                    }
                }
                parent = parent.getSuperclass();
            }
            cls = cls.getSuperclass();
        }
        return false;
    }

        
        
    public String WishYouA() {
        return "Happy St. Patrick's Day!";
    }



    public static void main(String[] args) {
        System.out.println("checkField(C.class, 'f_A'): " + Reflection.checkField(C.class, "f_A"));
        System.out.println("checkMethod(C.class, 'm_X'): " + Reflection.checkMethod(C.class, "m_X"));
        System.out.println("isClass(C.class): " + Reflection.isClass(C.class));
        System.out.println("isClass(X.class): " + Reflection.isClass(X.class));
        System.out.println("isInterface(C.class): " + Reflection.isInterface(C.class));
        System.out.println("isInterface(X.class): " + Reflection.isInterface(X.class));
        System.out.println("hasAncestor(C.class, 'A'): " + Reflection.hasAncestor(C.class, "A"));
        System.out.println("hasAncestor(C.class, 'C'): " + Reflection.hasAncestor(C.class, "C"));
        System.out.println("hasAncestor(C.class, 'X'): " + Reflection.hasAncestor(C.class, "X"));
        System.out.println("hasAncestor(B.class, 'X'): " + Reflection.hasAncestor(B.class, "X"));
        System.out.println("hasAncestor(X.class, 'X'): " + Reflection.hasAncestor(X.class, "X"));
        
    }
}



// SAMPLE METHOD STRUCTURE
        // checkField(class, value):
        //     return false if class is null
        //     return true if class has a field called value
        //     return true if class's ancestors have field called value
        //     return false otherwise

        // checkMethod(class, value):
        //     return false if class is null
        //     return true if class has a method called value
        //     return true if class's ancestors have method called value
        //     return false otherwise

        // isClass(class):
        //     return true if class is a Class
        //     return false otherwise

        // isInterface(class):
        //     return true if class is an interface
        //     return false otherwise

        // hasAncestor(class, value):
        //     return false if class is null
        //     return true if class has an ancestor called value
        //     return false otherwise
