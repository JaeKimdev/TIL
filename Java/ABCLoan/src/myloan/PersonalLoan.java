package myloan;

public class PersonalLoan extends Loan {

    /**
     * 
     * @param loanNum Loan Number
     * @param fname Customer First Name
     * @param lname Customer Last Name
     * @param amount Loan Amount
     * @param term Loan Term
     */
    public PersonalLoan(int loanNum, String fname, String lname, int amount, int term) {
        this.setLoanNum(loanNum);
        this.setCustomerName(fname +" " + lname);
        this.setAmountOfLoan(amount);
        this.setTerm(term);
        this.setInterestRate(CURRENT_PRIME_INTEREST_RATE + 2.0);
    }
/**
 * 
 * @return Return String type Result
 */
    @Override
    public String toString() {
        return "Loan Number: " + getLoanNum() + ", Name: " + getCustomerName() + "\n"
                + "Amount: $" + getAmountOfLoan() + ", Term: " + getTerm() + " year, Interest Rate: " + getInterestRate() + "%\n"
                + "Total amount at the due date: $" + (getAmountOfLoan() + (getTerm() * getAmountOfLoan() * getInterestRate() / 100));
    }

}
