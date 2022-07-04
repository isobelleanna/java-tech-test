import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private static final List<CarSpaces> parkingLot = new ArrayList<>();

    static {
        for (int i = 0; i < 1; i++) {
            parkingLot.add(new CarSpaces( 60 , 10));
        }
    }

    public static CarSpaces getCarSpacesByIndex(int index){
        return parkingLot.get(index);
    }

}
