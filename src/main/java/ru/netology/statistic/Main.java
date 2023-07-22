package ru.netology.statistic;

public class Main {
    public static void main(String[] args) {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {1, 2, 3, 40, 5, 3, 8, 6, 11, 11, 12};

        long result = service.findMax(incomesInBillions);

        System.out.println(result);
    }
}
