import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    private int min;
    private int dif;

    public Randoms(int min, int max) {
        this.random = new Random();
        this.min = min;
        this.dif = max - min;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return random.nextInt(dif) + min;
            }
        };
    }


}