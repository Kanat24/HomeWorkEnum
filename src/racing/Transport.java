package racing;

public abstract class Transport {

    protected final String brand;
    protected final String model;
    protected final double engineVolume;


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

}
