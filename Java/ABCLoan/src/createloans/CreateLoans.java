package createloans;

import myloan.PersonalLoan;
import myloan.BusinessLoan;
import myloan.Loan;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
import static myloan.LoanConstants.MAX_LOAN_AMOUNT;

/**
 * ABC Loan Management Application
 *
 * @author Jae Hyung Kim(30043320)
 * @version 1.02
 */
public class CreateLoans {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Loan> loans = new ArrayList<>();
    static int loanNum = 1;

    /**
     * main method Providing Menu and error trapping
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean loop = false;

        while (!loop) {
            System.out.println(" ######################### ");
            System.out.println(" ##  1 - Add New Loan   ## ");
            System.out.println(" ##  2 - Display Loans  ## ");
            System.out.println(" ##  3 - Delete Loan    ## ");
            System.out.println(" ##  4 - Quit Program   ## ");
            System.out.println(" ######################### ");
            System.out.print("Please Select Menu: ");

            try {
                int numSelect = sc.nextInt();

                switch (numSelect) {
                    case 1:
                        creatLoan();
                        break;
                    case 2:
                        displayLoans();
                        break;
                    case 3:
                        closeLoan();
                        break;
                    case 4:
                        System.out.println("Bye~");
                        loop = true;
                        break;
                    default:
                        System.out.println("Error! Please input 1 ~ 4!");
                }

            } catch (InputMismatchException ex) {
                System.out.println("Error! Please input number ONLY");
                break;
            }
        }
    }

    /**
     * Creat Loan method
     *
     */
    public static void creatLoan() {

        String name;
        String fname;
        String lname;
        int amount;
        int term;

        System.out.print("Business Loan(1) or Personal Loan(2)? : ");

        try {
            int type = sc.nextInt();

            if (type == 1) {
                System.out.print("What is Your Business Name? ");
                name = sc.next();
                System.out.print("How much do you want to loan?($): ");
                amount = sc.nextInt();
                if (amount > MAX_LOAN_AMOUNT) {
                    System.out.println("Error! - Loan amount is over the maximum amount($250,000)");
                    System.out.print("Please input less than $250,000 :");
                    amount = sc.nextInt();
                }
                System.out.print("How many years do you want use? (1, 3, 5) : ");
                term = sc.nextInt();
                if (term == 1 || term == 3 || term == 5) {
                } else {
                    System.out.println("Error! Please input 1, 3, 5 : ");
                    term = sc.nextInt();
                }

                BusinessLoan bLoan = new BusinessLoan(loanNum, name, amount, term);
                loans.add(bLoan);
                loanNum++;

            } else if (type == 2) {
                System.out.print("What is Your First Name? ");
                fname = sc.next();
                System.out.print("What is Your Last Name? ");
                lname = sc.next();
                System.out.print("How much do you want to loan?($): ");
                amount = sc.nextInt();
                if (amount > MAX_LOAN_AMOUNT) {
                    System.out.println("Error! - Loan amount is over the maximum amount($250,000)");
                    System.out.print("Please input less than $250,000 :");
                    amount = sc.nextInt();
                }
                System.out.print("How many years do you want use? (1, 3, 5) : ");
                term = sc.nextInt();
                if (term == 1 || term == 3 || term == 5) {
                } else {
                    System.out.println("Error! Please input 1, 3, 5 : ");
                    term = sc.nextInt();
                }

                PersonalLoan pLoan = new PersonalLoan(loanNum, fname, lname, amount, term);
                loans.add(pLoan);
                loanNum++;

            } else {
                System.out.println("Wrong input. Please try again.");
            }
        } catch (Exception ex) {
            System.out.println("Invalid input. Please try again.");
        }
    }

    /**
     * Display loans method
     */
    public static void displayLoans() {
        if (loans.size() == 0) {
            System.out.println("\n # There is no current loans # \n");
        } else {
            for (int i = 0; i < loans.size(); i++) {
                System.out.println(loans.get(i).toString());
                System.out.println();
            }
        }
    }

    /**
     * Close loan method
     *
     */
    public static void closeLoan() {

        System.out.print("Enter Loan number to delete: ");
        loanNum = sc.nextInt();
        for (int i = 0; i < loans.size(); i++) {
            if ((int) loans.get(i).getLoanNum() == loanNum) {
                loans.remove(i);
                System.out.println("Selected loan closed!");
            }
        }
        if (loanNum > loans.size()) {
            System.out.println("Wrong number! please check loan number!");
        }
    }
}
