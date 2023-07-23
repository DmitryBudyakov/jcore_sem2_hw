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
        int shift = 2;
        int[] newArray = shifting(array, shift);
        System.out.println("Массив после сдвига на " + shift + " позиций:");
        System.out.println(Arrays.toString(newArray));
    }

    /**
     * Метод, сдвигающий массив на n ячеек
     *
     * @param array исходный массив
     * @param shift  шаг сдвига
     * @return возвращает сдвинутый массив int[]
     */
    public static int[] shifting(int[] array, int shift) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int newIndex = (i + shift) % array.length;
            newArray[newIndex] = array[i];
        }
        return newArray;
    }
}
