import java.util.Random;

/**
 * Racoon class
 * 
 * Represents a Racoon and its characteristics. Since a Racoon is an
 * animal, it extends the Animal class, and Racoon is also a scratcher so
 * it implements the Scratcher class.
 */
public class Raccoon extends Animal implements Scratcher {

    public Raccoon(String name, int age, float speed, AnimalSex sex) {
        super(AnimalType.SCRATCHER, name, age, 
              speed, sex, LivingEnvironment.FOREST);
    }


    /**
     * Express the racoon's ability to scratch something.
     * the things that racoon may scratch can including woods, 
     * trash can, and other animals.
     */
    @Override
    public void scratch() {
        String[] things = new String[]{"woods", "other animal", "trash can"};
        Random rand = new Random();
        int randomThing = rand.nextInt(things.length);
        System.out.println("scratching " + things[randomThing]);
    }
    

    /**
     * Express a racoon's ability to make a unique sound.
     * The racoon will make a random sound among the sounds that racoons can
     * make such as chitter, hiss, growl, purr
     */
    @Override
    public void sound() {
        String[] sounds = new String[]{"chitter", "hiss", "growl", "purr"};
        Random rand = new Random();
        int soundType = rand.nextInt(sounds.length);
        System.out.println("\"" + sounds[soundType] + "\"");
    }

} // end of Racoon
