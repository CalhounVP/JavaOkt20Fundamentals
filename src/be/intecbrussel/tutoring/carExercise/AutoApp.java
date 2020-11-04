package be.intecbrussel.tutoring.carExercise;

public class AutoApp {
    public static void main(String[] args) {
        Car car1 = new Car("purple");

        Car car2 = new Car();
        car2.setSpeed(70);
        car2.setLightsOn(true);

        Car car3 = new Car();
        car3.setEngine(200);

        //3. Autofuncties
        car1.rePaint("red");
        car2.speedUp(30);
        car3.toggleLights();

        System.out.println("Amount of cars made: " + Car.getCounter());



    }
}
