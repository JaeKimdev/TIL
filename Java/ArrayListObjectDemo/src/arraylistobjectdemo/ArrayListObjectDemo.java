package arraylistobjectdemo;

import car.Car;
import java.util.*;
import java.io.*;

public class ArrayListObjectDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean found = false;
        boolean loop = false;
        Vector<Car> cars = new Vector<>();

        System.out.println("Do you want load default data from file?(Press 'Y') or Start new file?(Press Any Key)");
        String select = sc.next();
        if (select.equalsIgnoreCase("y")) {
            System.out.println("Reading from file...");

            try {
                FileInputStream fileIn = new FileInputStream("carList.bin"); // binary file "result.bin"
                ObjectInputStream objectIn = new ObjectInputStream(fileIn); // input stream
                cars = (Vector) objectIn.readObject(); // read an object as Vector
                fileIn.close(); // close the file
            } catch (IOException err) { // handle IO exception
                System.err.println(err);
            } catch (ClassNotFoundException err) { // handle ClassNotFound exception
                System.err.println(err);
            }
            displayCars(cars);
        }

        while (!loop) {
            System.out.println(" ######################## ");
            System.out.println(" ##  1 - Add New Car   ## ");
            System.out.println(" ##  2 - Search Car    ## ");
            System.out.println(" ##  3 - Display Cars  ## ");
            System.out.println(" ##  4 - Save CarList  ## ");
            System.out.println(" ##  5 - Quit Program  ## ");
            System.out.println(" ######################## ");
            System.out.print("Please Select Menu: ");

            try {
                int numSelect = sc.nextInt();

                switch (numSelect) {
                    case 1:
                        System.out.print("What's name of make: ");
                        String newMake = sc.next();
                        System.out.print("What's name of model: ");
                        String newModel = sc.next();
                        System.out.print("What year of the car: ");
                        String newYear = sc.next();
                        System.out.print("What numbers of odometer: ");
                        int newOdo = sc.nextInt();
                        cars.add(new Car(newMake, newModel, newYear, newOdo));
                        Collections.sort(cars);
                        break;
                    case 2:
                        System.out.print("Please input Make to Search: ");
                        String target = sc.next();
                        for (Car car : cars) {
                            //System.out.println(car.getMake());
                            //System.out.println(car.getMake().hashCode());
                            //System.out.println(target.hashCode());
                            if (car.getMake().equals(target)) {
                                found = true;
                            }
                        }
                        if (found) {
                            System.out.println(target+ " found in the array");
                        } else {
                            System.out.println(target + " Not found in the array ");
                        }
                        found = false;
                        break;
                    case 3:
                        displayCars(cars);
                        break;
                    case 4:
                       try {
                        FileOutputStream fileOut = new FileOutputStream("carList.bin"); // binary file "result.bin"
                        ObjectOutputStream objectOut = new ObjectOutputStream(fileOut); // output stream
                        objectOut.writeObject(cars); // save the object in the binary file
                        fileOut.close(); // close the file
                        System.out.println("File Saved - carList.bin"); // user feedback
                    } catch (IOException e) { // catch if IO exceptions happen
                        System.out.println(e);
                    }
                    break;

                    case 5:
                        System.out.println("Bye~");
                        loop = true;
                        break;
                    default:
                        System.out.println("Error! Please input 1 ~ 5!");
                }

            } catch (InputMismatchException ex) {
                System.out.println("Error! Please input 1 ~ 5");
                break;
            }
        }
    }

    public static void displayCars(Vector<Car> cars) {
        Collections.sort(cars);
        for (Car c : cars) {
            c.display();
        }
    }
}
