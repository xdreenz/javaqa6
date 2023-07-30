package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    void shouldGetSalesSum() {
        StatsService statsService = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = statsService.getSalesSum(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldGetAverageSale() {
        StatsService statsService = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        long actual = statsService.getAverageSale(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldGetMaxSalesMonth() {
        StatsService statsService = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        long actual = statsService.getMaxSalesMonth(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldGetMinSalesMonth() {
        StatsService statsService = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        long actual = statsService.getMinSalesMonth(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldGetBelowAvgSalesMonths() {
        StatsService statsService = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = statsService.getBelowAvgSalesMonths(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldGetAboveAvgSalesMonths() {
        StatsService statsService = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = statsService.getAboveAvgSalesMonths(sales);
        Assertions.assertEquals(expected, actual);
    }

}
