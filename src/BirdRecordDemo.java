import components.birdrecord.Bird;
import components.birdrecord.BirdRecord;
import components.birdrecord.BirdRecord1L;

/**
 * Use case for BirdRecord component.
 */
public final class BirdRecordDemo {

    /**
     * Constructor.
     */
    private BirdRecordDemo() {
    }

    /**
     * Main method for use case.
     *
     * @param args
     */
    public static void main(String[] args) {
        BirdRecord record = new BirdRecord1L();

        Bird b1 = new Bird("chicken", "white", "forest");
        Bird b2 = new Bird("crow", "black", "weeping willow");

        record.addBird(b1);
        record.addBird(b2);

        System.out.println("Total birds recorded: " + record.numberOfBirds());

        for (Bird b : record) {
            System.out.println(record.informationOfBird(b));
        }
    }
}
