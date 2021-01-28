package ru.job4j.condition;

import java.lang.Math;
import java.text.DecimalFormat;

/**А что в этом задании является цельным объектом?
 * Цельным объектом здесь будет точка в системе координат.
 * То есть объект, который содержит координаты x и y.
 * Поля это переменные принадлежащие конкретному объекту.
 */
public class PointM {

    /**Создадим поле для объекта "точка".
     * Оно (поле) будет принадлежать конкретному объекту.
     * Данное поле будет содержать в себе значение - одну из координат.
     */
    private int x;

    /**Создадим поле для объекта "точка".
     * Оно (поле) будет принадлежать конкретному объекту.
     * Данное поле будет содержать в себе значение - одну из координат.
     * Private - это модификатор доступа. Он определяет, откуда может быть прочитана и записана переменная.
     */
    private int y;

    /**Добавим еще одно поле класса. Данное поле будет заполнено значением одной из координат.
     * Это будет третья координата.
     */
    private int z;

    /**Создали конструктор. Данный класс (PointM) описывает точку.
     * Теперь у наших объектов есть входные параметры - координаты х и у.
     */
    public PointM(int first, int second) {
        this.x = first;
        this.y = second;
    }

    /**Создадим новый конструктор, который принимает 3 координаты.*/
    public PointM(int first, int second, int third) {
        this.x = first;
        this.y = second;
        this.z = third;
    }

    /**Создадим метод, который будет принимать объект типа PointM.
     * С помощью метода мы будем обращаться к тем или иным объектам
     * с нужными координатами.*/
    public double distance(PointM endpoint) {
        double rsl = Math.sqrt((Math.pow((endpoint.x - this.x), 2) + Math.pow((endpoint.y - this.y), 2)));
        return rsl;
    }

    /**Создадим еще один метод, который будет искать расстояние между точками,
     * но уже в трехмерном пространстве.
     * @param endpoint объект класса PointM. В нашем случае - это конечная точка,
     *                 расстояние до которой нужно найти.
     * @return значение расстояния типа double.
     */
    public double distance3d(PointM endpoint) {
        return Math.sqrt((Math.pow((endpoint.x - this.x), 2) + Math.pow((endpoint.y - this.y), 2)
                + Math.pow((endpoint.z - this.z), 2)));
    }

    /**Самый распространенный способ форматирования String.format().
     * %s - any type - Строковое значение.
     * https://hr-vector.com/java/formatirovanie-chisel-strok - more about the specifiers.
     */
    public void info() {
        System.out.println(String.format("Point[%s, %s]", this.x, this.y));
    }
    /**Продемонстрируем взаимодействие объектов.
     * Создадим 2 объекта (точки) с нужными координатами и
     * посчитаем расстояние между ними.
     */
    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        PointM begin = new PointM(0, 0);
        PointM end = new PointM(2, 0);
        double dist = begin.distance(end);
        String distdec = decimalFormat.format(dist);
        System.out.println("result (0,0) to (2,0) " + distdec);
    }
}
