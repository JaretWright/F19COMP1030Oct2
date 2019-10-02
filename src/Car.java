import java.time.LocalDate;

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
        setYear(year);
        setOdometer(odometer);
    }

    /**
     * This method will return the Car as a String object
     */
    public String toString()
    {
        return colour + " " + make;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public int getYear() {
        return year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setYear(int year) {
        if (year >= 1886 && year <= LocalDate.now().getYear()+1)
            this.year = year;
        else
            this.year = LocalDate.now().getYear(); //default should throw an exception
                                                //but for now we will use a default
                                                //of the current year
    }

    public void setOdometer(int odometer) {
        //if the odometer is greater than or equal to 0, set the odometer
        //instance variable with the argument passed into the method
        if (odometer >= 0)
            this.odometer = odometer;
        else
            this.odometer=0; //set a default value.  Later in the course
                             //we will throw an IllegalArgumentException and see
                             //how to handle them
    }
}
