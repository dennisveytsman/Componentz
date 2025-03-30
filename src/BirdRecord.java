import java.util.ArrayList;

import components.sequence.Sequence;
import components.sequence.Sequence1L;

/**
 * Bird utility class.
 */
public class BirdRecord {

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
     * Sequence which holds all the birds.
     */
    private Sequence<Bird> birds;

    /**
     * Constructor.
     */
    public BirdRecord() {
        this.birds = new Sequence1L<>();
    }

    /**
     * Adds bird to birds.
     *
     * @param b
     */
    public void addBird(Bird b) {
        this.birds.add(0, b);
    }

    //Secondary Methods
    /**
     * @param color
     * @return all species of birds of given color
     */
    public ArrayList<String> birdsOfAFeather(String color) {
        ArrayList<String> array = new ArrayList<String>();
        for (Bird i : this.birds) {
            if (i.color().equals(color)) {
                array.add(i.species());
            }
        }
        return array;
    }

    /**
     * @param location
     * @return number of birds in given location
     */
    public int birdsInArea(String location) {
        int num = 0;
        for (Bird i : this.birds) {
            if (i.location().equals(location)) {
                num++;
            }
        }
        return num;
    }

    //Static method
    /**
     * @param bird
     * @return info of bird formatted into sentences.
     */
    public static String informationOfBird(Bird bird) {
        return "This bird is a " + bird.species() + ". It is the color "
                + bird.color() + ", and is located in " + bird.location() + ".";
    }

    //Main Method
    /**
     * @param args
     */
    public static void main(String[] args) {
        BirdRecord birds = new BirdRecord();

        Bird bird = new Bird("Robin", "Red", "Illinois");
        System.out.println(bird.color());
        System.out.println(informationOfBird(bird));

        Bird bird2 = new Bird("Cardinal", "Red", "Ohio");

        birds.addBird(bird2);
        birds.addBird(bird);

        ArrayList<String> redBirds = new ArrayList<String>();
        redBirds = birds.birdsOfAFeather("Red");
        System.out.println("Birds that are red: ");
        for (String str : redBirds) {
            System.out.println(str);
        }
        System.out.println(
                "Number of birds in Ohio: " + birds.birdsInArea("Ohio"));
    }
}
