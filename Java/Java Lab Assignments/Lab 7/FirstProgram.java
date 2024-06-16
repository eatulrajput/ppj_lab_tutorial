class TimeFormat {
    private int hour;
    private int minutes;
    private int seconds;

    public TimeFormat() { // Constructor 1 -- default
        hour = minutes = seconds = 0;
    }

    public TimeFormat(int h) { // Constructor 2
        hour = h;
        minutes = seconds = 0;
    }

    public TimeFormat(int h, int m) { // Constructor 3
        hour = h;
        minutes = m;
        seconds = 0;
    }

    public TimeFormat(int h, int m, int s) { // Constructor 4
        hour = h;
        minutes = m;
        seconds = s;
    }

    void displayTime() {
        System.out.printf("%02d:%02d:%02d\n", hour, minutes, seconds);
        System.out.println("----------------");
    }
}

class FirstProgram {
    public static void main(String[] args) {
	System.out.println("Name: Atul Rajput__158");
	System.out.println();
        TimeFormat t1 = new TimeFormat();
        TimeFormat t2 = new TimeFormat(12);
        TimeFormat t3 = new TimeFormat(14, 30);
        TimeFormat t4 = new TimeFormat(18, 45, 30);

        t1.displayTime();
        t2.displayTime();
        t3.displayTime();
        t4.displayTime();
    }
}
