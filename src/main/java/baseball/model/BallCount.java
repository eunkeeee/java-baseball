package baseball.model;

public enum BallCount {
    STRIKE("스트라이크", true, true),
    BALL("볼", true, false),
    NOTHING("낫싱", true, false);

    private final String display;
    private final boolean hasCommonNumber;
    private final boolean isInSamePosition;

    BallCount(String display, boolean hasCommonNumber, boolean isInSamePosition) {
        this.display = display;
        this.hasCommonNumber = hasCommonNumber;
        this.isInSamePosition = isInSamePosition;
    }

}
