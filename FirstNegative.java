public class FirstNegative {
    public static void main(String[] args) {
        BWM b = new BWM();
        b.color();
        b.torque();
    }
}
class car{
    void color(){
        System.out.println("Black color");
    }
}

class BWM extends car{
    void torque(){
        System.out.println(470);
    }
}