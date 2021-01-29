package ru.job4j.max;

public class Reduce {
    private int[] array;

    /**Вот здесь, чтобы исправить положение, можно было либо использовать
     * this (для ссылки на переменную экземпляра текущего класса),
     * либо изменить имя аргумента array на что-нибудь другое (например arra и внести правки далее по коду),
     * либо изменить имя переменной поля объекта.
     */
    public void to(int[] array) {
        this.array = array;
    }

    public void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);;
        }
    }

    public static void main(String[] args) {
        int[] array = {1 ,2, 3};
        Reduce reduce = new Reduce();
        reduce.to(array);
        reduce.print();
    }
}
