class NoCakeFoundException extends Exception {
    NoCakeFoundException() { }
    NoCakeFoundException(String message) { }
    public String toString() {
        return "The Cake is a Lie!";
    }
}

class Cake {
    /** gets a cake; always throws the NoCakeFoundException
        @throws NoCakeFoundException
     */
    void getCake() throws NoCakeFoundException {
        throw new NoCakeFoundException();
    }
    /** eats a cake by getting it;
        handles NoCakeFoundException by printing it
     */
    void eatCake() {
        try { getCake();
        } catch (NoCakeFoundException e) { System.out.println(e); }
    }
}