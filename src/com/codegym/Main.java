package com.codegym;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        String[] array = {"donut", "moon cake", "birthday cake", "pudding"};
        System.out.println(" Mảng ban đầu ");
        for (String element : array) {
            System.out.println(element);
        }
        String[] newArray = addNewElementToArray(array, 1, "bread");
        System.out.println("mảng sau khi thêm");
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
        System.out.println("mảng sau khi xóa");
        String[] newArray2 = removeElementFromArray(array, 3);
        for (int i = 0; i < newArray2.length; i++) {
            System.out.println(newArray2);
        }
    }

    public static String[] addNewElementToArray(String[] array, int index, String value) {
        String[] newArray = new String[array.length + 1];
        for (int i = 0; i < newArray.length; i++) {
            if (i < index) {
                newArray[i] = array[i];
            } else if (i == index) {
                newArray[i] = value;
            } else {
                newArray[i] = array[i - 1];
            }
        }
        return newArray;
    }

    public static String[] removeElementFromArray(String[] array, int index) {
        String[] newArray = new String[array.length - 1];
        for (int i = 0; i < newArray.length; i++) {
            if (i < index) {
                newArray[i] = array[i];
            } else {
                newArray[i] = array[i + 1];
            }
        }
        return newArray;
    }
}