package zadania;

public class Zadanie8 {
    public static void main(String[] args) {
        int[] tablica = new int[6];
        tablica[0] = -1;
        tablica[1] = 2;
        tablica[2] = 3;
        tablica[3] = 4;
        tablica[4] = -2;
        tablica[5] = 10;

        int dlugosc = tablica.length;
        int suma = 0;
        int ostatni = 0;

        for (int i = 0; i < dlugosc-1; i++) {

            if (tablica[i] + 1 == tablica[i + 1]) {
                suma += tablica[i];
                ostatni = tablica[i + 1];
                System.out.println(suma);
            }
        }
        suma += ostatni;
        System.out.println(suma);
    }
}
