public class SimpleDotComGameTestDrive {
    public static void main (String[] args) {
        SimpleDotComGame dot = new SimpleDotComGame();
        int[] locations = {2,3,4};
        dot.setLocationsCells(locations);

        String userGuest = "2";
        String result = dot.checkYourSelf(userGuest);
        String testResult = "failed";
        if(result.equals("hit")) {
            testResult = "passed";
        }
        System.out.println(testResult);
    }
}
