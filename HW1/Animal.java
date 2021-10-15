/**
 * Represents the type of animal, including
 * swimmers, domesticated, or scratcher.
 */
enum AnimalType {
    SWIMMER,
    DOMESTICATED,
    SCRATCHER
} // end of AnimalType


/**
 * Represents the sex of the animal, including
 * male or female.
 */
enum AnimalSex {
    MALE,
    FEMALE
} // end of AnimalSex


/**
 * Represents the types of living environments
 * that the animals live in, including ocean,
 * forest, or home with human.
 */
enum LivingEnvironment {
    OCEAN,
    FOREST,
    HOME
} // end of LivingEnvironment



/**
 * Animal class
 * 
 * Represents an animal and its characteristics including
 * animal type, name, age, sex, speed, and living environment.
 * The animal can also perform a few actions such as moving,
 * eating, making sound, sleeping.
 */
public class Animal {
    private AnimalType animalType;
    private String animalName;
    private int age;
    private AnimalSex sex;
    private LivingEnvironment environment;
    private float speed;

    
    /**
     * Constructor for Animal class
     * @param type        : type of animal
     * @param name        : animal's name
     * @param age         : animal's age
     * @param speed       : animal's moving speed
     * @param sex         : animal's sex
     * @param environment : animal's living environment
     */
    public Animal(AnimalType type, String name, int age, float speed,
                  AnimalSex sex, LivingEnvironment environment) {
        this.animalType  = type;
        this.animalName  = name;
        this.age         = age;
        this.sex         = sex;
        this.environment = environment;
        this.speed       = speed;
    }


    /**
     * Express the animal's ability to move
     */
    public void move() {
        System.out.print("moving with the speed of ");
        System.out.println(String.format("%.2f", speed) + " m/s");
    }


    /**
     * Express the animal's ability to make a sound
     */
    public void sound() {
        System.out.println("making animal sound");
    }


    /**
     * Express the animal's ability to eat
     */
    public void eat() {
        System.out.println("eating...");
    }


    /**
     * Express the animal's ability to sleep
     */
    public void sleep() {
        System.out.println("sleeping...");
    }


    /**
     * overrided toString() method.
     * This method will return the string that represents the
     * charcteristics of the animal.
     */
    @Override
    public String toString() {
        return (
            "Animal Type       : " + animalType.toString().toLowerCase() + "\n" +
            "Animal Name       : " + animalName + "\n" +
            "Age               : " + age + "\n" +
            "Sex               : " + sex.toString().toLowerCase() + "\n" +
            "Living Environment: " + environment.toString().toLowerCase() + "\n" +
            "Moving Speed      : " + String.format("%.2f", speed) + " mph"
        );
    }


    public AnimalType getAnimalType() {
        return this.animalType;
    }

    public void setAnimalType(AnimalType animalType) {
        this.animalType = animalType;
    }

    public String getAnimalName() {
        return this.animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public AnimalSex getSex() {
        return this.sex;
    }

    public void setSex(AnimalSex sex) {
        this.sex = sex;
    }

    public LivingEnvironment getEnvironment() {
        return this.environment;
    }

    public void setEnvironment(LivingEnvironment environment) {
        this.environment = environment;
    }

    public float getSpeed() {
        return this.speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

} // end of Animal