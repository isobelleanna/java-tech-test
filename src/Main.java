public class Main {
    public static void main(String[] args) {
        System.out.println(CarPark.getCarPark());
        HomeCommands homeCommands = new HomeCommands();
        Commands currentCommands = homeCommands;
        boolean isActive = true;
        while(isActive){
            switch (currentCommands.getNextCommands()) {
                case "home":
                    currentCommands = new HomeCommands();
                    currentCommands.run();
                    isActive = false;
                default:
                    isActive = false;
            }
        }
    }
}