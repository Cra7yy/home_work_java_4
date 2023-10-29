import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> fruits = new ArrayList<>();

    public void add(T fruit) {
        fruits.add(fruit);
    }

    public double getWeight() {
        double totalWeight = 0;
        for (T fruit : fruits) {
            totalWeight += fruit.getWeight();
        }
        return totalWeight;
    }

    public void move(Box<? super T> another) {
        if (this == another) {
            return;
        }
        another.fruits.addAll(this.fruits);
        this.fruits.clear();
    }

    public Iterator<T> iterator() {
        return fruits.iterator();
    }
}
