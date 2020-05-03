package vehicle;

public abstract class Vehicle {
    protected String description;
    protected double velocity;
    protected double force;

    public Vehicle(String description, double velocity, double force){
        this.description = description;
        this.velocity = velocity;
        this.force = force;
    }

    public double calculatePower(){
        return force * velocity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getVelocity() {
        return velocity;
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    public double getForce() {
        return force;
    }

    public void setForce(double force) {
        this.force = force;
    }
}
