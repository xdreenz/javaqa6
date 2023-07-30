package ru.netology.stats;

public class StatsService {
    public long getSalesSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long getAverageSale(long[] sales) {
        return (getSalesSum(sales) / sales.length);
    }

    public int getMaxSalesMonth(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int getMinSalesMonth(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int getBelowAvgSalesMonths(long[] sales) {
        long avgSale = getAverageSale(sales);
        int months = 0;
        for (long sale : sales) {
            if (sale < avgSale) {
                months++;
            }
        }
        return months;
    }

    public int getAboveAvgSalesMonths(long[] sales) {
        long avgSale = getAverageSale(sales);
        int months = 0;
        for (long sale : sales) {
            if (sale > avgSale) {
                months++;
            }
        }
        return months;
    }
}
