class demo {

    public static void main(String[] args) {
        throw new IllegalArgumentException();
    }


    public static void func() throws NullPointerException {
        try
        {
            throw new NullPointerException("demo");
        }
        catch(NullPointerException e)
        {
            System.out.println("Caught inside fun().");
            throw e; // rethrowing the exception
        }
    }
}