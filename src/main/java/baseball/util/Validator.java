package baseball.util;

import static baseball.util.Constants.BALL_LENGTH;

import java.util.regex.Pattern;

public class Validator {
    private static final Pattern NUMBER_REGEX = Pattern.compile("^[1-9]+$");

    public static String getValidatedPlayerNumber(String playerNumber) {
        if (!isNumeric(playerNumber)) {
            throw new IllegalArgumentException(ExceptionMessage.NOT_NUMERIC.getMessage());
        }
        if (isInRange(playerNumber)) {
            throw new IllegalArgumentException(ExceptionMessage.NOT_IN_RANGE.getMessage());
        }
        if (isLengthThree(playerNumber)) {
            throw new IllegalArgumentException(ExceptionMessage.INVALID_LENGTH.getMessage());
        }
        return playerNumber;
    }

    private static boolean isLengthThree(String playerNumber) {
        return playerNumber.length() != BALL_LENGTH;
    }

    private static boolean isInRange(String playerNumber) {
        return !NUMBER_REGEX.matcher(playerNumber).matches();
    }

    private static boolean isNumeric(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException exception) {
            return false;
        }
    }
}