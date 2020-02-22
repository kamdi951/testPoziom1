package zadania;

import java.util.Scanner;

public class Zadanie2 {

    public static void main(String[] args) {

        int[] tablX = new int[50];
        int[] tablY = new int[50];

        tablX[0] = 0;
        tablY[0] = 0;
        int i = 1;
        kolejnyKrok(0, 0, 1, tablX, tablY);
    }

    public static void kolejnyKrok(int x, int y, int i, int[] tablX, int[] tablY) {
        Scanner sc = new Scanner(System.in);
        String str;

        System.out.print("Wpisz P/L/G/D/K: ");
        str = sc.nextLine();

        switch (str) {
            case "P":
                x++;
                break;
            case "L":
                x--;
                break;
            case "G":
                y++;
                break;
            case "D":
                y--;
                break;
        }
        if (!str.equals("K")) {
            if (i > 2 && tablX[i-1] == tablX[i - 3] && tablY[i-1] == tablY[i - 3]) {
                i--;
            } else {
                tablX[i] = x;
                tablY[i] = y;
                i++;
            }
            System.out.println("Współrzędne postaci: [" + x + "," + y + "]");
            kolejnyKrok(x, y, i, tablX, tablY);
        } else {
            for (int k = 0; k < i; k++) {
                System.out.println("[" + tablX[k] + "," + tablY[k] + "]");
            }
        }
    }
}
