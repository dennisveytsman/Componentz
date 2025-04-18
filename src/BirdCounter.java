import components.birdrecord.Bird;
import components.birdrecord.BirdRecord;
import components.birdrecord.BirdRecord1L;

/**
 * Use case for BirdRecord component.
 */
public class BirdCounter {

    /**
     * Record.
     */
    private BirdRecord record;

    /**
     * Constructor.
     */
    public BirdCounter() {
        this.record = new BirdRecord1L();
    }

    /**
     * Adds the observed bird to the record.
     *
     * @param b
     */
    public void observe(Bird b) {
        this.record.addBird(b);
    }

    /**
     * Returns how many birds have been counted.
     *
     * @param location
     * @return number of birds in area
     */
    public int countBirdsIn(String location) {
        return this.record.birdsInArea(location);
    }

    /**
     * Returns information of each bird.
     */
    public void report() {
        for (Bird b : this.record) {
            System.out.println(this.record.informationOfBird(b));
        }
    }
}
