public class Car {
    //these are the private "instance" variables
    private String make, model, colour;
    private int year, odometer;

    /**
     * This is the constructor. When called, it will create an instance
     * of a Car object in the system memory
     */
    public Car(String make, String model, String colour, int year, int odometer)
    {
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.year = year;
        this.odometer = odometer;
    }

}
