package Exercises;


public class Mytime {

    private int hour;
    private int minute;

    public Mytime(int hour, int minute) {

        if (hour >= 0 && hour <= 23 &&
                minute >= 0 && minute <= 59) {

            this.hour = hour;
            this.minute = minute;

        } else {
            this.hour = 0;
            this.minute = 0;
        }
    }

    public String twelveClock() {

        int h = hour;
        String ampm = "am";

        if (h >= 12) {
            ampm = "pm";
        }

        if (h > 12) {
            h = h - 12;
        }

        if (h == 0) {
            h = 12;
        }

        return h + ":" + String.format("%02d", minute) + ampm;
    }

    public String twentyFourClock() {
        return String.format("%02d:%02d", hour, minute);
    }
}

