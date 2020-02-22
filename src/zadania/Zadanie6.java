package zadania;


import java.util.Arrays;

public class Zadanie6 {
    public static void main(String[] args) {
        int[] ints = {5, 2, 4, 8, 9, 7};
        int temp;
        for (int i = 0; i < ints.length - 1; i++) {
            for (int j = i + 1; j < ints.length; j++) {
                if (ints[i] > ints[j]) {
                    temp = ints[j];
                    ints[j]=ints[i];
                    ints[i]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(ints));
    }
}
