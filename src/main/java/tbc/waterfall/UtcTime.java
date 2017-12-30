package tbc.waterfall;

public class UtcTime extends TimeSubject{
    private int utcZeroTime = 0;

    public int getUtcZeroTime() {
        return utcZeroTime;
    }

    public void setUtcZeroTime(int utcZeroTime) {
        this.utcZeroTime = utcZeroTime;
        notifyAllClocks();
    }
    @Override
    public void notifyAllClocks(){
        for(Clock clock:super.clocks.values()){
            clock.setLocalTime(Clock.toLocalTime(this.utcZeroTime));
        }
    }

    public void printTimeOfAllClocks() {
        for(String clockName:super.clocks.keySet()){
            System.out.println(clockName + ": "+ super.clocks.get(clockName).getTime());
        }
    }
}
