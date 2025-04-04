import java.util.LinkedList;
import java.util.List;

/**
 * Abstract class BirdRecordSecondary.
 */
public abstract class BirdRecordSecondary implements BirdRecord {

    List<Bird> BIRDS;

    // CHECKSTYLE: ALLOW THIS METHOD TO BE OVERRIDDEN
    @Override
    public List<String> birdWatcher(String species) {
        List<String> birbLocations = new LinkedList<>();

        for (Bird bird : this.BIRDS) {
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
        for (Bird bird : this.BIRDS) {
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

        for (Bird bird : this.BIRDS) {
            if (bird.color().equals(color)) {
                birbs.add(bird);
            }
        }

        return birbs;
    }
}
