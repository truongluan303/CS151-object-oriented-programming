/**
 * Represents if an animal is a domesticated animal.
 * Domesticated animals will be able to walk and greet humans.
 */
public interface Domesticated {
    /**
     * Since domesticated animals live on land, they must
     * have the ability to walk.
     */
    public void walk();

    /**
     * Since a domesticated animal is a part of a human's
     * family, they will have the action of greeting human.
     */
    public void greetHuman();

} // end of Demosticated
