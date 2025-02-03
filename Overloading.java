public class Overloading {
    public static void main(String[] args) {
        Calculate c = new Calculate();
        System.out.println(c.mul(4,5));
        System.out.println(c.mul(4,5,6));

    }
}

class Calculate{
    int mul(int a,int b){
        return a * b;
    }
    int mul(int a,int b,int c){
        return a * b * c;
    }
}