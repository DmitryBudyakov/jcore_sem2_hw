/*
    Задача 2
    Написать метод «Шифр Цезаря», с булевым параметром зашифрования и расшифрования и числовым ключом
 */
package ru.gb.jcore.sem2.homework;

public class Task2 {
    public static void main(String[] args) {
        String rawText = "Hello world!";
        int key = 5;
        System.out.println("Исходный текст:");
        System.out.println(rawText);

        System.out.println("Зашифрованный текст:");
        String encryptedText = ceasar(rawText,key,true);
        System.out.println(encryptedText);

        System.out.println("Расшифрованный текст:");
        String decryptedText = ceasar(encryptedText,key,false);
        System.out.println(decryptedText);
    }

    /**
     * Метод возвращает строку строку, закодированную/раскодированную по коду Цезаря с ключом int
     * @param text Исходный текст
     * @param key Ключ, значение int
     * @param encrypt true - кодирование, false - декодирование
     * @return Возвращается строка кодированного/декодированного текста
     */
    public static String ceasar(String text, int key, boolean encrypt) {
        if (text == null || text.isEmpty()) return null;

        int len = text.length();
        char[] out = new char[len];
        for (int i = 0; i < len; ++i) {
            out[i] = (char) (text.charAt(i) + ((encrypt) ? key : -key));
        }
        return new String(out);
    }
}
