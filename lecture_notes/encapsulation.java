// INHERITANCE - EXTENSION (EXTEND) OF PARENT CLASS INTO SUB (CHILD) CLASSES
// child INHERITS data and can use it
// NEED SUPER TO ACCESS


class encapsulation {
    public static void main(String[] args) {
    class X {
        int num = 1;
        int getNum() {
        return num;
    }
}


class Y extends X {
    
    @Override
    int getNum() {
        return super.getNum();
    }
    
    // int num = 1; is inherited from X
    // int getNum() is inherited from X
    
    }
}
}