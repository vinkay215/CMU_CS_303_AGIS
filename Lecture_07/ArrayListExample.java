package Lecture_01;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {
        
        ArrayList<String> friends = new ArrayList<>();
        friends.add("Vinh");
        friends.add("Ngan");
        friends.add("Linh");
        friends.add("Thuong");
        friends.add("Thao");
        
        System.out.println("Friends List: " + friends);

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }
        
        numbers.remove(Integer.valueOf(5));
        System.out.println("List after removing 5: " + numbers);

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Ha Noi");
        cities.add("TP. Ho Chi Minh");
        cities.add("Da Nang");
        cities.add("Hue");
        cities.add("Can Tho");

        System.out.println("Cities List:");
        for (String city : cities) {
            System.out.println(city);
        }

        ArrayList<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("JavaScript");
        
        boolean containsPython = languages.contains("Python");
        System.out.println("Is Python in the list? " + containsPython);

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        
        integers.set(2, 100);
        System.out.println("Updated List: " + integers);

        ArrayList<Integer> numbersToSort = new ArrayList<>();
        numbersToSort.add(5);
        numbersToSort.add(3);
        numbersToSort.add(8);
        numbersToSort.add(2);
        numbersToSort.add(4);
        
        Collections.sort(numbersToSort);
        System.out.println("Sorted List: " + numbersToSort);

        ArrayList<Integer> listToConvert = new ArrayList<>();
        listToConvert.add(1);
        listToConvert.add(2);
        listToConvert.add(3);
        listToConvert.add(4);
        listToConvert.add(5);
        
        Integer[] array = new Integer[listToConvert.size()];
        listToConvert.toArray(array);
        
        System.out.println("Array elements:");
        for (Integer num : array) {
            System.out.println(num);
        }
    }
}

