import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfDays = 0;
        String userInputNumber;
        ArrayList<Car> cars;
        do {
            System.out.println("1- production day\n2- report\n0- leave");
            userInputNumber = scanner.next();
            switch (userInputNumber) {
                case "1":
                    if (Factory.isDoubleFunds() && Factory.sufficientFunds() && numberOfDays != 30) {
                        cars = Factory.production();
                        for (Car car : cars) {
                            System.out.println(car);
                        }
                        numberOfDays++;
                        System.out.println("This is day number " + numberOfDays);
                    } else {
                        if (numberOfDays == 30) {
                            System.out.println("The factory is shutdown because you exceeded the 30 days");
                        } else if (!Factory.isDoubleFunds()) {
                            System.out.println("The factory is shutdown because you duplicated your funds, congrats");
                        } else {
                            System.out.println("The factory is shutdown because you lost all your funds");
                        }
                    }
                    break;
                case "2":
                    Factory.report();
                    break;
                case "0":
                    break;
                default:
                    System.out.println("Option doesn't exist");
                    break;
            }
        } while (!(userInputNumber.equals("0")));
        System.out.println("Bye, see you next time");
    }
}
