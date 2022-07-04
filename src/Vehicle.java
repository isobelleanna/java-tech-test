public class Vehicle {
    private String licensePlate;
    private String type;
    private int spotAmount;

    public Vehicle(String licensePlate, String type, int spotAmount) {
        this.licensePlate = licensePlate;
        this.type = type;
        this.spotAmount = spotAmount;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getType() {
        return type;
    }

    public int getSpotAmount() {
        return spotAmount;
    }

    @Override
    public String toString(){
        return "\n" + licensePlate + " " + type;
    }
}
