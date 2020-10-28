import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        ArrayList<Vehicle>vehicles = new ArrayList<>();

        vehicles.add(new Vehicle("Motor", 20, 5));
        vehicles.add(new Car("Samochód osobowy", 50, 7,false));
        vehicles.add(new Truck("Ciężarówka", 100, 19, false, 150));

        System.out.println("Spalanie motoru to: " + vehicles.get(0).calculateFuelConsumption() + "l/100km");
        System.out.println("Z bakiem o pojemności " + vehicles.get(0).getTankCapacity() + "l pozwala mu to na przejechanie " + vehicles.get(0).calculateRange() + "km");

        System.out.println("Spalanie samochodu to: " + vehicles.get(1).calculateFuelConsumption() + "l/100km");
        System.out.println("Z bakiem o pojemności " + vehicles.get(1).getTankCapacity() + "l pozwala mu to na przejechanie " + vehicles.get(1).calculateRange() + "km");

        System.out.println("Spalanie ciężarówki to: " + vehicles.get(2).calculateFuelConsumption() + "l/100km");
        System.out.println("Z bakiem o pojemności " + vehicles.get(2).getTankCapacity() + "l pozwala jej to na przejechanie " + vehicles.get(2).calculateRange() + "km");

        Car car = (Car)vehicles.get(1);
        Truck truck = (Truck) vehicles.get(2);

        car.setAirConditionerOn(true);
        System.out.println("Po włączeniu klimatyzacji spalanie samochodu to: " + car.calculateFuelConsumption() + "l/100km");
        System.out.println("Z bakiem o pojemności " + car.getTankCapacity() + "l pozwala mu to na przejechanie " + car.calculateRange() + "km");

        truck.setAirConditionerOn(true);
        System.out.println("Po włączeniu klimatyzacji spalanie ciężarówki to: " + truck.calculateFuelConsumption() + "l/100km");
        System.out.println("Z bakiem o pojemności " + truck.getTankCapacity() + "l pozwala jej to na przejechanie " + truck.calculateRange() + "km");
    }
}
