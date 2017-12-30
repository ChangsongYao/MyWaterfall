package tbc.waterfall;

public class Clock {
    protected static int UTC_OFFSET = 0;
    protected int localTime = 0;

    public Clock(int utcOffset){
        this.UTC_OFFSET = utcOffset;
    }

    public void setLocalTime(int localTime){
        this.localTime = localTime;
    }

    public int toLocalTime(int utcZeroTime) {
        return utcZeroTime + UTC_OFFSET;
    }

    public String getTime() {
        return String.valueOf(this.localTime);
    }
}
