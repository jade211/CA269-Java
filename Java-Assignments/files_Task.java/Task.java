import java.time.LocalDate;
import java.time.Period;

class Task {
    final String title; 
    String description;
    State state;
    LocalDate scheduled;
    LocalDate deadline;


    // CONSTRUCTORS //
    Task(String title) {
        this.title = title;  // -> final variable: no setter because value cannot be changed
    }
    Task(String title, State state) {
        this.title = title;  // -> final variable: no setter because value cannot be changed
        setState(state);
    }

    Task(String title, State state, String description, LocalDate scheduled, LocalDate deadline) {
        this.title = title;
        setState(state);
        setDescription(description);
        setScheduled(scheduled);
        setDeadline(deadline);
    }



    // ***METHODS THAT GIVE YOU THE INSTANCES - GETTERS AND SETTERS***
    // SETTERS: Set the changeable functions

    // Sets Schedule
    public void setScheduled(LocalDate scheduled) {
        this.scheduled = scheduled;
    }

    // Sets Description
    public void setDescription(String description) {
        this.description = description;
    }

    // Sets State
    public void setState(State state) {
        this.state = state;
    }

    // Sets Deadline
    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }




    // GETTERS: Returns information

    // Returns Title of task
    public String getTitle() { return this.title; }

    // Returns Description
    public String getDescription() { return this.description; }

    // Returns State
    public State getState() { return this.state; }

    // Returns Schedule
    public LocalDate getScheduled() { return this.scheduled; }

    // Returns Deadline
    public LocalDate getDeadline() { return this.deadline; }


    // PRINT STRING STATEMENT ***
    public String toString() {
        String message = this.title + " (" + this.state + ")";
        if (scheduled != null) {
            message = message + " scheduled: " + this.scheduled;
        }
        if (deadline != null) {
            message += " deadline: " + this.deadline;
        }
        return message;
    }


    // MAIN ***
    public static void main(String args[]) {

        // STEP 1
        Task t1 = new Task("T1", State.TODO); // Goes up to 
        LocalDate now = LocalDate.now();
        LocalDate.now();
        System.out.println(t1);


        // STEP 2
        // tests task and sends to repeated tasks to do it again (sets DONE to TODO)
        Task s1 = new RepeatedTask("S1", State.TODO);
        System.out.println(s1);
        s1.setState(State.DONE);  // Will get converted back to TODO in RepeatedTask Override
        System.out.println(s1);


        // STEP 3
        Task s2 = new Chore("S2", State.TODO, LocalDate.now(), LocalDate.now().plus(Period.ofDays(7))); //LocalDate.now() gives date right now, Period.ofDays(n) gives n number of days after current date supplied ~~ .plus() inbetween means adding current date and period number together (gives new date n days after current)
        System.out.println(s2);  // Just prints out schedule unchanged
        s2.setState(State.DONE);  // Changes State from TODO to DONE - Increments date by 7
        System.out.println(s2); 


        // STEP 4
        Task t2 = new SharedTask("T2", "Alice");
        System.out.println(t2);


        // STEP 5
        Task t3 = new Dependency("T3", State.TODO, t1);
        System.out.println(t3);  // Both tasks set to TODO at this stage
        t3.setState(State.DONE);  // t3 now set to DONE (but task is still TODO)
        System.out.println(t3);
        t1.setState(State.DONE); // task now set to DONE
        t3.setState(State.DONE); // t3 also set to DONE
        System.out.println(t3); // -> Both set to DONE
    }
}






// STEP 2 SUBCLASSES
// Extend: Becomes a subclass of Task (Parent)
class RepeatedTask extends Task {

    // CONSTRUCTOR
    RepeatedTask(String title) {
        super(title);
    }
    RepeatedTask(String title, State state) {
        super(title);  // calls parent class (TASK)
        setState(state);
    }

    @Override  // Changes/ Adapts Parent class method to something else in this subclass.
    public void setState(State state) {
        if (state == State.DONE) 
        {
            this.state = State.TODO;
        }
        else {
            this.state = state;
        }
    }
}

// STEP 3 SUBCLASS
// Extend: Becomes a subclass of Task (Parent)
class Chore extends RepeatedTask {
    LocalDate repeat;  // placeholder for repeat (will be a date)

    // CONSTRUCTORS
    Chore(String title, State state, LocalDate scheduled, LocalDate repeat) {
        super(title);  // Calls parent class constructor (TASK)
        setState(state);
        setScheduled(scheduled);
        setRepeat(repeat);
    }

    // getters & setters
    // Sets above to repeat (7 days after schedule date)
    public void setRepeat(LocalDate repeat) {
        this.repeat = repeat;  // Repeat = Repeat given in as input (which is 7 days after schedule date)
    }
    public LocalDate getRepeat() { return this.repeat; }


    @Override
    public void setState(State state) {
        super.setState(state);  // Changed state
        if (state == State.DONE) {
            LocalDate updated_repeat = repeat.plus(Period.ofDays(7));  // Next deadline gets extended (new_repeat)
            setScheduled(repeat); // New Scheduled day is then set as old deadline (7 days after schedule)
            setRepeat(updated_repeat);  // Sets to new 7+ day forward deadline (7 days after new schedule)
        }
    }    
}


// STEP 4 SUBCLASS
// Extend: Becomes a subclass of Task (Parent)
class SharedTask extends Task {
    String name;  // Placeholder for new t2 name (currently empty)

    SharedTask(String title, String name) {  // Constructor
        super(title);
        this.state = State.WAIT;
        this.name = name;  // Alice
    }

    public String toString() {
        return super.toString() + " shared with: " + name;
    }
}


// STEP 5 SUBCLASS
// Extend: Becomes a subclass of Task (Parent)
class Dependency extends Task {
    Task dependency;

    Dependency(String title, State state, Task dependency) {
        super(title);
        setState(state);
        this.dependency = dependency;  // other, already initialised task
    }

    public String toString() {
        return super.toString() + " dependent on: " + dependency.toString();
    }


    @Override
    public void setState(State state) {  // Shared Task(TODO) == Shared Task(DONE)
        if (state == State.DONE && (dependency.state == State.DONE)) {
            this.state = state;
        }
        if (state == State.DONE && !(dependency.state == State.DONE)) {
            return;
        }
        this.state = state;
    }
}

enum State {
    TODO, BEGN, HALT, WAIT, DONE;
}
