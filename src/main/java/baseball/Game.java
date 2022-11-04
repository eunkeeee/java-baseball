package baseball;

public class Game {

    static final int NUMBER_LENGTH = 3;
    public Game() {
    }
    public void play() {
        RandomNumber computer = new RandomNumber();
        UserNumber user = new UserNumber();

        // get random number from computer
        computer.getRandomNumber();
        int randomNumber = computer.randomNumber;

        while(true) {
            // get user number from user
            user.setUserNumber();
            int userNumber = user.getUserNumber();

            int strike = 0;
            int ball = 0;

            String[] randomNumberArr = String.valueOf(randomNumber).split("");
            String[] userNumberArr = String.valueOf(userNumber).split("");

            // calculate strike
            for(int i=0; i<NUMBER_LENGTH; i++) {
                if(randomNumberArr[i].equals(userNumberArr[i])) {
                    strike++;
                }
            }
            System.out.println(strike + " 스트라이크");
        }
    }

    // method for testing
    int strike(String randomNumber, String userNumber) {
        int strike = 0;
        int ball = 0;

        String[] randomNumberArr = String.valueOf(randomNumber).split("");
        String[] userNumberArr = String.valueOf(userNumber).split("");

        // calculate strike
        for(int i=0; i<NUMBER_LENGTH; i++) {
            if(randomNumberArr[i].equals(userNumberArr[i])) {
                strike++;
            }
        }
        return strike;
    }
}


