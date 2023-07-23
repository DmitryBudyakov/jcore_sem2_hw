/*
    Задача 3
    Написать метод, принимающий на вход массив чисел и параметр n. Метод должен осуществить циклический
    (последний элемент при сдвиге становится первым) сдвиг всех элементов массива на n позиций
 */
package ru.gb.jcore.sem2.homework;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[]{0, 1, 2, 3};
        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(array));
        int step = 1;
        int[] newArray = shifting(array, step);
        System.out.println("Массив после сдвига на " + step + " позиций:");
        System.out.println(Arrays.toString(newArray));
    }

    /**
     * Метод, сдвигающий массив на n ячеек
     *
     * @param array исходный массив
     * @param step  шаг сдвига
     * @return возвращает сдвинутый массив int[]
     */
    public static int[] shifting(int[] array, int step) {
        int[] newArray = new int[array.length];
        int maxIndex = array.length;
        for (int i = 0; i < array.length; i++) {
            int newIndex = i + step;
            if (newIndex >= maxIndex) {
                newIndex = newIndex - maxIndex;
            }
            newArray[newIndex] = array[i];
        }
        return newArray;
    }
}
