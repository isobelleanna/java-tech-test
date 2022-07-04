import java.util.ArrayList;
import java.util.List;

public class CarPark {
    private static final List<Vehicle> carPark = new ArrayList<>();

    static {
        for (int i = 0; i < 3; i++){
            carPark.add(new Car("ABAG" +  (int)(Math.random() * 20 + 1)));
            carPark.add(new Motorcycle("MG" + (int)(Math.random() * 20 + 1)));
            carPark.add(new Van("VHG" + (int)(Math.random() * 20 + 1)));
        }
    }
    public static List<Vehicle> getCarPark() {return carPark;}

}
