import java.util.Random;

/**
 * Cat class
 * 
 * Since cat is an animal, it extends the Animal class.
 * Furthermore, cat is also a scratcher and a domesticated animal,
 * the class also implements Scratcher and Domesticated.
 */
public class Cat extends Animal implements Scratcher, Domesticated {

    /**
     * Constructor for the Cat class
     * @param name  : name of the cat
     * @param age   : age of the cat
     * @param speed : speed of the cat
     * @param sex   : sex of the cat
     */
    public Cat(String name, int age, float speed, AnimalSex sex) {
        super(AnimalType.SCRATCHER, name, age, 
              speed, sex, LivingEnvironment.HOME);
    }
    


    /**
     * Express the cat's ability to sratch.
     * The cat will randomly scratch an object in the house,
     * such as table leg, pillow, TV
     */
    @Override
    public void scratch() {
        String[] things = new String[]{"TV", "table leg", "pillow"};
        Random rand = new Random();
        int randomThing = rand.nextInt(things.length);
        System.out.println("scratching " + things[randomThing]);
    }

    

    /**
     * Express the cat's ability to walk.
     * The cat will randomly walk toward a room in the house
     * including bed room, living room, kitchen.
     */
    @Override
    public void walk() {
        String[] rooms = new String[]{"bedroom", "living room", "kitchen"};
        Random rand = new Random();
        int randomRoom = rand.nextInt(rooms.length);
        System.out.println("walking to " + rooms[randomRoom]);
    }



    /**
     * Express how the cat would greet its owner.
     * The cat will perform a random action to greet the human.
     * The actions include nose-touching, allogrooming, and head rubbing.
     */
    @Override
    public void greetHuman() {
        String[] actions = new String[]{"touching nose", "allogroom", "rubbing head"};
        Random rand = new Random();
        int randomAction = rand.nextInt(actions.length);
        System.out.println(actions[randomAction] + " to greet human!");
    }


    
    /**
     * Express the cat's ability to make a unique sound.
     * The cat will make a random sound among the sounds that cats can
     * make such as meow, hiss.
     */
    @Override
    public void sound() {
        String[] sounds = new String[]{"meow", "hiss"};
        Random rand = new Random();
        int randomSound = rand.nextInt(sounds.length);
        System.out.println("\"" + sounds[randomSound] + "\"");
    }

} // end of Cat
