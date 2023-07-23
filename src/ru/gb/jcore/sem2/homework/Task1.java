/*
    Задача 1
    Сортировка подсчетом через промежуточный массив
 */
package ru.gb.jcore.sem2.homework;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[]{5, -1, 4, 3, 0, 5, -8, 2, 0, 6};
        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(array));

        System.out.println("Отсортированный массив:");
        int[] sortedArray = sortByCount(array);
        System.out.println(Arrays.toString(sortedArray));
    }


    /**
     * Метод возвращает отсортированный массив типа int[]
     * @param array исходный массив
     * @return отсортированный массив
     */
    public static int[] sortByCount(int[] array) {
        int min = getMinMax(array)[0];
        int max = getMinMax(array)[1];

        // создание промежуточного массива, заполненного нулями
        int[] temp = new int[max - min + 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = 0;
        }

        // заполнение промежуточного массива
        int offset = min;
        for (int i = 0; i < array.length; i++) {
            temp[array[i] - offset]++;
        }

        // заполнение исходного массива по повторам на индексах в промежуточном массиве
        int k = 0;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] != 0) {
                for (int j = 0; j < temp[i]; j++) {
                    array[k++] = i + offset;
                }
            }
        }
        return array;
    }

    /**
     * Метод возвращает значения min и max в массиве типа int[]
     * @param array массив
     * @return возвращает int[] со значениями min и max
     */
    public static int[] getMinMax(int[] array) {
        int[] minMax = new int[2];
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) min = array[i];
            if (array[i] > max) max = array[i];
        }
        minMax[0] = min;
        minMax[1] = max;
        return minMax;
    }
}
