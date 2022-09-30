public class SalesManager {
    protected long[] sales;

    //конструктор
    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    //функция, возвращающая максимальное значение в заданном массиве
    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
}
