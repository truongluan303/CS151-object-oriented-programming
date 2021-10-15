import java.util.Random;

/**
 * Whale class
 * 
 * Represents a whale and its characteristics. Since a whale
 * is an animal, it extends Animal class. And since a whale
 * lives in water, it also implements Swimmer class. 
 */
public class Whale extends Animal implements Swimmer {

    /**
     * Constructor for Whale class
     * @param name  : name of the whale
     * @param age   : age of the whale
     * @param speed : speed of the whale
     * @param sex   : sex of the whale
     */
    public Whale(String name, int age, float speed, AnimalSex sex) {
        super(AnimalType.SWIMMER, name, age, 
              speed, sex, LivingEnvironment.OCEAN);
    }


    /**
     * Express the whale's ability to swim. Since whales live
     * everywhere among the world's oceans, the whale can pick a random
     * ocean to swim in.
     */
    @Override
    public void swim() {
        String[] locations = new String[]{"Pacific", "Atlantic", "Indian", "Artic"};
        Random rand = new Random();
        int randomLocation = rand.nextInt(locations.length);
        System.out.println("swimming in the " + locations[randomLocation] + " ocean");
    }



    /**
     * Express a whale's ability to make a unique sound.
     * The whale will make a random sound among the sounds that whales can
     * make such as thwops, groans, grunts.
     */
    @Override
    public void sound() {
        String[] sounds = new String[]{"thwops", "groans", "grunts"};
        Random rand = new Random();
        int soundType = rand.nextInt(sounds.length);
        System.out.println("\"" + sounds[soundType] + "\"");
    }
    
} // end of Whale
