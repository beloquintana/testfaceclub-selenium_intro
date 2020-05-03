package vehicle;

public class Car extends Vehicle {

    private String engineModel;

    public Car(String description, double velocity, double force, String engineModel) {
        super(description, velocity, force);
        this.engineModel = engineModel;
    }

    public String getEngineModel() {
        return engineModel;
    }

    public void setEngineModel(String engineModel) {
        this.engineModel = engineModel;
    }
}
