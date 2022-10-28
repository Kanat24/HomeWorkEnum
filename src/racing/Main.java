package racing;

import java.util.ArrayList;
import java.util.List;

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
        List<Transport> transportCar = new ArrayList<>();
        transportCar.add(lada);
        transportCar.add(lada2);
        transportCar.add(bmw);
        transportCar.add(toyota);
        transportCar.add(bmwTruck);
        transportCar.add(yazTruck);
        transportCar.add(infinityTruck);
        transportCar.add(lifanTruck);
        transportCar.add(ladaBus);
        transportCar.add(cherryBus);
        transportCar.add(mercedesBus);
        transportCar.add(pazBus);
        System.out.println(transportCar.size());

        Sponsor sponsor1 = new Sponsor("Motors group", 500);
        Sponsor sponsor2 = new Sponsor("auto parts store", 1000);
        Sponsor sponsor3 = new Sponsor("Rudnev Sergey", 1500);
        Mechanic<Car> mechanic1= new Mechanic<>("Stromov Renat", "Aiaks");
        Mechanic<Transport> mechanic2 = new Mechanic<>("Isnov Ivan", "Albatros");

        lada.addDriver(ivanov);
        bmwTruck.addDriver(petrov);
        pazBus.addDriver(sidorov);
        lada.addMechanic(mechanic1);
        bmwTruck.addMechanic(mechanic2);
        pazBus.addMechanic(mechanic2);
        lada.addSponsor(sponsor2, sponsor1);
        bmwTruck.addSponsor(sponsor3);
        pazBus.addSponsor(sponsor2, sponsor1, sponsor3);
        System.out.println(pazBus);
        System.out.println(bmwTruck);
        System.out.println(lada);
        ServiceStation serviceStation = new ServiceStation();
        serviceStation.addTruck(bmwTruck);
        serviceStation.addCar(lada);
        serviceStation.spendTechnicalInspection();
        serviceStation.spendTechnicalInspection();
         for (Transport transport: transportCar){
             printAuto(transport);
         }

    }

    public static void printAuto(Transport transport){
        System.out.println(transport.getBrand()+ transport.getModel());
        System.out.println(transport.getDrivers());
        System.out.println(transport.getMechanics());
        System.out.println(transport.getSponsors());
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