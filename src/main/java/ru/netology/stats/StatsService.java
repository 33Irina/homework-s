package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result += sale;
        }
        return result;
    }

    public long average(long[] sales) {
        return sum(sales) / sales.length;

    }

    public int maximum(long[] sales) {
        int maximumMonth = 0;
        long maximumSales = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maximumSales) {
                maximumSales = sales[i];
                maximumMonth = i;


            }

        }
        return maximumMonth + 1;

    }

    public int minimum(long[] sales) {
        int minimumMonth = 0;
        long minimumSales = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= minimumSales) {
                minimumSales = sales[i];
                minimumMonth = i;


            }

        }
        return minimumMonth + 1;
    }

    public int bellowAverage(long[] sales) {
        long averageSale = average(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale < average(sales)) {
                counter++;
            }
        }
        return counter;
    }

    public int aboveAverage(long[] sales) {
        long averageSale = average(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;
            }
        }

        return counter;
    }
}

