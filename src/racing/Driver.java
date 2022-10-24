package racing;

public abstract class Driver <T extends Transport> {
    private final String fullName;
    private final String category;
    private int experience;
    private T car;

    public void start(){
        System.out.printf("Водитель %s, совершил старт на автомобиле %s, %s\n", getFullName(), car.getBrand(), car.getModel());
    }
    public void stop(){
        System.out.printf("Водитель %s, остановился на автомобиле %s, %s\n", getFullName(), car.getBrand(), car.getModel());

    }
    public void refuelCar(){
        System.out.printf("Водитель %s, заправился на автомобиле %s, %s\n", getFullName(), car.getBrand(), car.getModel());

    }

    public String getFullName() {
        return fullName;
    }




    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Driver(String fullName, String category, int experience, T car) {
        this.fullName = fullName;
        this.category = category;
        this.experience = experience;
        this.car = car;
    }

    @Override
    public String toString() {
        return String.format("Водитель %s управляет автомобилем %s %s и будет участвовать в заезде", getFullName(),
                car.getBrand(), car.getModel());
    }
}
