package racing;

import static racing.Truck.LoadСapacity.*;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "granta", 1.6, Car.BodyType.SEDAN);
        Car lada2 = new Car("Lada", "priora", 2.0, Car.BodyType.COUPE);
        Car bmw = new Car("Bmw", "x5", 4.0, Car.BodyType.HATCHBACK);
        Car toyota = new Car("Toyota", "Yaris", 1.3, Car.BodyType.MINIVAN);
        Truck bmwTruck = new Truck("Bmv", "Monster", 5.0, N1);
        Truck yazTruck = new Truck("Yaz", "Patron", 5.0, N2);
        Truck infinityTruck = new Truck("infinity", "Ganster", 0, N3);
        Truck lifanTruck = new Truck("Lifan", "Power", 5.0, N1);
        Bus ladaBus = new Bus("Lada", "M5", 3.0, Bus.СapacityBUS.VERY_SMALL);
        Bus cherryBus = new Bus("Cherry", "N33", 3.5, Bus.СapacityBUS.SMALL);
        Bus mercedesBus = new Bus("Mercedes", "z1", 4.0, Bus.СapacityBUS.BIG);
        Bus pazBus = new Bus("Paz", "mini", 2.0, Bus.СapacityBUS.VERY_BIG);
        DriverB ivanov = new DriverB("Ivanov Ivan Ivanovich", 5, toyota);
        System.out.println(ivanov);
        DriverC petrov = new DriverC("Petrov Peter Petrovich", 4, yazTruck);
        System.out.println(petrov);
        DriverD sidorov = new DriverD("Sidorov Sidor Sidorovich", 10, pazBus);
        System.out.println(sidorov);
        Car.BodyType.defineBodyType(bmw, "COUPE");
        Truck.LoadСapacity.defineBodyType(lifanTruck, 3);
        service(lada, lada2, bmw, toyota, bmwTruck, yazTruck, infinityTruck, lifanTruck, ladaBus, cherryBus, mercedesBus, pazBus);

    }
    private static void service(Transport ... transports){
        for (int i = 0; i <transports.length ; i++) {
if (!transports[i].passDiagnostics()){
    try {
        throw new RuntimeException("автомобиль " + transports[i].getBrand() + " " + transports[i].getModel() + " не прошел диагностику");
    }
    catch (RuntimeException e){
        System.out.println(e.getMessage());
    }
    }
        }
    }
}