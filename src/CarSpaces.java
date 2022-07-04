public class CarSpaces {
    public static boolean isSpaceForCar = true;
    public static boolean isSpaceForVan = false;

    private final int amountOfRegularSpaces;

    private final int amountOfMotorcycleSpaces;

    private int currentRegularSpacesAvailable;

    private int currentMotorcycleSpacesAvailable;

    private static boolean isFull = false;

    private static boolean isEmpty = false;

    public static boolean isSpaceForMotorcycle = true;

     public CarSpaces(int amountOfRegularSpaces, int amountOfMotorcycleSpaces){
         this.amountOfRegularSpaces = amountOfRegularSpaces;
         this.amountOfMotorcycleSpaces = amountOfMotorcycleSpaces;
         this.currentRegularSpacesAvailable = amountOfRegularSpaces - 12;
         this.currentMotorcycleSpacesAvailable = amountOfMotorcycleSpaces - 3;
     }

    public int getAmountOfRegularSpaces() {
        return amountOfRegularSpaces;
    }

    public int getAmountOfMotorcycleSpaces() {
        return amountOfMotorcycleSpaces;
    }

    public int getCurrentRegularSpacesAvailable() {
        return currentRegularSpacesAvailable;
    }

    public int getCurrentMotorcycleSpacesAvailable() {
        return currentMotorcycleSpacesAvailable;
    }

    public boolean isFull() {
        return isFull;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setCurrentRegularSpacesAvailable(int currentRegularSpacesAvailable) {
        this.currentRegularSpacesAvailable = currentRegularSpacesAvailable;
    }

    public void setCurrentMotorcycleSpacesAvailable(int currentMotorcycleSpacesAvailable) {
        this.currentMotorcycleSpacesAvailable = currentMotorcycleSpacesAvailable;
    }

    public void setFull(boolean full) {
        isFull = full;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public static boolean getIsSpaceForVan() {
        return isSpaceForVan;
    }

    public void setSpaceForVan(boolean spaceForVan) {
        isSpaceForVan = spaceForVan;
    }

    public static boolean getIsSpaceForCar() {
        return isSpaceForCar;
    }

    public void setSpaceForCar(boolean spaceForCar) {
        isSpaceForCar = spaceForCar;
    }

    public static boolean getIsSpaceForMotorcycle() {
        return isSpaceForMotorcycle;
    }

    public void setSpaceForMotorcycle(boolean spaceForMotorcycle) {
        isSpaceForMotorcycle = spaceForMotorcycle;
    }

    public void parkVan(){
        if(this.currentRegularSpacesAvailable >= 3 && this.currentRegularSpacesAvailable < 6){
            setSpaceForVan(false);
            setCurrentRegularSpacesAvailable(this.currentRegularSpacesAvailable - 3);
        }else {
            setCurrentRegularSpacesAvailable(this.currentRegularSpacesAvailable - 3);
        }
    }

    public void parkCar(){
        if(this.currentRegularSpacesAvailable == 1){
            setSpaceForCar(false);
            setCurrentRegularSpacesAvailable(this.currentRegularSpacesAvailable - 1);
        }else {
            setCurrentRegularSpacesAvailable(this.currentRegularSpacesAvailable - 1);
        }
    }

    public void parkMotorcycle(){
        if(this.currentRegularSpacesAvailable + this.currentMotorcycleSpacesAvailable == 1){
            setSpaceForMotorcycle(false);
            if(this.currentRegularSpacesAvailable == 1){
                setCurrentRegularSpacesAvailable(this.currentRegularSpacesAvailable -1);
            }else{
                setCurrentMotorcycleSpacesAvailable(this.currentMotorcycleSpacesAvailable - 1);
            }
        }else{
            if (this.currentMotorcycleSpacesAvailable > 0){
                setCurrentMotorcycleSpacesAvailable(this.currentMotorcycleSpacesAvailable - 1);
            }else{
                setCurrentRegularSpacesAvailable(this.currentRegularSpacesAvailable - 1);
            }
        }
    }

}
