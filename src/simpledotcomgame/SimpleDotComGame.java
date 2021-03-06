package simpledotcomgame;

import java.util.Scanner;

public class SimpleDotComGame {
    private static int numOfGuesses;
    public static void main(String[] args) {
        SimpleDotCom dotCom = new SimpleDotCom();
        GameHelper helper = new GameHelper();
        int randomLocation = (int) (Math.random()*5);
        int[] locationsCell = {randomLocation,randomLocation+1,randomLocation+2};
        dotCom.setLocationsCells(locationsCell);
        boolean isAlive = true;
        while(isAlive) {
            String userQuest = helper.getUserInput("enter a number: ");
            String result = dotCom.checkYourSelf(userQuest);
            numOfGuesses++;
            if(result.equals("kill")) {
                isAlive = false;
                System.out.println("you took "+numOfGuesses+ " guesses");
            }
        }
    }
}
