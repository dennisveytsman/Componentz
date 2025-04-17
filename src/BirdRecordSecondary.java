import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Abstract class BirdRecordSecondary.
 */
public abstract class BirdRecordSecondary implements BirdRecord {

    // CHECKSTYLE: ALLOW THIS METHOD TO BE OVERRIDDEN
    @Override
    public List<String> birdWatcher(String species) {
        List<String> birbLocations = new LinkedList<>();

        for (Bird bird : this) {
            if (bird.species().equals(species)) {
                birbLocations.add(bird.location());
            }
        }

        return birbLocations;
    }

    // CHECKSTYLE: ALLOW THIS METHOD TO BE OVERRIDDEN
    @Override
    public int birdsInArea(String location) {
        int numBirds = 0;
        for (Bird bird : this) {
            if (bird.location().equals(location)) {
                numBirds++;
            }
        }

        return numBirds;
    }

    // CHECKSTYLE: ALLOW THIS METHOD TO BE OVERRIDDEN
    @Override
    public String informationOfBird(Bird bird) {
        return "This bird is a " + bird.species() + ". It is the color "
                + bird.color() + ", and is located in " + bird.location() + ".";
    }

    // CHECKSTYLE: ALLOW THIS METHOD TO BE OVERRIDDEN
    @Override
    public List<Bird> birdsOfAFeather(String color) {
        List<Bird> birbs = new LinkedList<>();

        for (Bird bird : this) {
            if (bird.color().equals(color)) {
                birbs.add(bird);
            }
        }

        return birbs;
    }

    // CHECKSTYLE: ALLOW THIS METHOD TO BE OVERRIDDEN
    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!(o instanceof BirdRecord)) {
            return false;
        }
        BirdRecord w = (BirdRecord) o;
        if (this.numberOfBirds() != w.numberOfBirds()) {
            return false;
        }
        Iterator<Bird> it1 = this.iterator();
        Iterator<?> it2 = w.iterator();
        while (it1.hasNext()) {
            Bird x1 = it1.next();
            Object x2 = it2.next();
            if (!x1.equals(x2)) {
                return false;
            }
        }
        return true;
    }

    //hashCode better implementation not necessary for BirdRecord
    // CHECKSTYLE: ALLOW THIS METHOD TO BE OVERRIDDEN
    @Override
    public int hashCode() {
        return System.identityHashCode(this);
    }

    // CHECKSTYLE: ALLOW THIS METHOD TO BE OVERRIDDEN
    @Override
    public String toString() {
        String str = "";
        int num = 1;
        for (Bird bird : this) {
            str += "Bird" + num + " is a " + bird.species()
                    + ". It is the color " + bird.color()
                    + ", and is located in " + bird.location() + ".";
            num++;
        }
        return str;
    }
}
