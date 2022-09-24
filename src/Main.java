public class Main {
    public static void main(String[] args) {
        int[] sumSales = {15, 25, 30, 100};// массив количества продаж
        SalesManager salesManager = new SalesManager(sumSales);
        System.out.println("Максимальное количество продаж:");
        salesManager.max();
    }
}
