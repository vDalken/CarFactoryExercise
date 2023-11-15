import java.util.Random;
import java.util.ArrayList;

class Factory {
    static double funds = 3000000;
    public static final int DOUBLED_FUNDS = 6000000;
    public static ArrayList<Car> production() {
        ArrayList<Car> cars = new ArrayList<>();
        Random random = new Random();
        int randomNumber, otherRandomNumber;
        for (int i = 0; i < 100; i++) {
            randomNumber = random.nextInt(101);
            if (randomNumber <= 30) {
                otherRandomNumber = random.nextInt(101);
                if (otherRandomNumber <= 15) {
                    Car car = new Car(false, "SUV", 10000);
                    cars.add(car);
                    funds -= car.productionCost;
                } else {
                    Car car = new Car(true, "SUV", 10000);
                    cars.add(car);
                    funds += (car.productionCost * 0.2);
                }
            } else if (randomNumber <= 60) {
                otherRandomNumber = random.nextInt(101);
                if (otherRandomNumber <= 15) {
                    Car car = new Car(false, "desportivo", 10000);
                    cars.add(car);
                    funds -= car.productionCost;
                } else {
                    Car car = new Car(true, "desportivo", 10000);
                    cars.add(car);
                    funds += (car.productionCost * 0.2);
                }
            } else if (randomNumber <= 80) {
                otherRandomNumber = random.nextInt(101);
                if (otherRandomNumber <= 15) {
                    Car car = new Car(false, "offroad", 10000);
                    cars.add(car);
                    funds -= car.productionCost;
                } else {
                    Car car = new Car(true, "offroad", 10000);
                    cars.add(car);
                    funds += (car.productionCost * 0.2);
                }
            } else {
                otherRandomNumber = random.nextInt(101);
                if (otherRandomNumber <= 15) {
                    Car car = new Car(false, "triciclo", 10000);
                    cars.add(car);
                    funds -= car.productionCost;
                } else {
                    Car car = new Car(true, "triciclo", 10000);
                    cars.add(car);
                    funds += (car.productionCost * 0.2);
                }
            }
        }
        return cars;
    }

    public static void report() {
        System.out.println("The funds: " + (int) funds + " dollars");
    }

    public static boolean isDoubleFunds() {
        return !(funds >= DOUBLED_FUNDS);
    }

    public static boolean sufficientFunds() {
        if (funds <= 0) {
            return false;
        } else {
            return true;
        }
    }
}
