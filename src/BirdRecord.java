import java.util.List;

/**
 * Interface for BirdRecord.
 */
public interface BirdRecord extends BirdRecordKernel {

    /**
     * @param species
     * @requires species != null
     * @ensures a list of all locations of birds with given species is returned
     * @return locations of all birds that are of the given species
     */
    List<String> birdWatcher(String species);

    /**
     * @param location
     * @reqiures location != null
     * @ensures that the bird count in the given location is returned
     * @return number of birds in given location
     */
    int birdsInArea(String location);

    /**
     * @param bird
     * @requires bird != null
     * @ensures that formatted info about the bird is returned
     * @return formatted string of info of bird.
     */
    String informationOfBird(Bird bird);

    /**
     * @param color
     * @requires color != null
     * @ensures that a list of birds of the given color is returned
     * @return BIRDS that are of the given color.
     */
    List<Bird> birdsOfAFeather(String color);

}
