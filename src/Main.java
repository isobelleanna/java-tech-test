public class Main {
    public static void main(String[] args) {
        System.out.println(CarPark.getCarPark());
        System.out.println(CarSpaces.getIsSpaceForCar());
        System.out.println(CarSpaces.getIsSpaceForVan());
        System.out.println(CarSpaces.getIsSpaceForMotorcycle());

        HomeCommands homeCommands = new HomeCommands();
        Commands currentCommands = homeCommands;
        boolean isActive = true;
        while(isActive){
            switch (currentCommands.getNextCommands()) {
                case "home":
                    currentCommands = new HomeCommands();
                    currentCommands.run();
                    break;
                case "park":
                    currentCommands = new ParkCommands();
                    currentCommands.run();
                    break;
                case "info":
                    currentCommands = new CarkParkInfoCommands();
                    currentCommands.run();
                    break;
                default:
                    isActive = false;
            }
        }
    }
}