package zadania;

import java.util.Arrays;

public class Zadanie4 {
    public static void main(String[] args) {
        int[] ints = {5, 2, 4, 8, 9, 7};
        for (int i = 0; i <= (ints.length - 2) / 2; i++) {
            int temp = ints[i];
            ints[i] = ints[ints.length - 1 - i];
            ints[ints.length - 1 - i] = temp;
            System.out.println(Arrays.toString(ints));
        }
    }
}

