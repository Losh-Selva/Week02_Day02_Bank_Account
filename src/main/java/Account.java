import java.time.LocalDate;

public class Account {
    private String name;
    private String surname;
    private int accountNumber;
    private   double balance;
    private LocalDate dateOfBirth;
    private String accountType;

    public Account (String name, String surname, int accountNumber, double balance, LocalDate dateOfBirth, String accountType) {
        this.name = name;
        this.surname = surname;
        this.accountNumber = accountNumber;
        this.balance = 0;
        this.dateOfBirth = dateOfBirth;
        this.accountType = accountType;

    }
    //Deposit
    public double deposit(double deposit) {
        balance = this.balance + deposit;
        System.out.println("Your current balance after deposit: "+ balance);
        return balance;
    }
    //Withdrawal
    public double withdrawal (double withdrawal) {
        balance = this.balance - withdrawal;
        System.out.println("Your current balance after withdrawal: "+ balance);
        return balance;
    }
    //Pay Interest
    public double payInterest () {
        if (accountType == "Business") {
             balance = (this.balance * 1.4);
        } else {
            balance = (this.balance * 1.2);
        }
        System.out.println("Your current balance after interest rate: "+ balance);
        return balance;


    }

    //GETTERS & SETTERS
    public String getName(){
        return this.name;
    }
    public void setName (String newName){
        this.name = newName;
    }

    public String getSurname(){
        return this.surname;
    }
    public void setSurname (String newSurname){
        this.surname = newSurname;
    }
    public int getAccountNumber(){
        return this.accountNumber;
    }
    public void setAccountNumber (int newAccountNumber){
        this.accountNumber = newAccountNumber;
    }
    public double getBalance(){
        return this.balance;
    }
    public void setBalance (double newBalance){
        this.balance = newBalance;
    }
    public LocalDate getDateOfBirth(){
        return this.dateOfBirth;
    }
    public void setName (LocalDate newDob){
        this.dateOfBirth = newDob;
    }

}
