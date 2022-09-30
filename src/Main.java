public class Main {
    public static void main(String[] args) {
        long[] sumSales = {15, 25, 30, 107, 75, 100};// массив количества продаж
        SalesManager salesManager = new SalesManager(sumSales);
        System.out.println("Максимальное количество продаж:");
        System.out.println(salesManager.max());
    }
}
