import java.util.List;
import java.util.Objects;

public class Store {
    private final List<String> fruit;
    private final List<String> lactat;

    public Store(List<String> fruit, List<String> lactat) {
        this.fruit = fruit;
        this.lactat = lactat;
    }

    public List<String> getFruit() {
        return fruit;
    }

    public List<String> getLactat() {
        return lactat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Store store = (Store) o;
        return Objects.equals(fruit, store.fruit) &&
                Objects.equals(lactat, store.lactat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fruit, lactat);
    }

    @Override
    public String toString() {
        return "Store{" +
                "fruit=" + fruit +
                ", lactat=" + lactat +
                '}';
    }
}
