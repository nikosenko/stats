package ru.netology.stats;

public class StatsService {

    public int sumSales(int[] sales) { //сумма
        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }

        return sum;
    }

    public int averageAmountAverageSales(int[] sales) { //среднее
        int sum = sumSales(sales);
        int average = sum / sales.length;

        return average;

    }

    public int minSales(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0; // номер месяца с макс продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальное
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int aboveAverageAmount(int[] sales) { //выше среднего
        int maxMonthSale = 0;
        int average = averageAmountAverageSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                maxMonthSale++;
            }
        }
        return maxMonthSale;


    }

    public int belowAverageAmount(int[] sales) { //ниже  среднего
        int minMonthSale = 0;
        int average = averageAmountAverageSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average)
                minMonthSale++;

        }
        return minMonthSale;
    }
}






