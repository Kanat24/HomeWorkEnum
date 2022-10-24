package racing;

import java.util.concurrent.ThreadLocalRandom;

class Car extends Transport implements Competing {
    public enum BodyType{SEDAN, HATCHBACK, COUPE, STATION_WAGON,
        SUV, CROSSOVER, PICKUP, VAN, MINIVAN;

        public static void defineBodyType(Car car, String type){
            BodyType bodyType = BodyType.valueOf(type);
            switch (bodyType){
                case SEDAN:
                    System.out.println("Тип кузова автомобиля "+ car+  "- Седан");
                    break;
                case HATCHBACK:
                    System.out.println("Тип кузова автомобиля "+ car+  "- Хетчбек");
                    break;
                case COUPE:
                    System.out.println("Тип кузова автомобиля "+ car+  "- Купе");
                    break;
                case STATION_WAGON:
                    System.out.println("Тип кузова автомобиля "+ car+  "- Универсал");
                    break;
                case SUV:
                    System.out.println("Тип кузова автомобиля "+ car+  "- Внедорожник");
                    break;
                case CROSSOVER:
                    System.out.println("Тип кузова автомобиля "+ car+  "- Кроссовер");
                    break;
                case PICKUP:
                    System.out.println("Тип кузова автомобиля "+ car+  "- Пикап");
                    break;
                case VAN:
                    System.out.println("Тип кузова автомобиля "+ car+  "- Фургон");
                    break;
                case MINIVAN:
                    System.out.println("Тип кузова автомобиля "+ car+  "- Минивен");
                    break;
                default:
                    System.out.println("Данных недостаточно");
            }
        }


        }



    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void start() {
        System.out.printf("Автомобиль %s, %s совершил старт\n", getBrand(), getModel());
    }

    @Override
    public void finish() {
        System.out.printf("Автомобиль %s, %s фигишировал\n", getBrand(), getModel());

    }


    @Override
    public void pitStop() {
        System.out.printf("Автомобиль %s, %s заехал на пит стоп\n", getBrand(), getModel());

    }

    @Override
    public double bestLapTime() {
        return ThreadLocalRandom.current().nextInt(1, 1000);
    }

    @Override
    public double maxSpeed() {
        return ThreadLocalRandom.current().nextInt(1, 350);
    }
}
