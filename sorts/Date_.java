package sorts;


import java.util.Random;

public class Date_ implements Comparable<Date_>{
    private int day;
    private int month;
    private int year;

    public Date_ (int day, int month, int year) {
        int[] rules = {0, 31,28,30,31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (year%4==0) rules[2]++;
        if (month > 12 || month < 1 || day < 1 || day > rules[month]) {
            throw new IllegalArgumentException("Invalid!");
        }
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date_ () {
        // RANDOM DATE
        int[] rules = {0, 31,28,30,31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Random r = new Random();
        month = r.nextInt(12)+1;
        day = r.nextInt(rules[month]) + 1;
        year = r.nextInt(50)+1970;
    }

    public Date_ (String rusDate) {
        // 26 января 1970
    }


    public String toString() {
        String[] names = {
                "нулября",
                "января",
                "февраля",
                "марта",
                "апреля",
                "мая",
                "июня",
                "июля",
                "августа",
                "сентября",
                "октября",
                "ноября",
                "декабря",
        };
        return day + " " + names[month] + " " + year;
    }

    public int getDay() {
        return day;
    }
    public int getMonth() {
        return day;
    }
    public int getYear() {
        return day;
    }

    @Override
    public int compareTo(Date_ that) {
        if (this.year>that.year) return +1;
        if (this.year<that.year) return -1;
        if (this.month>that.month) return +1;
        if (this.month<that.month) return -1;
        if (this.day>that.day) return +1;
        if (this.day<that.day) return -1;
        return 0;
    }
}
