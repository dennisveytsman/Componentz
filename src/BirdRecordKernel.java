import components.standard.Standard;

/**
 * BirdRecordKernel interface.
 */
public interface BirdRecordKernel extends Standard<BirdRecord> {

    /**
     * Adds bird to BIRDS.
     *
     * @param b
     * @requires bird != null
     * @ensures BIRDS = #BIRDS + b
     */
    void addBird(Bird b);

    /**
     * Removes bird from BIRDS.
     *
     * @requires BIRDS is not empty
     * @ensures BIRDS = #BIRDS - returned bird
     * @return removed bird
     */
    Bird removeAnyBird();

    /**
     * Returns number of birds in BIRDS.
     *
     * @ensures |BIRDS| is returned
     * @return length of BIRDS
     */
    int numberOfBirds();

    /**
     * Checks if BIRDS contains the specified bird.
     *
     * @param bird
     * @return if BIRDS contains the Bird
     * @requires bird != null
     * @ensures that true is returned if BIRDS contains bird, and false if bird
     *          is not in BIRDS
     */
    boolean containsBird(Bird bird);

    /**
     * Creates and returns a new instance of this type.
     *
     * @return a new BirdRecord with the same dynamic type as this
     * @ensures the returned BirdRecord is empty
     */
    @Override
    BirdRecord newInstance();

    /**
     * Clears this BirdRecord.
     *
     * @ensures this is empty
     */
    @Override
    void clear();

    /**
     * Transfers contents from one BirdRecord to another.
     *
     * @param that
     * @requires that is not null and of the same dynamic type as this
     * @ensures this = #that and that is empty
     */
    @Override
    void transferFrom(BirdRecord that);
}
