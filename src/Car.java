public class Car {

    private String make;
    private String model;
    private int mileage;

    public Car(String make, String model, int mileage) {
        if (mileage < 0) {
            throw new IllegalArgumentException("Invalid Mileage Initialization: Mileage cannot be negative");
        }
        this.make = make;
        this.model = model;
        this.mileage = mileage;
    }

    public void setMake(String cMake) {
        make = cMake;
    }

    public String getMake() {
        return make;
    }

    public void setModel(String cModel) {
        model = cModel;
    }

    public String getModel() {
        return model;
    }

    public void setMileage(int cMileage) {
        if (cMileage > 0) {
            mileage = cMileage;
        } else {
            System.out.println("Mileage cannot be negative");
        }
    }

    public int getMileage() {
        return mileage;
    }

    public static void main(String[] args) {
        Car car = new Car("", "", 0);  // Initializing with empty strings and 0 mileage
        car.setMake("Toyota");
        car.setModel("Prius");
        car.setMileage(57);
        System.out.println("Make : " + car.getMake() + " | Model : " + car.getModel() + " | Mileage : " + car.getMileage() + "mpg");
        car.setMake("Honda");
        car.setModel("Insight");
        car.setMileage(52);
        System.out.println("Updated =>  Make : " + car.getMake() + " | Model : " + car.getModel() + " | Mileage : " + car.getMileage() + "mpg");
    }
}
