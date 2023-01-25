package StartupGame;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GameHelper {
    private static final String ALPHABET = "abcdefg";
    private static final int GRID_LENGTH = 7;
    private static final int GRID_SIZE = 49;
    private static final int MAX_ATTEMPTS = 200;
    static final int HORIZONTAL_INCREMENT = 1;
    static final int VERTICAL_INCREMENT = GRID_LENGTH;

    private final int[] grid = new int[GRID_SIZE];
    private final Random random = new Random();
    private int startupCount = 0;

    public String getUserInput(String prompt) {
        System.out.println(prompt + ": ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().toLowerCase();
    }
    public ArrayList<String> placeStartup(int startupSize) {
        int[] startupCoords = new int[startupSize];
        int attempts = 0;
        boolean success = false;
        startupCount++;
        int increment = getIncrement();

        while(!success & attempts++ < MAX_ATTEMPTS ) {
            int location = random.nextInt(GRID_SIZE);
            for(int i = 0; i < startupCoords.length; i++) {
                startupCoords[i] = location;
                location = location + increment;
            }
            if(startupFits(startupCoords, increment)) {
                success = coordsAvaibile(startupCoords);
            }
        }
    savePositionToGrid(startupCoords);
    ArrayList<String> alphaCells = convertCoordToAlphaFormat (startupCoords);
    return alphaCells;
    }
    private boolean startupFits(int[] startupCoords, int increment) {
        int finalLocation = startupCoords[startupCoords.length - 1];
        if(increment == HORIZONTAL_INCREMENT) {
            return calcRowFromIndex(startupCoords[0]) == calcRowFromIndex(finalLocation);
        } else {
            return finalLocation < GRID_SIZE;
        }
    }
    private boolean coordsAvaibile(int[] startupCoords) {
        for(int coord : startupCoords) {
            if (grid[coord] != 0 ) {
                return false;
            }
        }
        return true;
    }
    private void savePositionToGrid(int[] startupCoords) {
        for(int index : startupCoords) {
            grid[index] = 1;
        }
    }
    private ArrayList<String> convertCoordToAlphaFormat(int[] startupCoords) {
        ArrayList<String> alphaCells = new ArrayList<>();
        for(int index : startupCoords) {
            String alphaCoords = getAlpaCoordsFomrIndex(index);
            alphaCells.add(alphaCoords);
        }
        return alphaCells;
    }
    private String getAlpaCoordsFomrIndex(int index) {
        int row = calcRowFromIndex(index);
        int column = index % GRID_LENGTH;
        String letter = ALPHABET.substring(column, column + 1);
        return letter + row;
    }
    private int calcRowFromIndex(int index) {
        return index / GRID_LENGTH;
    }
    private int getIncrement() {
        if(startupCount % 2 == 0 ) {
            return HORIZONTAL_INCREMENT;
        } else {
            return VERTICAL_INCREMENT;
        }
    }
    
}
