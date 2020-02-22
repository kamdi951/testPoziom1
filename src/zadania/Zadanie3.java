package zadania;

public class Zadanie3 {

    public static void main(String[] args) {

        //int ile = countLisc();
    }


    public static int countLisc(Węzeł<Integer> węzeł) {
        if (węzeł == null) {
            return 0;
        }
        int ile = 0;

        int prawy = countLisc(węzeł.getPrawy());
        if (węzeł.getLewy() != null || węzeł.getPrawy() != null) {
            ile++;
        }

        int lewy = countLisc(węzeł.getLewy());
        if (węzeł.getLewy() != null || węzeł.getPrawy() != null) {
            ile++;
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
