package racing;

import java.util.concurrent.ThreadLocalRandom;

class Truck extends Transport implements Competing{
    public enum LoadСapacity {
        N1(3.5),
        N2(12),
        N3(12);
        private double weight;
        LoadСapacity(double weight) {
            this.weight = weight;
        }

        public double getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public static void defineBodyType(Truck car ,double weight) {
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

    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
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
