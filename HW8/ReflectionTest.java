import java.lang.reflect.*;



public class ReflectionTest {

    public static void main(String[] args) {

        System.out.println("\n\nPerson class declared methods:");
        printMethods(Person.class, true);

        System.out.println("\n\nAddress class all methods:");
        printMethods(Address.class, false);

        System.out.println("\n\nAddress class fields:");
        printFields(Address.class);

        try {

            Constructor<Address> addressConstructor = Address.class.getConstructor(
                int.class, String.class, String.class, String.class, String.class);

            Address address1 = (Address)addressConstructor.newInstance(2222, "Street Str", "Los Angeles", "90001", "CA");
            Address address2 = (Address)addressConstructor.newInstance(2222, "Boulevard Blv", "Austin", "73301", "TX");
            Address address3 = (Address)addressConstructor.newInstance(3333, "Road Rd", "Austin", "73301", "TX");

            Constructor<Person> personConstructor = Person.class.getConstructor(
                String.class, String.class, int.class, String.class, Address.class);

            Person person1 = (Person)personConstructor.newInstance("Johnny", "Depp", 58, "123-123-1234", address1);
            Person person2 = (Person)personConstructor.newInstance("Amber", "Heard", 35, "321-321-4321", address2);
            Person person3 = (Person)personConstructor.newInstance("Elon", "Musk", 50, "111-111-1111", address3);

            System.out.println("\n\nPerson 1:" + person1.toString());
            System.out.println("Person 2:" + person2.toString());
            System.out.println("Person 3:" + person3.toString());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }




    
    /**
     * Print out all constructors of a class
     * @param myClass the class which constructors will be printed
     */
    public static void printConstructors(Class myClass)
    {
        Constructor[] constructors = myClass.getDeclaredConstructors();

        for (Constructor c : constructors)
        {
            String name = c.getName();
            System.out.print("\t");
            String modifiers = Modifier.toString(c.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");    
            }     
            System.out.print(name + "(");

            Class[] paramTypes = c.getParameterTypes();
            for (int j = 0; j < paramTypes.length; j++)
            {
                if (j > 0) System.out.print(", ");
                System.out.print(paramTypes[j].getSimpleName());
            }
            System.out.println(");");
        }
    }




    /**
    * Print out all methods of a class
    * @param myClass the class which methods will be printed
    */
    public static void printMethods(Class myClass, boolean isDeclared)
    {
        Method[] methods;

        if (!isDeclared) {
            methods = myClass.getMethods();
        }
        else {
            methods = myClass.getDeclaredMethods();
        }

        for (Method m : methods)
        {
            Class retType = m.getReturnType();
            String name = m.getName();

            System.out.print("\t");

            // print modifiers, return type and method name
            String modifiers = Modifier.toString(m.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");         
            }
            System.out.print(retType.getSimpleName() + " " + name + "(");

            // print parameter types
            Class[] paramTypes = m.getParameterTypes();
            for (int j = 0; j < paramTypes.length; j++)
            {
                if (j > 0) System.out.print(", ");
                System.out.print(paramTypes[j].getName());
            }
            System.out.println(");");
        }
    }




    /**
    * Print out all the fields of a class
    * @param myClass the class which fields will be printed
    */
    public static void printFields(Class myClass)
    {
        Field[] fields = myClass.getDeclaredFields();

        for (Field f : fields)
        {
            Class type = f.getType();
            String name = f.getName();
            System.out.print("\t");
            String modifiers = Modifier.toString(f.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");         
            }
            System.out.println(type.getSimpleName() + " " + name + ";");
        }
    }
}