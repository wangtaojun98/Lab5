import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */

    public enum BankAccountType {
        CHECKINGS,
        SAVINGS,
        STUDENT,
        WORKPLACE
    }
    /**
     * balance
     */
    private int accountNumber;
    /**
     * balance
     */
    private BankAccountType accountType;
    /**
     * balance
     */
    private double accountBalance;
    /**
     * balance
     */
    private String ownerName;
    /**
     * balance
     */
    private double interestRate;
    /**
     * balance
     */
    private double interestEarned;
    /**
     * @param name d.
     * @param accountCategory d.
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        ownerName = name;
        accountType = accountCategory;

    }
    /**
     * getAccount Number
     */
    public int getAccountNumber() {
        return accountNumber;
    }
    /**
     * getOwnerName
     */
    public String getOwnerName() {
        return ownerName;
    }
    /**
     * balance
     */
    public double getAccountBalance() {
        return accountBalance;
    }
    /**
     * balance
     * @param setBalance d.
     */
    public void setAccountBalance(final double setBalance) {
        this.accountBalance += setBalance;
    }
    /**
     * set name
     * @param setOwnerName d.
     */
    public void setOwnerName(final String setOwnerName) {
        this.ownerName = setOwnerName;
    }
    /**
     * set number
     * @param setAccountNumber d.
     */
    public void setAccountNumber(final int setAccountNumber) {
        this.accountNumber = setAccountNumber;
    }
}
