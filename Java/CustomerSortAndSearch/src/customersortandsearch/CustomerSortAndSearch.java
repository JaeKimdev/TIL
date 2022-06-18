package customersortandsearch;

import java.util.*;

public class CustomerSortAndSearch {

    static int foundIndex;

    public static void main(String[] args) {

        boolean loop = false;
        boolean found = false;

        Scanner sc = new Scanner(System.in);
        ArrayList<Customer> customers = new ArrayList<>();

        customers.add(new Customer(5, "James", "0455-555-555", "james@smtafe.com.au"));
        customers.add(new Customer(2, "Kyle", "0422-222-222", "kyle@smtafe.com.au"));
        customers.add(new Customer(4, "Kris", "0444-444-444", "kris@smtafe.com.au"));
        customers.add(new Customer(1, "Jae", "0411-111-111", "jae@smtafe.com.au"));
        customers.add(new Customer(3, "Ally", "0433-333-333", "ally@smtafe.com.au"));

        for (int i = 0; i < customers.size(); i++) {
            System.out.println(customers.get(i).toString());
        }

        while (!loop) {
            System.out.print("Search Customer(1) or Sort List(2) or Quit Program(3) : ");

            try {
                int numSelect = sc.nextInt();
                switch (numSelect) {
                    case 1:
                        System.out.print("Enter a Customer id to Search : ");
                        int searchNum = sc.nextInt();

                        for (int i = 0; i < customers.size(); i++) {
                            if (customers.get(i).getId() == searchNum) {
                                found = true;
                                foundIndex = i;
                            }
                        }
                        if (found) {
                            System.out.println("Number(" + searchNum + ") is exist in Customer List.");
                            System.out.println(customers.get(foundIndex).toString());
                        } else {
                            System.out.println("Number(" + searchNum + ") is NOT found");
                        }
                        break;
                    case 2:
                        Collections.sort(customers);
                        for (Customer c : customers) {
                            System.out.println(c);
                        }
                        break;
                    case 3:
                        System.out.println("Bye~");
                        loop = true;
                        break;
                    default:
                        System.out.println("Error! Please input 1 ~ 3!");
                }

            } catch (InputMismatchException ex) {
                System.out.println("Error! Please input number ONLY");
                break;
            }
        }

    }
}
