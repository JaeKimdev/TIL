public class Clock {
    private int hour;
    private int minute;
    private int second;

    //Constructors
    public Clock() {
        //initialize to default values
        hour = 0;
        minute = 0;
        second = 0;
    }

    /**
     * Valid integers for variables is in the range of 0 - 24
     */
    public void setTime(int h, int m, int s) {
        hour = ((h >= 0 && h < 24) ? h : 0);
        minute = ((m >= 0 && m < 60) ? m : 0);
        second = ((s >= 0 && s < 60) ? s : 0);
    }

    public void tick() {
        second = second + 1;
    }

    public void reset() {
        hour = 0;
        minute = 0;
        second = 0;
    }

    public void show() {
        if (second == 60) {
            second = 0;
            minute = minute + 1;
        }
        if (minute == 60) {
            minute = 0;
            hour = hour + 1;
        }
        if (hour == 24) {
            hour = 0;
        }

        System.out.println("The current time ==> " + hour + ":" + minute + ":" + second);
        System.out.println("Enter '1' to set the time.");
        System.out.println("Enter '2' to advance one second.");
        System.out.println("Enter '3' to reset the clock.");
        System.out.println("Enter '4' to quit");
    }

    //Mutator methods
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public String getCurrentTime() {
        return toString();
    }

}