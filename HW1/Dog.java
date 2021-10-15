import java.util.Random;

/**
 * Dog class
 * 
 * Represents a dog and its characteristics. Since a dog is an
 * animal, it extends the Animal class, and dog is also a pet so
 * it implements the Domesticated class. Furthermore, Dogs class
 * also have the unique abilities of a dog such as barking.
 */
public class Dog extends Animal implements Domesticated {

    /**
     * The Constructor for Dog class
     * @param name  : the name of the dog
     * @param age   : the age of the dog
     * @param speed : the speed of the dog
     * @param sex   : the sex of the dog
     */
    public Dog(String name, int age, float speed, AnimalSex sex) {
        super(AnimalType.DOMESTICATED, name, age, 
              speed, sex, LivingEnvironment.HOME);
    }



    /**
     * Express the dpg's ability to walk.
     * The dog will randomly walk toward a room in the house
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
     * Express how a dog would greet human.
     * The dog will perform a random action to greet the human.
     * The actions include wagging tail or licking
     */
    @Override
    public void greetHuman() {
        String[] actions = new String[]{"wagging tail", "licking"};
        Random rand = new Random();
        int action = rand.nextInt(actions.length);
        System.out.println(actions[action] + " to greet human!");
    }



    /**
     * Express the dog's ability to make a unique sound.
     * The dog will make a random sound among the sounds that dogs can
     * make such as woofing, ruffing, or arfing.
     */
    @Override
    public void sound() {
        String[] sounds = new String[]{"woof woof", "ruff ruff", "arf arf"};
        Random rand = new Random();
        int soundType = rand.nextInt(sounds.length);
        System.out.println("\"" + sounds[soundType] + "\"");
    }



    /**
     * Express the dog's ability to bark at strangers as a way 
     * that dogs protect themselves and their owners
     */
    public void bark() {
        System.out.println("barking at a stranger!!!");
    }
    
} // end of Dog
