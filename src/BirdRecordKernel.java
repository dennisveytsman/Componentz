import components.sequence.Sequence;
import components.sequence.Sequence1L;

/**
 * BirdRecordKernel interface.
 */
public interface BirdRecordKernel extends Sequence<String> {

    /**
     * Birds.
     */
    Sequence<Bird> BIRDS = new Sequence1L<>();

    /**
     * Bird record.
     *
     * @param species
     * @param color
     * @param location
     */
    public record Bird(String species, String color, String location) {

    }

    /**
     * Adds bird to BIRDS.
     *
     * @param b
     */
    void addBird(Bird b);

}
