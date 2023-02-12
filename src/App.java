public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to the Game!");

        Instrctions printinstructions = new Instrctions();
        printinstructions.instrnctions();

        StartGame startgamenow = new StartGame();
        startgamenow.startgame();

        Playgame playgamenow = new Playgame();
        playgamenow.playgame();

    }

}
