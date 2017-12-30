package tbc.waterfall;

public class HotelWorldClocksRunner {
    public static void main(String[] args){
        UtcTime utcTime = new UtcTime();
        utcTime.attach("beijing",new CityClock(8));
        utcTime.attach("london",new CityClock(0));
        utcTime.attach("moscow",new CityClock(4));
        utcTime.attach("sydney",new CityClock(10));
        utcTime.attach("newyork",new CityClock(-5));

        PhoneClock phoneClock = new PhoneClock(8);

        phoneClock.setUtcTime(utcTime);

        phoneClock.setLocalTime(9);  //因为在setLocalTime的时候会让utcTime去调用设置方法；


        utcTime.printTimeOfAllClocks();

    }
}
