import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Создайте массив фиксированной длины, добавьте туда на два элемента больше,
        //проследите за итогом работы программы. Тип массива - любой.
        int[] array = new int[5];
        array [0] = 1;
        array [1] = 3;
        array [2] = 5;
        array [3] = 7;
        array [4] = 9;
        array [5] = 11;

        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }


    }
}