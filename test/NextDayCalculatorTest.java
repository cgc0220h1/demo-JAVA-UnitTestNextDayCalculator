import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {
    @DisplayName("Test with day 1 month 1 year 2018")
    @Test
    void testFindNextDayCase1() {
        int day = 1;
        int month = 1;
        int year = 2018;
        int expectedDay = 2;
        int expectedMonth = 1;
        int expectedYear = 2018;
        int[] expectedResult = {expectedDay,expectedMonth,expectedYear};
        int[] actualResult = NextDayCalculator.findNextDay(day,month,year);
        assertArrayEquals(expectedResult,actualResult);
    }

    @DisplayName("Test with day 31 month 1 year 2018")
    @Test
    void testFindNextDayCase2() {
        int day = 31;
        int month = 1;
        int year = 2018;
        int expectedDay = 1;
        int expectedMonth = 2;
        int expectedYear = 2018;
        int[] expectedResult = {expectedDay,expectedMonth,expectedYear};
        int[] actualResult = NextDayCalculator.findNextDay(day,month,year);
        assertArrayEquals(expectedResult,actualResult);
    }

    @DisplayName("Test with day 30 month 4 year 2018")
    @Test
    void testFindNextDayCase3() {
        int day = 30;
        int month = 4;
        int year = 2018;
        int expectedDay = 1;
        int expectedMonth = 5;
        int expectedYear = 2018;
        int[] expectedResult = {expectedDay,expectedMonth,expectedYear};
        int[] actualResult = NextDayCalculator.findNextDay(day,month,year);
        assertArrayEquals(expectedResult,actualResult);
    }

    @DisplayName("Test with day 28 month 2 year 2018")
    @Test
    void testFindNextDayCase4() {
        int day = 28;
        int month = 2;
        int year = 2018;
        int expectedDay = 1;
        int expectedMonth = 3;
        int expectedYear = 2018;
        int[] expectedResult = {expectedDay,expectedMonth,expectedYear};
        int[] actualResult = NextDayCalculator.findNextDay(day,month,year);
        assertArrayEquals(expectedResult,actualResult);
    }
}