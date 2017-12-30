package tbc.waterfall;

public class Clock {
    private final int UTC_OFFSET = 0;
    private int localTime = 0;

    public void setLocalTime(int localTime){
        this.localTime = localTime;
    }
}
