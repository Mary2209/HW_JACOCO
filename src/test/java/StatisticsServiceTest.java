import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;
import ru.netology.statistic.StatisticsService;

public class StatisticsServiceTest {

    @Test
    public void testCase1FindMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCase2FindMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {11, 5, 8, 4, 5, 3, 8, 6, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }
}