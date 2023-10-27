package org.example.Java6;
public class MonthSales {

    public int minSales(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int summarySales(int[] sales) {
        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public int monthSalesMiddle(int[] sales) {
        int sum = 0;
        int middle = 0;

        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
            middle = sum / 12;
        }
        return middle;
    }

    public int maxMonthSale(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int monthHigherMiddle(int[] sales) {
        int count = 0;
        int sum = 0;
        int middle = 0;

        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
            middle = sum / 12;
        }

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > middle) {
                count++;
            } else continue;
        }
        return count;
    }

    public int monthUnderMiddle(int[] sales) {
        int count = 0;
        int m = monthSalesMiddle(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < m) {
                count++;
            } else continue;
        }
        return count;
    }
}


