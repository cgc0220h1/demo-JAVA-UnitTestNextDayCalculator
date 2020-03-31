public class NextDayCalculator {

    public static final int END_OF_FEBRUARY = 28;
    public static final int DAY_INCREASE = 1;
    public static final int BEGIN_DAY_OF_MONTH = 1;
    public static final int END_MONTH_OF_YEAR = 12;
    public static final int BEGIN_MONTH_OF_YEAR = 1;
    public static final int MONTH_INCREASE = 1;
    public static final int YEAR_INCREASE = 1;

    public static int[] findNextDay(int day, int month, int year) {
        int dayResult;
        int monthResult;
        int yearResult;
        if (day < END_OF_FEBRUARY) {
            dayResult = day + DAY_INCREASE;
            monthResult = month;
        } else {
            dayResult = BEGIN_DAY_OF_MONTH;
            monthResult = month + MONTH_INCREASE;
        }
        if (month < END_MONTH_OF_YEAR) {
            yearResult = year;
        } else {
            monthResult = BEGIN_MONTH_OF_YEAR;
            yearResult = year + YEAR_INCREASE;
        }
        return new int[]{dayResult, monthResult, yearResult};
    }
}
