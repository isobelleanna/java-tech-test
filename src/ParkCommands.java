public class ParkCommands extends Commands{
    public ParkCommands() {
        super(new String[]{"Park a Car","Park a Van", "Park a Motorcycle", "Go Back"}, "park");
    }

    @Override
    public void run() {
        printGreeting("the Parking Commands");
        printMessage("\nSpace Available for Cars: " + CarSpaces.getIsSpaceForCar() + "\nSpace Available for Vans: " +
                CarSpaces.getIsSpaceForVan() + "\nSpace Available for Motorcycle: " + CarSpaces.getIsSpaceForMotorcycle());
        printMessage("\nRegular Spaces: " + ParkingLot.getCarSpacesByIndex(0).getCurrentRegularSpacesAvailable() +
                "\nMotorcycle Spaces: " + ParkingLot.getCarSpacesByIndex(0).getCurrentMotorcycleSpacesAvailable());
        printCommands();
        int userInput = getCommandInput();
        if(userInput == 1){
            if (!CarSpaces.getIsSpaceForCar()){
                printMessage("Sorry, there is no space available.");
                setNextCommands("home");
            }else {
                ParkingLot.getCarSpacesByIndex(0).parkCar();
                printMessage("Car Parked");
                printMessage("\nRegular Spaces: " + ParkingLot.getCarSpacesByIndex(0).getCurrentRegularSpacesAvailable() +
                        "\nMotorcycle Spaces: " + ParkingLot.getCarSpacesByIndex(0).getCurrentMotorcycleSpacesAvailable());
            }
        }else if(userInput == 2) {
            if (!CarSpaces.getIsSpaceForVan()) {
                printMessage("Sorry, there is no space available.");
                setNextCommands("home");
            } else {
                ParkingLot.getCarSpacesByIndex(0).parkVan();
                printMessage("\nRegular Spaces: " + ParkingLot.getCarSpacesByIndex(0).getCurrentRegularSpacesAvailable() +
                        "\nMotorcycle Spaces: " + ParkingLot.getCarSpacesByIndex(0).getCurrentMotorcycleSpacesAvailable());
                printMessage("Van Parked");
            }
        }else if(userInput == 3) {
            if (!CarSpaces.getIsSpaceForMotorcycle()) {
                printMessage("Sorry, there is no space available.");
                setNextCommands("home");
            } else {
                ParkingLot.getCarSpacesByIndex(0).parkMotorcycle();
                printMessage("\nRegular Spaces: " + ParkingLot.getCarSpacesByIndex(0).getCurrentRegularSpacesAvailable() +
                        "\nMotorcycle Spaces: " + ParkingLot.getCarSpacesByIndex(0).getCurrentMotorcycleSpacesAvailable());
                printMessage("Motorcycle Parked");
            }
        }else {
            setNextCommands("home");
        }






//        printMessage("\nSpace Available for Cars: " + CarSpaces.getIsSpaceForCar + "\nSpace Available for Vans: " +
//                CarSpaces.isSpaceForVan + "\nSpace Available for Motorcycle: " + CarSpaces.isSpaceForMotorcycle);
//        int userInput = getCommandInput();
//        if(userInput == 1){
//            if(!CarPark.isSpaceForCar){
//                setNextCommands("home");
//            }else {
//                CarPark.parkCar();
//                printMessage("\nSpace Available for Cars: " + CarPark.isSpaceForCar + "\nSpace Available for Vans: " +
//                        CarPark.isSpaceForVan + "\nSpace Available for Motorcycle: " + CarPark.isSpaceForMotorcycle
//                + "\nRegular Spaces Available: ");
//
//            }
//        }else if(userInput == 2){
//            if(!CarPark.isSpaceForVan){
//                setNextCommands("home");
//            }else {
//                CarPark.parkVan();
//            }
//        }else if(userInput == 3){
//            if(!CarPark.isSpaceForMotorcycle){
//                setNextCommands("home");
//            }else {
//                CarPark.parkMotorcycle();
//            }
//        }
    }
}
