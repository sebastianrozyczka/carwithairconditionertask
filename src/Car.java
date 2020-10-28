public class Car extends Vehicle {
    private boolean airConditionerOn;

    public Car(String name, double tankCapacity, double averageFuelConsumption, boolean airConditionerOn) {
        super(name, tankCapacity, averageFuelConsumption);
        this.airConditionerOn = airConditionerOn;
    }

    public boolean isAirConditionerOn() {
        return airConditionerOn;
    }

    public void setAirConditionerOn(boolean airConditionerOn) {
        this.airConditionerOn = airConditionerOn;
    }

    @Override
    public double calculateFuelConsumption() {
        double averageFuelConsumption;
        if(airConditionerOn) {
           averageFuelConsumption = carFuelConsumption(); }
         else {
            averageFuelConsumption = super.calculateFuelConsumption(); }
         return averageFuelConsumption;
    }

    private double carFuelConsumption() {
        return getAverageFuelConsumption() + 0.8;
    }

    @Override
    public double calculateRange() {
        return super.calculateRange();
    }
}
