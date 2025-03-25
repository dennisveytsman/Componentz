import java.util.ArrayList;

/**
 * Bird utility class.
 */
public class BirdRecord {

    //Secondary Methods
    /**
     * @param birds
     * @param color
     * @return all species of birds of given color
     */
    public static ArrayList<String> birdsOfAFeather(Bird[] birds,
            String color) {
        ArrayList<String> array = new ArrayList<String>();
        for (Bird i : birds) {
            if (i.getColor().equals(color)) {
                array.add(i.getSpecies());
            }
        }
        return array;
    }

    /**
     * @param birds
     * @param location
     * @return number of birds in given location
     */
    public static int birdsInArea(Bird[] birds, String location) {
        int num = 0;
        for (Bird i : birds) {
            if (i.getLocation().equals(location)) {
                num++;
            }
        }
        return num;
    }
}
