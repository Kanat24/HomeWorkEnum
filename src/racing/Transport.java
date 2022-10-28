package racing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public abstract class Transport {

    protected final String brand;
    protected final String model;
    protected final double engineVolume;
    private final List<Sponsor> sponsors = new ArrayList<>();
    private final List<Driver<?>> drivers = new ArrayList<>();
    private final List<Mechanic<?>>mechanics = new ArrayList<>();


    public Transport(String brand, String model, double engineVolume) {
        this.brand = ValidationUtils.validOrDefault(brand, "default");
        this.model = ValidationUtils.validOrDefault(model, "default");
       this.engineVolume = engineVolume>0.5 ? engineVolume : 1.5;
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }
    public void addDriver(Driver<?>...driver){
        this.drivers.addAll(Arrays.asList(driver));
    }
    public void addSponsor(Sponsor...sponsors){
        this.sponsors.addAll(Arrays.asList(sponsors));
    }
    public void addMechanic(Mechanic<?>...mechanics){
        this.mechanics.addAll(Arrays.asList(mechanics));
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    public List<Driver<?>> getDrivers() {
        return drivers;
    }

    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }

    public abstract void start();

    public  abstract void finish();

    public abstract boolean passDiagnostics();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume);
    }

}
