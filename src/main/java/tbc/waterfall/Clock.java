package tbc.waterfall;

public class Clock {
    protected int UTC_OFFSET = 0;
    protected int localTime = 0;

    public Clock(int utcOffset) {
        this.UTC_OFFSET = utcOffset;
    }

    public void setLocalTime(int localTime) {
        this.localTime = localTime;
    }

    public void setLocalTimeFromUtcZeroTime(int utcZeroTime) {
        this.localTime = Clock.makeHourWithin0To23(utcZeroTime + this.UTC_OFFSET);
    }

    private static int makeHourWithin0To23(int hour) {
        return (hour + 24) % 24;
    }

    public String getTime() {
        return String.valueOf(this.localTime);
    }
}
