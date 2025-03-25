import java.util.ArrayList;

/**
 * Bird component.
 */
public class Bird {

   //Private variables
   /**
    * This is species variable.
    */
   private String species;
   /**
    * This is a color variable.
    */
   private String color;
   /**
    * This is a location variable.
    */
   private String location;

   //Kernel Methods
   /**
    * @param species
    * @param color
    * @param location
    */
   void birdInfo(String species, String color, String location) {
      this.species = species;
      this.color = color;
      this.location = location;
   }

   /**
    * @return species of the bird
    */
   String getSpecies() {
      return this.species;
   }

   /**
    * @return color of the bird
    */
   String getColor() {
      return this.color;
   }

   /**
    * @return location of the bird
    */
   String getLocation() {
      return this.location;
   }

   //Secondary Methods
   /**
    * @return info of bird formatted into sentences.
    */
   String informationOfBird() {
      return "This bird is a " + this.species + ". It is the color "
            + this.color + ", and is located in " + this.location + ".";
   }

   //Main Method
   /**
    * @param args
    */
   public static void main(String[] args) {
      Bird bird = new Bird();
      bird.birdInfo("Robin", "Red", "Illinois");
      System.out.println(bird.getColor());
      System.out.println(bird.informationOfBird());

      Bird bird2 = new Bird();
      bird2.birdInfo("Cardinal", "Red", "Ohio");

      Bird[] birds = { bird, bird2 };
      ArrayList<String> redBirds = new ArrayList<String>();
      redBirds = BirdRecord.birdsOfAFeather(birds, "Red");
      System.out.println("Birds that are red: ");
      for (String str : redBirds) {
         System.out.println(str);
      }
      System.out.println("Number of birds in Ohio: "
            + BirdRecord.birdsInArea(birds, "Ohio"));
   }
}
