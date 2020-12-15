package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int sizeOfBody;
    private String typeOfTruck;

    public Truck() {
    }

    public void setSizeOfBody(int sizeOfBody) {
        this.sizeOfBody = sizeOfBody;
    }

    public void setTypeOfTruck(String typeOfTruck) {
        this.typeOfTruck = typeOfTruck;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
