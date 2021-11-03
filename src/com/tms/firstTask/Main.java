package com.tms.firstTask;

import java.util.ArrayList;
import java.util.OptionalDouble;


/**
 * Создать коллекцию класса ArrayList наполнить ее элементами рандомными элементами типа Integer.
 * С помощью Stream'ов:
 * - Удалить дубликаты
 * - Вывести все четные элементы в диапазоне от 7 до 17 (включительно)
 * - Каждый элемент умножить на 2
 * - Отсортировать и вывести на экран первых 4 элемента
 * - Вывести количество элементов в стриме
 * - Вывести среднее арифметическое всех чисел в стриме
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Убрали повторы:");
        removeDuplicate();
        System.out.println("Четные от 7 до 17:");
        getFromRange();
        System.out.println("Все элементы на x2:");
        xTwoElements();
        System.out.println("Первые четрые:");
        sortLimit();
        System.out.println("Число элементов:");
        numOfElements();
        System.out.println("Среднее арифметическое:");
        getAverage();
    }

    static ArrayList<Integer> List = arrayListInitialization();

    public static void removeDuplicate() {
        List.stream()
                .distinct()
                .forEach(x -> System.out.print(x + " "));
        System.out.println();
    }

    public static void getFromRange() {
        List.stream()
                .filter(x -> x >= 7 && x <= 17)
                .filter(x -> (x % 2) == 0)
                .forEach(x -> System.out.print(x + " "));
        System.out.println();
    }

    public static void xTwoElements() {
        List.stream()
                .map(x -> x * 2)
                .forEach(x -> System.out.print(x + " "));
        System.out.println();
    }

    public static void sortLimit() {
        List.stream()
                .sorted()
                .limit(4)
                .forEach(x -> System.out.print(x + " "));
        System.out.println();
    }

    public static void numOfElements() {
        System.out.println(List.stream().count());
    }

    public static void getAverage() {
        OptionalDouble average = List.stream()
                .mapToInt(x -> x).average();
        if (average.isPresent()) {
            System.out.println(average.getAsDouble());
        }
    }

    private static ArrayList<Integer> arrayListInitialization() {
        ArrayList<Integer> myList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            myList.add((int) (Math.random() * 20));
        }
        System.out.println("Исходный список : " + myList);
        return myList;
    }
}
