import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Kernel implementation.
 *
 * Convention:
 *
 * Correspondence:
 */
public class BirdRecord1L extends BirdRecordSecondary {
    /**
     * List of birds.
     */
    private List<Bird> birds;

    /**
     * Constructor.
     */
    public BirdRecord1L() {
        this.birds = new LinkedList<>();
    }

    // CHECKSTYLE: ALLOW THIS METHOD TO BE OVERRIDDEN
    @Override
    public void addBird(Bird b) {
        assert b != null : "Violation of: bird != null";
        this.birds.add(b);
    }

    // CHECKSTYLE: ALLOW THIS METHOD TO BE OVERRIDDEN
    @Override
    public Bird removeAnyBird() {
        assert this.birds.size() > 0 : "Violation of: birds is not empty";
        return this.birds.remove(0); // remove first bird in list
    }

    // CHECKSTYLE: ALLOW THIS METHOD TO BE OVERRIDDEN
    @Override
    public int numberOfBirds() {
        return this.birds.size();
    }

    // CHECKSTYLE: ALLOW THIS METHOD TO BE OVERRIDDEN
    @Override
    public boolean containsBird(Bird bird) {
        assert bird != null : "Violation of: bird != null";
        return this.birds.contains(bird);
    }

    // CHECKSTYLE: ALLOW THIS METHOD TO BE OVERRIDDEN
    @Override
    public Iterator<Bird> iterator() {
        return this.birds.iterator();
    }

    // CHECKSTYLE: ALLOW THIS METHOD TO BE OVERRIDDEN
    @Override
    public BirdRecord1L newInstance() {
        return new BirdRecord1L();
    }

    // CHECKSTYLE: ALLOW THIS METHOD TO BE OVERRIDDEN
    @Override
    public void clear() {
        this.birds.clear();
    }

    // CHECKSTYLE: ALLOW THIS METHOD TO BE OVERRIDDEN
    @Override
    public void transferFrom(BirdRecord that) {
        assert that != null : "Violation of: that != null";
        assert that instanceof BirdRecord1L : "that is of dynamic type BirdRecord1L";

        BirdRecord1L thatCopy = (BirdRecord1L) that;
        this.birds = thatCopy.birds;
        thatCopy.birds = new LinkedList<>();
    }
}
