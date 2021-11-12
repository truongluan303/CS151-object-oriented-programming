public abstract class Shape extends Thread {
    
    public abstract double computeArea();

    public abstract String getType();


    public void run() {
        synchronized (this) {
			System.out.println("Area of " + this.getType() + " is " + 
                                String.format("%.2f", this.computeArea()));
		};
    }



    public void start() {
        Thread thread = new Thread(this);
        thread.start();
    }
}
