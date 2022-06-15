package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void ShouldSum() {
        StatsService service = new StatsService();
        long[] stats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.sum(stats);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ShouldAvg() {
        StatsService service = new StatsService();
        long[] stats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.avg(stats);
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldMinSales() {
        StatsService service = new StatsService();
        long[] stats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.minSales(stats);
        long expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SholdMaxSales() {
        StatsService service = new StatsService();
        long[] stats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.maxSales(stats);
        long expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldMinAvg() {
        StatsService service = new StatsService();
        long[] stats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.minAvg(stats);
        long expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldAboveAvg() {
        StatsService service = new StatsService();
        long[] stats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.aboveAvg(stats);
        long expected = 5;
        Assertions.assertEquals(expected, actual);
    }


}
