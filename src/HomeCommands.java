public class HomeCommands extends Commands{
    public HomeCommands() {
        super(new String[]{"Park a Vehicle", "Get Carpark Info", "Quit"}, "home");
    }

    @Override
    public void run() {
        printGreeting("the Car Park");
        printCommands();
        int userInput = getCommandInput();
        if(userInput == 1){
            setNextCommands("park");
        } else if (userInput == 2) {
            setNextCommands("info");
        }else {
            setNextCommands("");
        }

    }


}
