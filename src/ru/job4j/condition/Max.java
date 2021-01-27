package ru.job4j.condition;

/**Данный класс мы используем в качестве примера.
 * Необходимо перегрузить метод max.
 * Перегрузка - это механизм, позволяющий создавать методы с
 * одинаковыми именами, но разными входными данными.
 */
public class Max {
    /**Например, здесь мы создали метод.
     * @param first первое число
     * @param second второе число
     * @return максимальное из двух
     */
    public int max(int first, int second) {
        return first > second ? first : second;
    }

    /**А здесь мы создали такой же метод, но уже для 3 чисел.
     * @param first
     * @param second
     * @param third третье число
     * @return максимальное из трёх.
     */
    public int max(int first, int second, int third) {
        return max(first,
                max(second, third));
    }

    public int max(int first, int second, int third, int fourth) {
        int temp = max(second, max(third, fourth));
        int rsl = max(first, temp);
        return rsl;
    }
}
