import java.util.Scanner;

public class Playgame {
 
   StartGame gamestartnumber = new StartGame();
   int startnumber = gamestartnumber.startgame();

   int chanses = 5;
   
   public void playgame() throws Exception{

    System.out.println("Number is between 1-11 \nEnter your guess");
    try (Scanner scan01 = new Scanner(System.in)) {
        for(int i=1; i<=5; i++){
            int userinput = scan01.nextInt();
            if (userinput==startnumber){
                System.out.println("YOU WON");
                
            }
            else if(i==5){
                System.out.println("You failed");
                System.out.println("Type \'1\' to Restrat the Game");
                try (Scanner scan02 = new Scanner(System.in)) {
                    int restartinput = scan02.nextInt();
                    int expectedinputtorestart = 1;

                    if(restartinput==expectedinputtorestart){
                        System.out.println("Finishes");
                        new App();
                        App.main(null);;
                    }
                    else{
                         System.out.println(expectedinputtorestart);
                         System.out.println(restartinput);
                         System.out.println("GAME OVER");                
                     }
                }
            }
            else{
                System.out.println(" YOU HAVE ONLY "+ (5-i) +" CHANSES");
            }

        }
    }


   
    
    
    










   }


}
