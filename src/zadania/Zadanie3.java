package zadania;

public class Zadanie3 {

    public static void main(String[] args) {
        Węzeł<Integer> e = new Węzeł<>(24, null, null);
        Węzeł<Integer> d = new Węzeł<>(66, null, null);
        Węzeł<Integer> c = new Węzeł<>(8, null, null);
        Węzeł<Integer> b = new Węzeł<>(100, d, e);
        Węzeł<Integer> a = new Węzeł<>(1, c, null);
        Węzeł<Integer> korzen = new Węzeł<>(50, a, b);

        int ile = countLisc(korzen,0);
        System.out.println(ile);


    }


    public static int countLisc(Węzeł<Integer> węzeł,int ile) {
        if (węzeł == null) {
            return 0;
        }

        int prawy = countLisc(węzeł.getPrawy(),ile);
        if (węzeł.getPrawy() == null) {
            int lewy = countLisc(węzeł.getLewy(),ile);
            if (węzeł.getLewy() == null ) {
                ile++;
        }



//            ile++;
//            System.out.println("prawy "+ile);
//
//            int lewy = countLisc(węzeł.getLewy(),ile);
//            ile++;
//            System.out.println("lewy "+ile);
        }

        return ile;
    }
}
class Węzeł<T> {
    private T zawartość;
    private Węzeł<T> lewy;
    private Węzeł<T> prawy;

    public Węzeł(T zawartość, Węzeł<T> lewy, Węzeł<T> prawy) {
        this.zawartość = zawartość;
        this.lewy = lewy;
        this.prawy = prawy;
    }

    public T getZawartość() {
        return zawartość;
    }

    public void setZawartość(T zawartość) {
        this.zawartość = zawartość;
    }

    public Węzeł<T> getLewy() {
        return lewy;
    }

    public void setLewy(Węzeł<T> lewy) {
        this.lewy = lewy;
    }

    public Węzeł<T> getPrawy() {
        return prawy;
    }

    public void setPrawy(Węzeł<T> prawy) {
        this.prawy = prawy;
    }
}

class Licznik {
    Węzeł<Integer> węzeł;
    int głębkość;

    public Licznik(Węzeł<Integer> węzeł, int głębkość) {
        this.węzeł = węzeł;
        this.głębkość = głębkość;
    }
}
