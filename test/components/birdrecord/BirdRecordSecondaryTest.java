package components.birdrecord;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

/**
 * Test class for BirdRecordSecondary.
 */
public class BirdRecordSecondaryTest {

    /**
     * Test for birdWatcher.
     */
    @Test
    public void testBirdWatcher() {
        BirdRecord br = new BirdRecord1L();
        br.addBird(new Bird("robin", "red", "tree"));
        br.addBird(new Bird("robin", "red", "fence"));
        br.addBird(new Bird("sparrow", "brown", "roof"));

        List<String> locations = br.birdWatcher("robin");

        assertTrue(locations.contains("tree"));
        assertTrue(locations.contains("fence"));
        assertEquals(2, locations.size());
    }

    /**
     * Test for birdsInArea.
     */
    @Test
    public void testBirdsInArea() {
        BirdRecord br = new BirdRecord1L();
        br.addBird(new Bird("chicken", "white", "garden"));
        br.addBird(new Bird("crow", "black", "garden"));
        br.addBird(new Bird("goose", "brown", "sidewalk"));

        assertEquals(2, br.birdsInArea("garden"));
    }

    /**
     * Test for informationOfBird.
     */
    @Test
    public void testInformationOfBird() {
        Bird b = new Bird("chicken", "white", "road");
        BirdRecord br = new BirdRecord1L();
        String info = br.informationOfBird(b);

        assertEquals(
                "This bird is a chicken. It is the color white, and is located in road.",
                info);
    }

    /**
     * Test for birdsOfAFeather.
     */
    @Test
    public void testBirdsOfAFeather() {
        BirdRecord br = new BirdRecord1L();
        Bird b1 = new Bird("duck", "yellow", "pond");
        Bird b2 = new Bird("canary", "yellow", "cage");
        Bird b3 = new Bird("crow", "black", "weeping willow");

        br.addBird(b1);
        br.addBird(b2);
        br.addBird(b3);

        List<Bird> yellowBirds = br.birdsOfAFeather("yellow");

        assertEquals(2, yellowBirds.size());
        assertTrue(yellowBirds.contains(b1));
        assertTrue(yellowBirds.contains(b2));
    }
}
