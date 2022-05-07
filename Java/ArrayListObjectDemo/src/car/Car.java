package car;

import java.io.Serializable;

public class Car implements Comparable<Car>, Serializable {

    private String make;
    private String model;
    private String year;
    private int odometer;

    public Car(String make) {
        this.make = make;
    }

    public Car(String make, String model, String year, int odometer) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.odometer = odometer;
    }

    public void display() {
        System.out.println("- " + getMake() + " " + getModel() + "\t\tYear: " + getYear());
        System.out.println("\t\t\t" + getOdometer() + " km travelled: \n");
    }
    
    public int compareTo(Car compareCar) {
        String compareMake = (compareCar.getMake());
        String compareModel = (compareCar.getModel());
        String compareYear = (compareCar.getYear());
        
        if (this.make.compareTo(compareMake) == 0) {
            if (this.model.compareTo(compareModel) == 0) {
                return this.year.compareTo(compareYear);
            } else 
            return this.model.compareTo(compareModel);
        } else         
        return this.make.compareTo(compareMake);
    }

    public String getMake() {
        return make;
    }

    /**
     * @param make the make to set
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the year
     */
    public String getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * @return the odometer
     */
    public int getOdometer() {
        return odometer;
    }

    /**
     * @param odometer the odometer to set
     */
    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }
}
