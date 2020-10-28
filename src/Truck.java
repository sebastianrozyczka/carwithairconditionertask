public class Truck extends Car {
    private double loadWeight;

    public Truck(String name, double tankCapacity, double averageFuelConsumption, boolean airConditionerOn, double loadWeight) {
        super(name, tankCapacity, averageFuelConsumption, airConditionerOn);
        this.loadWeight = loadWeight;
    }

    public double getLoadWeight() {
        return loadWeight;
    }

    public void setLoadWeight(double loadWeight) {
        this.loadWeight = loadWeight;
    }

    @Override
    public double calculateFuelConsumption() {
        double averageFuelConsumption;
        double truckFuelConsumptionWithAirConditionerOn = getAverageFuelConsumption() + 1.6;
        double truckFuelConsumptionWithWeight = loadWeight * 0.5;
        if(isAirConditionerOn()) {
            if(loadWeight <= 0) {
                averageFuelConsumption = truckFuelConsumptionWithAirConditionerOn;
            } else {
                averageFuelConsumption = truckFuelConsumptionWithAirConditionerOn + truckFuelConsumptionWithWeight;
            }
        } else {
            averageFuelConsumption = super.calculateFuelConsumption() + truckFuelConsumptionWithWeight;
        }
        return averageFuelConsumption;
    }

    @Override
    public double calculateRange() {
        return super.calculateRange();
    }
}
