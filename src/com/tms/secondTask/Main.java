package com.tms.secondTask;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Создать коллекцию класса ArrayList со значениями имен всех студентов в группе
 * С помощью Stream'ов:
 * - Вернуть количество количество людей с вашим именем (вне зависимости от верхнего/нижнего регистра букв)
 * - Выбрать все имена, начинающиеся на "а" (вне зависимости от верхнего/нижнего регистра букв)
 * - Отсортировать и вернуть первый элемент коллекции или "Empty@, если коллекция пуста
 */

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Stas", "Kirill", "Vitaliy", "Alexandr", "Maria", "Anton", "Pavel", "Alina", "Dima"));
        System.out.println("Число моих имен в списке:");
        System.out.println(names.stream().filter(e -> e.equalsIgnoreCase("stas")).count());
        System.out.println("Все имена на 'А':");
        names.stream().filter(e -> e.toLowerCase().startsWith("a")).forEach(System.out::println);
        System.out.println("Первый элемент после сортировки: ");
        System.out.println(names.isEmpty() ? "Empty" : names.stream().sorted().findFirst().get());
    }
}
