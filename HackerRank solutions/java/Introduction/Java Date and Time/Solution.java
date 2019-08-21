/* You are given a date. You just need to write the method, getDay, which returns the day on that date.
 *
 * The problem specifies that 2000 < year < 3000; rather than using LocalDate I wrote a solution that counts the days
 * from January 01 2019.
 */

class Result {
    private static final String[] DAYS = {"FRIDAY", "SATURDAY", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY"};
    private static final int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] monthsLeap = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static String findDay(int month, int day, int year) {
        int days = 0;

        for (int i = 2000; i < year; i++) {
            if (isLeapYear(i)) days += 366;
            else days += 365;
        }
 
        boolean leap = isLeapYear(year);

        for (int i = 0; i < month - 1; i++) {
            days += (leap) ? monthsLeap[i] : months[i];
        }
        
        days += day;
        return DAYS[days % 7];
    }

    static boolean isLeapYear(int year) {
        return (year % 400 == 0 || year % 100 != 0 && year % 4 == 0);
    }
}
