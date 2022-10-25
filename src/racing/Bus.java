package racing;

import java.util.concurrent.ThreadLocalRandom;

class Bus extends Transport implements Competing{
    public enum СapacityBUS{VERY_SMALL(0,10), SMALL( 10,25), AVERAGE(40,50), BIG(60,80), VERY_BIG(100,120);
    private int numberAfter;
    private int numberBefore;

        СapacityBUS(int numberAfter, int numberBefore) {
            this.numberAfter = numberAfter;
            this.numberBefore = numberBefore;
        }

        public int getNumberAfter() {
            return numberAfter;
        }

        public void setNumberAfter(int numberAfter) {
            this.numberAfter = numberAfter;
        }

        public int getNumberBefore() {
            return numberBefore;
        }

        public void setNumberBefore(int numberBefore) {
            this.numberBefore = numberBefore;
        }
    }
    private СapacityBUS сapacityBUS;
    public Bus(String brand, String model, double engineVolume, СapacityBUS сapacityBUS) {
        super(brand, model, engineVolume);
        this.сapacityBUS= сapacityBUS;

    }

    @Override
    public void start() {
        System.out.printf("Автобус %s, %s совершил старт\n", getBrand(), getModel());

    }

    @Override
    public void finish() {
        System.out.printf("Автобус %s, %s финишировал\n", getBrand(), getModel());

    }

    @Override
    public boolean passDiagnostics() {
        System.out.println("Автобус "+ getBrand()+ " "+ getModel()+ "в диагностике не нуждается ");
        return true;
    }


    @Override
    public void pitStop() {
        System.out.printf("Автобус %s, %s заехал на пит стоп\n", getBrand(), getModel());

    }

    @Override
    public double bestLapTime() {
        return ThreadLocalRandom.current().nextInt(1, 1000);
    }

    @Override
    public double maxSpeed() {
        return ThreadLocalRandom.current().nextInt(1, 250);
    }
}
