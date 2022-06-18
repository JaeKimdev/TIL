package myloan;

public class BusinessLoan extends Loan {

    /**
     * 
     * @param loanNum automated gerarate loan number
     * @param name Cutomer Name
     * @param amount Loan amount
     * @param term Loan term
     */
    public BusinessLoan(int loanNum, String name, int amount, int term) {
        this.setLoanNum(loanNum);
        this.setCustomerName(name);
        this.setAmountOfLoan(amount);
        this.setTerm(term);
        this.setInterestRate(CURRENT_PRIME_INTEREST_RATE + 1.0);
    }

    /**
     * 
     * @return Return string type Result
     */
    @Override
    public String toString() {
        return "Loan Number: " + getLoanNum() + ", Company Name: " + getCustomerName() + "\n"
                + "Loan Amount: " + getAmountOfLoan() + "($), Term: " + getTerm() + " year, Interest Rate: " + getInterestRate() + "%\n"
                + "Total amount at the due date: $" + (getAmountOfLoan() + (getTerm() * getAmountOfLoan() * getInterestRate() / 100));
    }
}
