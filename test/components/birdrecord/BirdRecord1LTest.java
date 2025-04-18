package components.birdrecord;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Test class for BirdRecord1L.
 */
public class BirdRecord1LTest {

    /**
     * Test for addBird.
     */
    @Test
    public void testAddBird() {
        BirdRecord br = new BirdRecord1L();
        Bird b = new Bird("sparrow", "brown", "park");
        br.addBird(b);
        assertEquals(1, br.numberOfBirds());
        assertTrue(br.containsBird(b));
    }

    /**
     * Test for addBird.
     */
    @Test
    public void testAddBird2() {
        BirdRecord br = new BirdRecord1L();
        Bird b = new Bird("chicken", "white", "farm");
        Bird b2 = new Bird("crow", "black", "weeping willow");
        br.addBird(b);
        br.addBird(b2);
        assertEquals(2, br.numberOfBirds());
        assertTrue(br.containsBird(b));
        assertTrue(br.containsBird(b2));
    }

    /**
     * Test for removeBird.
     */
    @Test
    public void testRemoveAnyBird() {
        BirdRecord br = new BirdRecord1L();
        Bird b = new Bird("crow", "black", "weeping willow");
        br.addBird(b);
        Bird removed = br.removeAnyBird();
        assertEquals(b, removed);
        assertEquals(0, br.numberOfBirds());
    }

    /**
     * Test for removeBird.
     */
    @Test
    public void testRemoveAnyBird2() {
        BirdRecord br = new BirdRecord1L();
        Bird b = new Bird("chicken", "white", "farm");
        Bird b2 = new Bird("crow", "black", "weeping willow");
        br.addBird(b);
        br.addBird(b2);
        Bird removed = br.removeAnyBird();
        assertEquals(1, br.numberOfBirds());
        assertEquals(false, br.containsBird(removed));
    }

    /**
     * Test for numberOfBirds.
     */
    @Test
    public void testNumberOfBirds() {
        BirdRecord br = new BirdRecord1L();
        assertEquals(0, br.numberOfBirds());

        br.addBird(new Bird("chicken", "white", "farm"));
        assertEquals(1, br.numberOfBirds());

        br.addBird(new Bird("crow", "black", "weeping willow"));
        assertEquals(2, br.numberOfBirds());
    }

    /**
     * Test for containsBird.
     */
    @Test
    public void testContains() {
        BirdRecord br = new BirdRecord1L();
        Bird b = new Bird("chicken", "white", "farm");
        Bird b2 = new Bird("crow", "black", "weeping willow");

        br.addBird(b);

        assertTrue(br.containsBird(b));
        assertEquals(false, br.containsBird(b2)); // was never added
    }

    /**
     * Test for clear.
     */
    @Test
    public void testClear() {
        BirdRecord br = new BirdRecord1L();
        br.addBird(new Bird("owl", "white", "forest"));
        br.clear();
        assertEquals(0, br.numberOfBirds());
    }

    /**
     * Test for transferFrom.
     */
    @Test
    public void testTransferFrom() {
        BirdRecord source = new BirdRecord1L();
        BirdRecord target = new BirdRecord1L();

        Bird b = new Bird("duck", "yellow", "pond");
        source.addBird(b);

        target.transferFrom(source);

        assertEquals(1, target.numberOfBirds());
        assertEquals(0, source.numberOfBirds());
        assertTrue(target.containsBird(b));
    }

    /**
     * Test for newInstance.
     */
    @Test
    public void testNewInstance() {
        BirdRecord br = new BirdRecord1L();
        BirdRecord newBr = br.newInstance();
        assertNotSame(br, newBr);
        assertEquals(0, newBr.numberOfBirds());
    }
}
