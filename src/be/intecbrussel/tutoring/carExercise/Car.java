package be.intecbrussel.tutoring.carExercise;

public class Car {
    //__________________________________Properties__________________________________
    private static int counter = 0;

    private int speed;
    private int engine;
    private String color;
    private boolean isLightsOn;

    //_________________________________Constructors_________________________________
    public Car() {
        this(0, 100, "white", false);
    }

    public Car(String color) {
        this(0, 100, color, false);
    }

    public Car(int engine) {
        this(0,engine,"white",false);
    }

    public Car(int speed, int engine, String color, boolean isLightsOn) {
        this.speed = speed;
        this.engine = engine;
        this.color = color;
        this.isLightsOn = isLightsOn;
        counter++;
    }

    //____________________________________Methods___________________________________
    //************************************setters***********************************

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    private void setColor(String color) {
        this.color = color;
    }

    public void setLightsOn(boolean lightsOn) {
        isLightsOn = lightsOn;
    }


    //************************************getters***********************************

    public int getSpeed() {
        return speed;
    }

    public int getEngine() {
        return engine;
    }

    public String getColor() {
        return color;
    }

    public boolean isLightsOn() {
        return isLightsOn;
    }

    public static int getCounter() {
        return counter;
    }

    //********************************Instance  Method******************************
    public void slowDown(int speedDifference) {
        this.speed = speed-speedDifference<0?0:speed-speedDifference;
        System.out.println("The car is now driving at " + speed + " km/h");
    }

    public void speedUp(int speedDifference){
        this.speed += speedDifference;
        System.out.println("The car is now driving at " + speed + " km/h");
    }

    public void park() {
        this.speed = 0;
        this.isLightsOn = false;
        System.out.println("Car is parked, lights are off");
    }

    public void rePaint(String color) {
        int cost = 0;

        for (char c: color.toCharArray()) {
            cost += c;
        }

        System.out.println("This paint job will cost: " + cost);
        System.out.println("The car was " + this.color);
        this.color = color;
        System.out.println("This car is now painted " + color);
    }

    public void toggleLights() {
        this.isLightsOn = !isLightsOn;
        System.out.println("Are the lights on? " + isLightsOn);
    }




}
