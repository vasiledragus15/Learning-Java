package PhraseOMatic;
import java.util.Random;

public class PhraseOMatic{
    public static void main(String[] args){
        String[] wordListOne = {"agnostic", "opinionated", "voice ativated", "haptically driven", "extensible", "reactive", "agent based", "funcional", "AI enabled", "strongly typed"};
        String [] wordListTwo = {"loosly coupled", "six sigma", "asynchronous", "event driven", "pub-sub", "IoT", "cloud native", "service oriented", "containerized", "serverless", "microservices", "distributed ledger"};
        String [] wordListThree = {"framework", "library", "DSL", "REST API", "repository", "pipeline", "service", "mesh", "architecture", "perspective", "design", "orientation"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        Random randomGenerator = new Random();
        int rand1 = randomGenerator.nextInt(oneLength);
        int rand2 = randomGenerator.nextInt(twoLength);
        int rand3 = randomGenerator.nextInt(threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        System.out.println(phrase);
    }
}