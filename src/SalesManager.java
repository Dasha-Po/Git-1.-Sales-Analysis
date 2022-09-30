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

    //функция, возвращающая минимальное значение в заданном массиве
    public int min() {
        int min = sales[0];
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    // расчёт обрезанного среднего - это среднее количество продаж среди всех продаж,
    // за исключением самой максимальной и самой минимальной
    public int averageNum() {
        int result = 0;
        for (int sale : sales) {
            result += sale;
        }
        int max = max();
        int min = min();
        return (result - max - min) / (sales.length - 2);
    }
}
