package racing;

import java.util.concurrent.ThreadLocalRandom;

class Truck extends Transport implements Competing{
    public enum LoadСapacity {
        N1(0,3.5),
        N2(3.5,12),
        N3(12, 100);
        private double afterWeight;
        private double beforeWeight;

        LoadСapacity(double afterWeight, double beforeWeight) {
            this.afterWeight = afterWeight;
            this.beforeWeight = beforeWeight;
        }

        public double getAfterWeight() {
            return afterWeight;
        }

        public void setAfterWeight(double afterWeight) {
            this.afterWeight = afterWeight;
        }

        public double getBeforeWeight() {
            return beforeWeight;
        }

        public void setBeforeWeight(double beforeWeight) {
            this.beforeWeight = beforeWeight;
        }

        public static void defineBodyType(Truck car , double weight) {
            if (weight<=3.5){
                System.out.println("Грузовой автомобиль " + car+ " принадлежит категории " + N1);
            }
            else if (weight>3.5 && weight<=12){
                System.out.println("Грузовой автомобиль " + car+ " принадлежит категории " + N2);
            }
            else if (weight>12){
                System.out.println("Грузовой автомобиль " + car+ " принадлежит категории " + N3);
            }
            else System.out.println("данных по авто недостаточно");
        }
    }
    private LoadСapacity loadСapacity;
    public Truck(String brand, String model, double engineVolume, LoadСapacity loadСapacity) {
        super(brand, model, engineVolume);
        this.loadСapacity =loadСapacity;
    }

    @Override
    public void start() {
        System.out.printf("Грузовой автомобиль %s, %s стартовал\n", getBrand(), getModel());

    }

    @Override
    public void finish() {
        System.out.printf("Грузовой автомобиль %s, %s фигишировал\n", getBrand(), getModel());
    }

    @Override
    public boolean passDiagnostics() {
        return Math.random()>0.5;
    }

    @Override
    public void pitStop() {
        System.out.printf("Грузовой автомобиль %s, %s совершил пит стоп\n", getBrand(), getModel());

    }

    @Override
    public double bestLapTime() {
        return ThreadLocalRandom.current().nextInt(1, 1000);
    }

    @Override
    public double maxSpeed() {
        return ThreadLocalRandom.current().nextInt(1, 200);
    }
}
