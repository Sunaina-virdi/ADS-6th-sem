public class DesignParkingSystem {
    int b = 0,m = 0,s = 0;

    public DesignParkingSystem(int big, int medium, int small) {
        b = big;
        m = medium;
        s = small;
    }
    
    public boolean addCar(int carType) {
        if(carType == 1){
            if(b > 0){
                b--;
                return true;
            }
            else{
                return false;
            }
        }
        if(carType == 2){
            if(m > 0){
                m--;
                return true;
            }
            else{
                return false;
            }
        }
        if(carType == 3){
            if(s > 0){
                s--;
                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }
}
