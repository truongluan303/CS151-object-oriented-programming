/**
 * AnimalTest class
 * 
 * This class is used to test Animal, Scratcher, Swimmer, Domesticated, 
 * Dog, Cat, Racoon, and Whale classes.
 * Instances of Dog, Cat, Racoon, Whale will be created and the information
 * about each instance will be printed out on the console.
 */
public class AnimalTest {
    public static void main(String[] args) {
        Dog dog = new Dog("Scooby Doo", 2, 40, AnimalSex.MALE);
        Cat cat = new Cat("Tom", 3, 30, AnimalSex.MALE);
        Raccoon raccoon = new Raccoon("Rocket", 4, 15, AnimalSex.MALE);
        Whale whale = new Whale("Moby", 50, 30, AnimalSex.FEMALE);

        callMethods(dog);
        dog.walk();
        dog.greetHuman();
        dog.bark();

        callMethods(cat);
        cat.walk();
        cat.greetHuman();
        cat.scratch();
        
        callMethods(raccoon);
        raccoon.scratch();

        callMethods(whale);
        whale.swim();

        System.out.println();
    }



    private static void callMethods(Animal animal) {
        System.out.println("\n\n**************************************");
        System.out.println(animal.toString());
        System.out.print("\nMaking sound: ");
        animal.sound();
        animal.eat();
        animal.sleep();
    }
}

/*
SAMPLE OUTPUT:

**************************************
Animal Type       : domesticated
Animal Name       : Scooby Doo
Age               : 2
Sex               : male
Living Environment: home
Moving Speed      : 40.00 mph

Making sound: "ruff ruff"
eating...
sleeping...
walking to kitchen
wagging tail to greet human!
barking at a stranger!!!


**************************************
Animal Type       : scratcher
Animal Name       : Tom
Age               : 3
Sex               : male
Living Environment: home
Moving Speed      : 30.00 mph

Making sound: "meow"
eating...
sleeping...
walking to living room
touching nose to greet human!
scratching table leg


**************************************
Animal Type       : scratcher
Animal Name       : Rocket
Age               : 4
Sex               : male
Living Environment: forest
Moving Speed      : 15.00 mph

Making sound: "hiss"
eating...
sleeping...
scratching other animal


**************************************
Animal Type       : swimmer
Animal Name       : Moby
Age               : 50
Sex               : female
Living Environment: ocean
Moving Speed      : 30.00 mph

Making sound: "groans"
eating...
sleeping...
swimming in the Artic ocean
*/