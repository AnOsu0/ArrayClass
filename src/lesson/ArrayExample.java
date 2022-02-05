package lesson;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        String[] names = {"Basia", "Kasia", "Wojtek", "Agnieszka", "Kacper"};
        Integer[] numbers = {4, 7, 2, 1, 14, 23, 10, 5};

        System.out.println("Names:");
//        printInfo(names);
        System.out.println(Arrays.toString(names));

        System.out.println("Numbers:");
//        printInfo(numbers);
        System.out.println(Arrays.toString(numbers));

        String[] copyOfNames = Arrays.copyOf(names,names.length);
        Integer[] copyOfNumbers = Arrays.copyOf(numbers,numbers.length);

        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println(Arrays.equals(numbers, copyOfNumbers));

        String[] strings = new String[5];
        Arrays.fill(strings,"Wacek");
        printInfo(strings);

    }

    public static <T> void printInfo(T[] t) {
        for (T t1 : t) {
            System.out.print(t1 + " ");
        }
        System.out.println();
    }
}
