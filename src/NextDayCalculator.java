public class NextDayCalculator {
    public static int[] findNextDay(int day, int month, int year) {
        int dayResult = 0;
        int monthResult = 0;
        int yearResult = 0;
        if (day < 31) {
            dayResult = day + 1;
        } else {
            dayResult = 1;
        }
        if (day < 31) {
            monthResult = month;
        } else {
            monthResult = month + 1;
        }
        yearResult = year;
        return new int[]{dayResult, monthResult, yearResult};
    }
}
