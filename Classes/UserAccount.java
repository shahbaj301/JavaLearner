package classes;

public class UserAccount {

    private int accountno;
    private String acname;
    private String type;
    private int balance;
    private int userpin;

    // Default Constructor
    public UserAccount() {
    }

    // Parameterized Constructor
    public UserAccount(int accountno, String acname, String type, int balance, int userpin) {
        this.accountno = accountno;
        this.acname = acname;
        this.type = type;
        this.balance = balance;
        this.userpin = userpin;
    }

    // Getter and Setter for accountno
    public int getAccountno() {
        return accountno;
    }

    public void setAccountno(int accountno) {
        this.accountno = accountno;
    }

    // Getter and Setter for acname
    public String getAcname() {
        return acname;
    }

    public void setAcname(String acname) {
        this.acname = acname;
    }

    // Getter and Setter for type
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Getter and Setter for balance
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    // Getter and Setter for userpin
    public int getUserpin() {
        return userpin;
    }

    public void setUserpin(int userpin) {
        this.userpin = userpin;
    }

    // Display User Details
    public void displayUser() {
        System.out.println("Account Number : " + accountno);
        System.out.println("Name           : " + acname);
        System.out.println("Account Type   : " + type);
        System.out.println("Balance        : " + balance);
        System.out.println("PIN            : " + userpin);
    }
}