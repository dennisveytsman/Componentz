import java.util.ArrayList;

/**
 * Interface for BirdRecord.
 */
public interface BirdRecord extends BirdRecordKernel {

    /**
     * @param color
     * @return all species of birds of given color
     */
    ArrayList<String> birdsOfAFeather(String color);

    /**
     * @param location
     * @return number of birds in given location
     */
    int birdsInArea(String location);

    /**
     * @param bird
     * @return info of bird formatted into sentences.
     */
    static String informationOfBird(Bird bird) {
        return "This bird is a " + bird.species() + ". It is the color "
                + bird.color() + ", and is located in " + bird.location() + ".";
    }
}
