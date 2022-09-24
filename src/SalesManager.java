public class SalesManager {
    protected int[] sales;

    //конструктор
    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    //функция, возвращающая максимальное значение в заданном массиве
    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
}
