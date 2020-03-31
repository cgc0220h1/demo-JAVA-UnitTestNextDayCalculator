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
}