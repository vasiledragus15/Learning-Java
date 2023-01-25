package GuessGame;
import java.util.Random;

class Player {

    public int number = 0;

    public void guess() {
         Random random = new Random();
        number = random.nextInt(10);
        System.out.println("I'm guessing " + number);
    }


    
}
