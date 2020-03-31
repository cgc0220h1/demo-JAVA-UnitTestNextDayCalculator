public class NextDayCalculator {
    public static int[] findNextDay(int day, int month, int year) {
        int dayResult;
        int monthResult;
        int yearResult;
        if (day < 28) {
            dayResult = day + 1;
            monthResult = month;
        } else {
            dayResult = 1;
            monthResult = month + 1;
        }
        if (month < 12) {
            yearResult = year;
        } else {
            monthResult = 1;
            yearResult = year + 1;
        }
        return new int[]{dayResult, monthResult, yearResult};
    }
}
