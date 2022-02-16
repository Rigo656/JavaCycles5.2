package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int calculateAvg(int[] sales) {
        return calculateSum(sales) / sales.length;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month += +1;
        }
        return minMonth + 1;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month += +1;
        }
        return maxMonth + 1;
    }

    public int belowAvg(int[] sales) {
        int average = calculateAvg(sales);
        int monthBelowAvg = 0;
        for (int sale : sales) {
            if (sale < average) {
                monthBelowAvg += +1;
            }
        }
        return monthBelowAvg;
    }

    public int aboveAvg(int[] sales) {
        int average = calculateAvg(sales);
        int monthBelowAvg = 0;
        for (int sale : sales) {
            if (sale > average) {
                monthBelowAvg += +1;
            }
        }
        return monthBelowAvg;
    }
}


