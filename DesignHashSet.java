import java.util.*;
public class DesignHashSet {
    HashMap<Integer,Boolean> mp = new HashMap<>();
    public DesignHashSet() {
        
    }
    
    public void add(int key) {
        mp.put(key,true);
    }
    
    public void remove(int key) {
        mp.put(key,false);
    }
    
    public boolean contains(int key) {
        if(mp.containsKey(key) && mp.get(key) == true){
            return true;
        }
        else{
            return false;
        }
    }
}
