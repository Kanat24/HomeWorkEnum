package racing;

import java.util.Objects;

public abstract class Driver <T extends Transport> {
    private final String fullName;
    private String category;
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

    public void setCategory(String category) {
        if (category==null){
            throw new RuntimeException("Необходимо ввести номер страховки");
        }
        this.category = category;
    }

    public Driver(String fullName, String category, int experience, T car) {
        this.fullName = fullName;
        setCategory(category);
        this.experience = experience;
        this.car = car;
    }

    @Override
    public String toString() {
        return String.format("Водитель %s управляет автомобилем %s %s и будет участвовать в заезде", getFullName(),
                car.getBrand(), car.getModel());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver<?> driver = (Driver<?>) o;
        return experience == driver.experience && Objects.equals(fullName, driver.fullName) && Objects.equals(category, driver.category) && Objects.equals(car, driver.car);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, category, experience, car);
    }
}
