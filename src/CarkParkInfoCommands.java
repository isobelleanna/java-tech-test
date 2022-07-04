public class CarkParkInfoCommands extends Commands{
    public CarkParkInfoCommands() {
        super(new String[]{"Total spots remaining", "Total parking spots", "Spots taken up by vans"}, "info");
    }

    @Override
    public void run() {
        printGreeting("the Car Park Info");
        printCommands();
        int userInput = getCommandInput();
        if(userInput == 1){
            int total = ParkingLot.getCarSpacesByIndex(0).getCurrentRegularSpacesAvailable() + ParkingLot.getCarSpacesByIndex(0).getCurrentMotorcycleSpacesAvailable();
            printMessage("\nRegular Spaces: " + ParkingLot.getCarSpacesByIndex(0).getCurrentRegularSpacesAvailable() +
                    "\nMotorcycle Spaces: " + ParkingLot.getCarSpacesByIndex(0).getCurrentMotorcycleSpacesAvailable() +
                    "\ntotal: " + total);
        }else {
            setNextCommands("home");
        }
    }
}
