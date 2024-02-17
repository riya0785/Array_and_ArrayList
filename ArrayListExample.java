package com.apnacollege;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        // Convert array to ArrayList
        String[] array = {"apple", "banana", "orange"};
        List<String> arrayList = convertArrayToArrayList(array);

        // Print the ArrayList
        System.out.println("ArrayList: " + arrayList);

        // Convert ArrayList to array
        String[] newArray = convertArrayListToArray(arrayList);

        // Print the array
        System.out.println("Array: " + Arrays.toString(newArray));
    }

    // Method to convert array to ArrayList
    private static <T> List<T> convertArrayToArrayList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }

    // Method to convert ArrayList to array
    private static <T> T[] convertArrayListToArray(List<T> arrayList) {
        T[] array = arrayList.toArray(Arrays.copyOf(arrayList.toArray(), 0));
        return array;
    }
}

