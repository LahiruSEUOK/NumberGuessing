import java.util.Random;

public class StartGame {

    private int randomnumber;

    public int startgame(){
        
        Random random = new Random();
        randomnumber = random.nextInt(11);
        System.out.println("Number Generated\nGame Started");
        return randomnumber;
    }


    
}
