package myloan;

import java.util.Date;

/**
 * 
 * @author Jae Hyung Kim
 */
public abstract class Loan implements LoanConstants {

    private int id;
    private int loanNum;
    private String customerName;
    private int amountOfLoan;
    private double interestRate;
    private int term;
    private Date dueDate;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the loanNum
     */
    public int getLoanNum() {
        return loanNum;
    }

    /**
     * @param loanNum the loanNum to set
     */
    public void setLoanNum(int loanNum) {
        this.loanNum = loanNum;
    }

    /**
     * @return the customerName
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * @param customerName the customerName to set
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * @return the amountOfLoan
     */
    public int getAmountOfLoan() {
        return amountOfLoan;
    }

    /**
     * @param amountOfLoan the amountOfLoan to set
     */
    public void setAmountOfLoan(int amountOfLoan) {
        this.amountOfLoan = amountOfLoan;
    }

    /**
     * @return the interestRate
     */
    public double getInterestRate() {
        return interestRate;
    }

    /**
     * @param interestRate the interestRate to set
     */
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    /**
     * @return the term
     */
    public int getTerm() {
        return term;
    }

    /**
     * @param term the term to set
     */
    public void setTerm(int term) {
        this.term = term;
    }

    /**
     * @return the dueDate
     */
    public Date getDueDate() {
        return dueDate;
    }

    /**
     * @param dueDate the dueDate to set
     */
    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

}
