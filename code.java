import java.util.*;

class myClass{
    List<String> arr = new ArrayList<>();

    public void add(String ele){
        arr.add(ele);
    }
    public void add(Object ele) {
        try {
            if (!(ele instanceof String)) {
                throw new IllegalArgumentException("Only strings are allowed!");
            }
            arr.add((String) ele);
        } catch (IllegalArgumentException err) {
            System.err.println("Exception: " + err.getMessage());
        }
    }

    public void Ele(Object ele) {
        if(!(ele instanceof String)){
            System.err.println("Error");
        }
        else{
            System.out.println(ele);
        }
    }
    public List<String> print(){
        return arr;
    }
}

public class code {
    public static void main(String[] args) {
        myClass myobj = new myClass();
        myobj.add("1536");
        myobj.add("123");
        System.out.println(myobj.print());
    }    
}
