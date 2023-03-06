package by.it.academy.hw9;

public class Pair<T, V> {
    private T First;
    private V Second;

    Pair(T First, V Second) {
        this.First = First;
        this.Second = Second;
    }


    public T getFirst() {
        return First;
    }

    public void setFirst(T First) {
        this.First = First;
    }

    public V getSecond() {
        return Second;
    }

    public void setSecond(V Second) {
        this.Second = Second;
    }

    public <T, V> Pair<T, V> changeSeats(Pair<T, V> ob) {
        return ob;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "First=" + First +
                ", Second=" + Second +
                '}';
    }

}

