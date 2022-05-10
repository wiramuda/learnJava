package simpledotcomgame;

public class SimpleDotCom {
    private int[] locationsCells;
    private int numOfHits;
    void setLocationsCells(int[] locations) {
        locationsCells = locations;
    }

    String checkYourSelf(String userGuest) {
        int guest = Integer.parseInt(userGuest);
        String result = "miss";
        for (int cell : locationsCells) {
            if(cell == guest) {
                result = "hit";
                numOfHits++;
                break;
            }
        }
        if(numOfHits == locationsCells.length) {
            result = "kill";
        }
        System.out.println(result);
        return result;
    }
}
