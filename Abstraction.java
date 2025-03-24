public class Abstraction {
    // By using abstract class
    // By using interface
    public static void main(String[] args) {
        DEF d = new DEF();
        d.run();
        d.sleep();
        d.ask();
    }
}

interface ABC{
    void ask();
    void sleep();
    void run();
}

class DEF implements ABC{
    public void ask(){
        System.out.println("Asking");
    }
    public void sleep(){
        System.out.println("Sleeping");
    }
    public void run(){
        System.out.println("Running");
    }
}
